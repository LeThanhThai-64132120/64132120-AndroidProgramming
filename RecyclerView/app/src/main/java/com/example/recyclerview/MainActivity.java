package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLandScape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewData = getDataRecyclerView();
        //4
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        //5
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        //6
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewData);
        //7 Gắn Adapter vào RecyclerView
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }

    // Chuẩn bị data cho LandScapeList
    ArrayList<LandScape> getDataRecyclerView(){
    ArrayList <LandScape> dsDuLieu = new ArrayList<LandScape>();
    LandScape landScape1 = new LandScape("flagtowerhanoi", "Cột cờ Hà Nội");
    dsDuLieu.add(landScape1);
    dsDuLieu.add(new LandScape("hoguom", "Hồ Gươm Hà Nội"));
    dsDuLieu.add(new LandScape("eiffel", "Tháp Eiffel"));
    dsDuLieu.add(new LandScape("buckinghampalace", "Cung điện Buckingham"));
    dsDuLieu.add(new LandScape("opera", "Nhà hát Opera"));
    return dsDuLieu;

    }
}