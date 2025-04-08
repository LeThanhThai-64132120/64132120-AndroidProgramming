package com.example.luyentapgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Cau3Activity extends AppCompatActivity {

    ElectronicAdapter electronicAdapter;
    ArrayList<Electronic> recyclerViewData;
    RecyclerView recyclerViewElectronic;

    ImageView imageViewHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau3);

        recyclerViewData = getDataForRecyclerView();
        recyclerViewElectronic = findViewById(R.id.recyclerElectronic);

        RecyclerView.LayoutManager layoutLinear =new LinearLayoutManager(this);
        recyclerViewElectronic.setLayoutManager(layoutLinear);

        electronicAdapter =new ElectronicAdapter(this, recyclerViewData);

        recyclerViewElectronic.setAdapter(electronicAdapter);

        imageViewHome = findViewById(R.id.imgHome);
        imageViewHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cau3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    //7 Khởi tạo và setting tại activity Hiển thị
    // tạo data
    ArrayList<Electronic> getDataForRecyclerView() {
        // tao danh sach
        ArrayList<Electronic> dsDuLieu = new ArrayList<Electronic>();
        dsDuLieu.add(new Electronic("maytinh", "Máy tính"));
        dsDuLieu.add(new Electronic("dienthoai", "Điện thoại"));
        dsDuLieu.add(new Electronic("mayin", "Máy in"));
        dsDuLieu.add(new Electronic("tv", "TV"));
        dsDuLieu.add(new Electronic("maylanh", "Máy Lạnh"));
        dsDuLieu.add(new Electronic("maygiat", "Máy giặt"));
        dsDuLieu.add(new Electronic("loa", "Loa"));
        dsDuLieu.add(new Electronic("quatmay", "Quạt máy"));
        dsDuLieu.add(new Electronic("lovisong", "Lò vi sóng"));
        dsDuLieu.add(new Electronic("tulanh", "Tủ lạnh"));
        dsDuLieu.add(new Electronic("maynuocnong", "Máy nước nóng"));
        dsDuLieu.add(new Electronic("mayanh", "Máy ảnh"));
        return dsDuLieu;
    }
}