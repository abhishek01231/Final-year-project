package com.example.leafdetectionapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<Model> models;

    public MyAdapter(@NonNull Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.txt1.setText(models.get(position).getTitle());
        holder.txt2.setText(models.get(position).getDescription());
        holder.img1.setImageResource(models.get(position).getImage1());
        holder.img2.setImageResource(models.get(position).getImage2());

        holder.setItemClickListener((v, position1) -> {
            if(models.get(position1).getTitle().equals("Downy Mildew")){
                Intent intent = new Intent(c, ActivityDownyMildew.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Powdery Mildew")){
                Intent intent = new Intent(c, ActivityPowderyMildew.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Mosaic Virus")){
                Intent intent = new Intent(c, ActivityMosaicVirus.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Yellow leaf Curl Virus")){
                Intent intent = new Intent(c, ActivityYellowCurlVirus.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Target Spot")){
                Intent intent = new Intent(c, ActivityTargetSpot.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Two Spotted Spider Mite")) {
                Intent intent = new Intent(c, ActivitySpiderMite.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Septoria leaf spot")){
                Intent intent = new Intent(c, ActivitySeptoriaLeafSpot.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Leaf Mold")) {
                Intent intent = new Intent(c, ActivityLeafMold.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Leaf Scorch")){
                Intent intent = new Intent(c, ActivityLeafScorch.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Late Blight")) {
                Intent intent = new Intent(c, ActivityLateBlight.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Early Blight")) {
                Intent intent = new Intent(c, ActivityEarlyBlight.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Bacterial Spot")) {
                Intent intent = new Intent(c, ActivityBacterialSpot.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Citrus greening(Haunglongbing)")) {
                Intent intent = new Intent(c, ActivityCitrusGreening.class);
                c.startActivity(intent);
            }
            if(models.get(position1).getTitle().equals("Isariopsis leaf spot")) {
                Intent intent = new Intent(c, ActivityIsariopsisLeafSpot.class);
                c.startActivity(intent);
            }
            if(models.get(position).getTitle().equals("Apple Scab")){
                Intent intent = new Intent(c, ActivityAppleScab.class);
                c.startActivity(intent);
            }
            if(models.get(position).getTitle().equals("Black Rot")){
                Intent intent = new Intent(c, ActivityBlackRot.class);
                c.startActivity(intent);
            }
            if(models.get(position).getTitle().equals("Gray Leaf Spot")){
                Intent intent = new Intent(c, ActivityGrayLeafSpot.class);
                c.startActivity(intent);
            }
            if(models.get(position).getTitle().equals("Common Rust")){
                Intent intent = new Intent(c, ActivityCommonRust.class);
                c.startActivity(intent);
            }
            if(models.get(position).getTitle().equals("Leaf Rust")){
                Intent intent = new Intent(c, ActivityLeafRust.class);
                c.startActivity(intent);
            }
            if(models.get(position).getTitle().equals("Northern Leaf Blight")){
                Intent intent = new Intent(c, ActivityNorthernLeafBlight.class);
                c.startActivity(intent);
            }
            if(models.get(position).getTitle().equals("Black Measles(Esca)")){
                Intent intent = new Intent(c, ActivityBlackMeasles.class);
                c.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
