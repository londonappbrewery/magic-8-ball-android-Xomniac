package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.button_ask);
        final ImageView BALL_DISPLAY = findViewById(R.id.image_eightBall);
        final int[] BALL_ARRAY = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BALL_DISPLAY.setImageResource(BALL_ARRAY[generateRandomNumber(BALL_ARRAY.length)]);
            }
        });
    }

    private int generateRandomNumber(int ballArrayLength) {
        Random randomNumberGenerator = new Random();
        return randomNumberGenerator.nextInt(ballArrayLength);
    }
}
