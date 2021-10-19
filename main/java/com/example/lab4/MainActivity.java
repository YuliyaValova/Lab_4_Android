package com.example.lab4;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {
    private Button synhr;
    private Button asynhr;
    private ImageView image1;
    private ImageView image2;
    private SeekBar bar;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewsInit();
        setListeners();

    }


    private void setListeners() {
        synhr.setOnClickListener(view->{
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation2);
            int duration = bar.getProgress();
            animation.setDuration(duration);
            image1.startAnimation(animation);
            image2.startAnimation(animation);
        });

        asynhr.setOnClickListener(view->{
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation2);
            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation);
            int duration = bar.getProgress();
            animation1.setDuration(duration);
            animation2.setDuration(duration/2);
            image1.startAnimation(animation1);
            image2.startAnimation(animation2);
        });
    }

    private void viewsInit() {
        synhr = findViewById(R.id.syn);
        asynhr = findViewById(R.id.asyn);
        image1 = findViewById(R.id.imageView1);
        image2 = findViewById(R.id.imageView2);
        bar = findViewById(R.id.seekBar);
    }

}

