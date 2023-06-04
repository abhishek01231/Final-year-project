package com.example.leafdetectionapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

 public class   LeafRustTreatFragment extends Fragment {
     View view;

     public  LeafRustTreatFragment() {
     }

     @Nullable
     @Override
     public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.leaf_rust_treat_fragment, container,false);
         return view;
     }
 }

