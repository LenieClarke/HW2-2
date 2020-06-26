package com.example.hw2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView imageLink = findViewById(R.id.imageLink);
        Random random = new Random();
        String imageNumber = String.valueOf(random.nextInt(100));
        imageLink.setText(getString(R.string.imgLink, imageNumber));
        init();
    }

    private void init() {
        Button buttonAhead = findViewById(R.id.buttonAhead);
        Button buttonBack = findViewById(R.id.buttonBack);

        buttonAhead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        MainActivity.class); //создание Intent
                startActivity(intent); //запуск нового экрана
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}