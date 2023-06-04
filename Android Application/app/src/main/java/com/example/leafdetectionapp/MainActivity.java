package com.example.leafdetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button english_button = findViewById(R.id.buttonEnglish);
        english_button.setOnClickListener(v->{
            LocaleManager.setNewLocale(this,"en");
            recreate();
            Intent intent = new Intent(this, ActivityHome.class);
            startActivity(intent);
        });

        Button hindi_button = findViewById(R.id.buttonHindi);
        hindi_button.setOnClickListener(v->{
            LocaleManager.setNewLocale(this,"hi");
            recreate();
            Intent intent = new Intent(this, ActivityHome.class);
            startActivity(intent);
        });

        Button kannada_button = findViewById(R.id.buttonKannada);
        kannada_button.setOnClickListener(v->{
            LocaleManager.setNewLocale(this,"kn");
            recreate();
            Intent intent = new Intent(this, ActivityHome.class);
            startActivity(intent);
        });

    }
}