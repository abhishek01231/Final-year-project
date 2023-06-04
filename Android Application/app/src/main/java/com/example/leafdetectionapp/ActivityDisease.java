package com.example.leafdetectionapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ActivityDisease extends AppCompatActivity {

    RecyclerView myRecyclerView;
    MyAdapter myAdapter;
    private static final int REQUEST_CAMERA = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);

        myRecyclerView = findViewById(R.id.vegetative_recycler_view);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMyList());
        myRecyclerView.setAdapter(myAdapter);

        myRecyclerView.setNestedScrollingEnabled(false);

        FloatingActionButton fab = findViewById(R.id.camera_fab);
        fab.setOnClickListener(v->{
            try {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_CAMERA) {
                if (data != null) {
                    Bitmap photo = (Bitmap) data.getExtras().get("data");
                    /* Passing BITMAP to the Prediction Activity */
                    Intent IntentCamera = new Intent(this, ActivityPrediction.class);
                    IntentCamera.putExtra("BitmapImage", photo);
                    startActivity(IntentCamera);
                }
            }
        }
    }
    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Powdery Mildew");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.powdery_mildew);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Downy Mildew");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.downy_mildew);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Apple Scab");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.apple_scab);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Black Rot");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.black_rot);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Leaf Rust");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.leaf_rust);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Gray Leaf Spot");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.gray_leaf_spot);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Common Rust");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.common_rust);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Northern Leaf Blight");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.northern_laef_blight);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Black Measles(Esca)");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.black_measles);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Isariopsis leaf spot");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.isariopsis_leaf_spot);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Citrus greening(Haunglongbing)");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.citrus_greening);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Bacterial Spot");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.bacterial_leaf_spot);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Early Blight");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.early_blight);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Late Blight");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.late_blight);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Leaf Scorch");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.leaf_scorch);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Leaf Mold");
        m.setDescription("Deficiency");
        m.setImage1(R.drawable.leaf_mold);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Septoria leaf spot");
        m.setDescription("Deficiency");
        m.setImage1(R.drawable.septoria_leaf_spot);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Two Spotted Spider Mite");
        m.setDescription("Insect");
        m.setImage1(R.drawable.spider_mite);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Target Spot");
        m.setDescription("Fungus");
        m.setImage1(R.drawable.target_spot);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Yellow leaf Curl Virus");
        m.setDescription("Virus");
        m.setImage1(R.drawable.yellow_leaf_curl_virus);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        m = new Model();
        m.setTitle("Mosaic Virus");
        m.setDescription("Virus");
        m.setImage1(R.drawable.mosaic_virus);
        m.setImage2(R.drawable.ic_baseline_navigate_next_24);
        models.add(m);

        return models;
    }
}