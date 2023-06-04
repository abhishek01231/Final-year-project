package com.example.leafdetectionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;




public class ActivityCultivation extends AppCompatActivity {
   CardView b2,b1,b3,b4,b12,b6,b7,b8,b10,b11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultivation);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button33);
        b4=findViewById(R.id.button44);
        b12=findViewById(R.id.buttongarlic);
        b6=findViewById(R.id.button66);
b7=findViewById(R.id.button5);
b8=findViewById(R.id.button7);
b10=findViewById(R.id.button10);
b11=findViewById(R.id.button11);



        b1.setOnClickListener(v -> {
            Intent intent = new Intent(this, com.example.leafdetectionapp.MainActivity2.class);
            startActivity(intent);



        });

        b2.setOnClickListener(v -> {

            Intent intent = new Intent(this, com.example.leafdetectionapp.TipsActivity2.class);
            startActivity(intent);



        });

        b3.setOnClickListener(v -> {
            Intent intent = new Intent(this, com.example.leafdetectionapp.TipsActivity3.class);
            startActivity(intent);



        });

        b4.setOnClickListener(v -> {
            Intent intent = new Intent(this, com.example.leafdetectionapp.Tipsactivity4.class);
            startActivity(intent);



        });


        b6.setOnClickListener(v -> {
            Intent intent = new Intent(this, com.example.leafdetectionapp.TipsActivity6.class);
            startActivity(intent);



        });
        b7.setOnClickListener(v -> {
            Intent intent = new Intent(this, com.example.leafdetectionapp.TipsActivity7.class);
            startActivity(intent);



        });
        b8.setOnClickListener(v -> {
            Intent intent = new Intent(this, com.example.leafdetectionapp.TipsActivity12.class);
            startActivity(intent);



        });

        b10.setOnClickListener(v -> {

            Intent intent = new Intent(this, com.example.leafdetectionapp.TipsActivity10.class);
            startActivity(intent);



        });


        b11.setOnClickListener(v -> {

            Intent intent = new Intent(this, com.example.leafdetectionapp.TipsActivity11.class);
            startActivity(intent);



        });


        b12.setOnClickListener(v -> {

            Intent intent = new Intent(this, com.example.leafdetectionapp.TipsActivitygarlic.class);
            startActivity(intent);
        });

    }
}