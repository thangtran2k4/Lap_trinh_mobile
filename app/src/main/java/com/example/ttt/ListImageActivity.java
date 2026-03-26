package com.example.ttt;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ttt.adapter.ImageAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListImageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_image);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        List<Integer> logos = new ArrayList<>();

        logos.add(R.drawable.google);
        logos.add(R.drawable.amazon);
        logos.add(R.drawable.intel);
        logos.add(R.drawable.netflix);
        logos.add(R.drawable.oracle);

        ImageAdapter adapter = new ImageAdapter(logos);

        recyclerView.setAdapter(adapter);
    }
}