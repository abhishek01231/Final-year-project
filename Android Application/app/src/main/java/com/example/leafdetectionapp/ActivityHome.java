package com.example.leafdetectionapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

public class ActivityHome extends AppCompatActivity {

    private CardView pestCard;
    private CardView fertilizerCard;
    private CardView cultivationCard;
    private CardView linkCard;
    private CardView camera;
    private CardView gallery;

    private static final int REQUEST_CAMERA = 0;
    private static final int REQUEST_GALLERY = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        pestCard = (CardView)findViewById(R.id.pest_card_id);
        fertilizerCard = (CardView)findViewById(R.id.fertilizer_card_id);
        cultivationCard = (CardView)findViewById(R.id.cultivation_card_id);
        linkCard = (CardView)findViewById(R.id.link_card_id);
        camera = (CardView)findViewById(R.id.camera_id);
        gallery = (CardView)findViewById(R.id.upload_id);

        pestCard.setOnClickListener(v->{
            Intent intent = new Intent(this, ActivityDisease.class);
            startActivity(intent);
        });

        fertilizerCard.setOnClickListener(v->{
            Intent intent = new Intent(this,ActivityFertilizer.class);
            startActivity(intent);
        });

        cultivationCard.setOnClickListener(v->{
            Intent intent = new Intent(this,ActivityCultivation.class);
            startActivity(intent);
        });

        linkCard.setOnClickListener(v->{
            Uri uri = Uri.parse("https://raitamitra.karnataka.gov.in/english");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        camera.setOnClickListener(v->{
            try {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        gallery.setOnClickListener(v->{
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("image/*");
            startActivityForResult(Intent.createChooser(intent, "Select Picture"),REQUEST_GALLERY);
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == REQUEST_CAMERA) {
            if (data != null) {
                Bitmap photo = (Bitmap) data.getExtras().get("data");
                /* Passing BITMAP to the Prediction Activity */
                Intent IntentCamera = new Intent(this, ActivityPrediction.class);
                IntentCamera.putExtra("BitmapImage", photo);
                startActivity(IntentCamera);
            }
        }
        else if(resultCode==RESULT_OK && requestCode == REQUEST_GALLERY){
            if(data!=null) {
                Uri uri = data.getData();
                Intent intent = new Intent(this, ActivityPredictionUpload.class);
                intent.putExtra("image-uri", uri.toString());
                startActivity(intent);
            }
        }
    }
}