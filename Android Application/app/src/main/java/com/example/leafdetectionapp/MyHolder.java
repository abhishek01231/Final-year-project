package com.example.leafdetectionapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView img1,img2;
    TextView txt1,txt2;
    ItemClickListener itemClickListener;
    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.img1=itemView.findViewById(R.id.recycler_image);
        this.img2=itemView.findViewById(R.id.recycler_navigation);
        this.txt1=itemView.findViewById(R.id.recycler_title);
        this.txt2=itemView.findViewById(R.id.recycler_description);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemClickListener(v,getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener = ic;
    }
}

