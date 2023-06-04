package com.example.leafdetectionapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NorthernLeafBlightSymptomFragment extends Fragment {
    View view;
    public NorthernLeafBlightSymptomFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.northern_leaf_blight_symptom_fragment, container,false);
        return view;
    }
}
