package com.example.weatherapp_mvvm.view.activity;

import static com.example.weatherapp_mvvm.Constants.BLUR_RADIUS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.example.weatherapp_mvvm.Model.TempForecast;
import com.example.weatherapp_mvvm.R;
import com.example.weatherapp_mvvm.view.adapter.ForecastAdapter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.util.ArrayList;

import eightbitlab.com.blurview.BlurAlgorithm;
import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderEffectBlur;
import eightbitlab.com.blurview.RenderScriptBlur;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    BlurView bvBottomSheet;
    private ViewGroup root;
    private RecyclerView rvHourlyForecast;
    private ArrayList<TempForecast> forecastList = new ArrayList<>();
    private ConstraintLayout bottomSheet;
    private BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior;
    private NestedScrollView svWeatherDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        getForecastData();
        setAdapter();
        setupBlurView();

    }

    private void init() {
        bvBottomSheet = findViewById(R.id.bv_bottom_sheet);
        bottomSheet = findViewById(R.id.bottomSheet);
        rvHourlyForecast = findViewById(R.id.rv_hour_forecast);
        svWeatherDetails = findViewById(R.id.sv_weather_details);
//        svWeatherDetails.setNestedScrollingEnabled(false);

        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
//        bottomSheetBehavior.setPeekHeight(300);
        bottomSheetBehavior.setHideable(false);

        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                if (newState == BottomSheetBehavior.STATE_COLLAPSED) {
//                    svWeatherDetails.setNestedScrollingEnabled(false);
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                Log.d(TAG, "onSlide: slideOffset" + slideOffset + "");
//                svWeatherDetails.setNestedScrollingEnabled(true);
            }
        });
    }

    private void getForecastData() {
        // TODO need to get from server

        forecastList.add(new TempForecast("12:00", "15", "19", false));
        forecastList.add(new TempForecast("13:00", "20", "20", true));
        forecastList.add(new TempForecast("14:00", "35", "21", false));
        forecastList.add(new TempForecast("15:00", "80", "17", false));
        forecastList.add(new TempForecast("16:00", "50", "19", false));
        forecastList.add(new TempForecast("17:00", "35", "23", false));
        forecastList.add(new TempForecast("18:00", "15", "28", false));
        forecastList.add(new TempForecast("19:00", "14", "30", false));
        forecastList.add(new TempForecast("20:00", "78", "18", false));
    }

    private void setAdapter() {
        rvHourlyForecast.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        ForecastAdapter forecastAdapter = new ForecastAdapter(this, forecastList);
        rvHourlyForecast.setAdapter(forecastAdapter);
    }

    private void setupBlurView() {
        View decorView = getWindow().getDecorView();
        root = decorView.findViewById(android.R.id.content);

        //set background, if your root layout doesn't have one
        final Drawable windowBackground = getWindow().getDecorView().getBackground();
        BlurAlgorithm algorithm = getBlurAlgorithm();

        bvBottomSheet.setClipToOutline(true);
        bvBottomSheet.setupWith(root, algorithm)
                .setFrameClearDrawable(windowBackground)
                .setBlurRadius(BLUR_RADIUS);

    }

    @NonNull
    private BlurAlgorithm getBlurAlgorithm() {
        BlurAlgorithm algorithm;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            algorithm = new RenderEffectBlur();
        } else {
            algorithm = new RenderScriptBlur(this);
        }
        return algorithm;
    }
}