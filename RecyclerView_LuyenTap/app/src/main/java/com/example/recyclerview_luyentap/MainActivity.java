package com.example.recyclerview_luyentap;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.intellij.lang.annotations.Language;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // buoc 8
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLanndScape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // buoc 9 :
        // gán data
        recyclerViewDatas = getDataForRecyclerView();
        // buoc 10: Tìm điều khiển
        recyclerViewLanndScape = findViewById(R.id.recyclerLand);
        // buoc 11:
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLanndScape.setLayoutManager(layoutLinear);
        // buoc 12 tạo adapter LandScape
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
        // buoc 13. gắn adapter cho recyclerView
        recyclerViewLanndScape.setAdapter(landScapeAdapter);


    }
    // Chuan bi du lieu
    ArrayList<LandScape> getDataForRecyclerView(){
        // tao danh sach
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("buckinghampalace","Cung điện Buckingham"); // (String landImageFileName, String landCaption)
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("eiffel", "Tháp Eiffel"));
        dsDuLieu.add(new LandScape("hoguom", "Hồ Gươm Hà Nội"));
        dsDuLieu.add(new LandScape("flagtowerhanoi", "Cột cờ Hà Nội"));
        dsDuLieu.add(new LandScape("opera", "Nhà hát Opera"));
        return  dsDuLieu;
    }
}