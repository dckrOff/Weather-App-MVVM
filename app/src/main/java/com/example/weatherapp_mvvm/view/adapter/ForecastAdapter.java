package com.example.weatherapp_mvvm.view.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp_mvvm.Model.Forecast.Forecast;
import com.example.weatherapp_mvvm.R;

import java.util.ArrayList;

import eightbitlab.com.blurview.BlurView;


public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.MyViewHolder> {

    private final String TAG = "ForecastAdapter";
    private final LayoutInflater inflater;
    private ArrayList<Forecast> forecast;

    public ForecastAdapter(Context context, ArrayList<Forecast> forecast) {
        this.forecast = forecast;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_forecast, parent, false);
        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Forecast forecast = this.forecast.get(position);

//        holder.tvHourOrWeek.setText(forecast.getTime());
//        holder.tvHumidity.setText(forecast.getHumidity() + "%");
//        holder.tvDegree.setText(forecast.getDegree() + "°");
//        if (forecast.isNow())
//            holder.itemBg.setBackgroundColor(Color.parseColor("#48319D"));

//        setupBlurView(holder.itemBg, holder.bvForecast);


    }

    @Override
    public int getItemCount() {
        return forecast.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvHourOrWeek, tvHumidity, tvDegree;
        ImageView ivWeatherType;
        LinearLayout itemBg;
        BlurView bvForecast;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvHourOrWeek = itemView.findViewById(R.id.tv_hour_or_week);
            tvHumidity = itemView.findViewById(R.id.tv_humidity);
            tvDegree = itemView.findViewById(R.id.tv_degree);
            ivWeatherType = itemView.findViewById(R.id.iv_weather_type);
            itemBg = itemView.findViewById(R.id.item_hw_bg);
            bvForecast = itemView.findViewById(R.id.bv_forecast);

        }
    }

//    private void setupBlurView(View rootView, BlurView blurView) {
////        View decorView = getWindow().getDecorView();
////        ViewGroup root = rootView.findViewById(android.R.id.content);
//        ViewGroup root = (ViewGroup) rootView;
//
//        //set background, if your root layout doesn't have one
//        final Drawable windowBackground = rootView.getBackground();
//        BlurAlgorithm algorithm = getBlurAlgorithm();
//
//        blurView.setClipToOutline(true);
//        blurView.setupWith(root, algorithm)
//                .setFrameClearDrawable(windowBackground)
//                .setBlurRadius(BLUR_RADIUS);
//    }
//
//    @NonNull
//    private BlurAlgorithm getBlurAlgorithm() {
//        BlurAlgorithm algorithm;
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
//            algorithm = new RenderEffectBlur();
//        } else {
//            algorithm = new RenderScriptBlur(inflater.getContext());
//        }
//        return algorithm;
//    }
}
