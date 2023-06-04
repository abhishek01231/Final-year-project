package com.example.leafdetectionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class ActivityFertilizer extends AppCompatActivity {

    private CardView npkCard;
    private CardView dapCard;
    private CardView sspCard;
    private CardView mopCard;
    private CardView nitroCard;
    private CardView ammoniaCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizer);

        npkCard = (CardView)findViewById(R.id.npk_card_id);
        dapCard = (CardView)findViewById(R.id.dap_card_id);
        sspCard = (CardView)findViewById(R.id.ssp_card_id);
        mopCard = (CardView)findViewById(R.id.mop_card_id);
        nitroCard = (CardView)findViewById(R.id.nitro_id);
        ammoniaCard = (CardView)findViewById(R.id.ammonia_id);

        npkCard.setOnClickListener(v->{
            Intent intent = new Intent(this, NpkFertilizerActivity.class);
            startActivity(intent);
        });

        dapCard.setOnClickListener(v->{
            Intent intent = new Intent(this, DapFertilizerActivity.class);
            startActivity(intent);
        });

        sspCard.setOnClickListener(v->{
            Intent intent = new Intent(this, SspFertilizerActivity.class);
            startActivity(intent);
        });

        mopCard.setOnClickListener(v->{
            Intent intent = new Intent(this, MopFertilizerActivity.class);
            startActivity(intent);
        });

        nitroCard.setOnClickListener(v->{
            Intent intent = new Intent(this, NitroFertilizerActivity.class);
            startActivity(intent);
        });

        ammoniaCard.setOnClickListener(v->{
            Intent intent = new Intent(this, AmmoniumFertilizerActivity.class);
            startActivity(intent);
        });
    }
}