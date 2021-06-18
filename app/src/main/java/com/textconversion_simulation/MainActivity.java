package com.textconversion_simulation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;



import gr.net.maroulis.library.EasySplashScreen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasySplashScreen config = new EasySplashScreen(MainActivity.this)
                .withFullScreen()
                .withTargetActivity(TextConverter.class)
                .withSplashTimeOut(3000)
                .withBackgroundColor(Color.parseColor("#1a1b29"))
              .withFooterText("Convert text and see behind solution.")
                .withAfterLogoText("Bytext")
                .withLogo(R.mipmap.ic_launcher_round);


        config.getAfterLogoTextView().setPadding(0,20,0,0);
        config.getAfterLogoTextView().setTextColor(Color.WHITE);
        config.getFooterTextView().setTextColor(Color.WHITE);

      View easySplashScreen = config.create();
      setContentView(easySplashScreen);
    }
}