package com.gzeinnumer.niceimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.gzeinnumer.niceimageview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Glide.with(binding.img).load("https://images.unsplash.com/photo-1568292342316-60aa3d36f4b3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8d2FscGFwZXJ8ZW58MHx8MHx8&w=1000&q=80").into(binding.img);
        Glide.with(binding.img2).load("https://cdn.kibrispdr.org/data/walpaper-hp-android-0.jpg").into(binding.img2);

        Glide.with(binding.img3).load("https://images.unsplash.com/photo-1568292342316-60aa3d36f4b3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8d2FscGFwZXJ8ZW58MHx8MHx8&w=1000&q=80").into(binding.img3);
        Glide.with(binding.img4).load("https://cdn.kibrispdr.org/data/walpaper-hp-android-0.jpg").into(binding.img4);

    }
}