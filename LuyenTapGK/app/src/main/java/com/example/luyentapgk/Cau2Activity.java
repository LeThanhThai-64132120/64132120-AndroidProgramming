package com.example.luyentapgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Cau2Activity extends AppCompatActivity {

    ListView listViewTBDT;
    ArrayList<String> danhsachTBDT;
    ImageView imageViewHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        imageViewHome = findViewById(R.id.imgHome);
        imageViewHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cau2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        listViewTBDT = findViewById(R.id.lvElectronic);
         String[] data = {"Máy tính", "Điện thoại", "Máy in", "TV", "Máy lạnh", "Máy giặt", "Loa", "Quạt máy", "Lò vi sóng", "Tủ lạnh", "Máy nước nóng ", "Máy ảnh"};
         danhsachTBDT = new ArrayList<>(Arrays.asList(data));

        ArrayAdapter<String> adapterTBDT = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, danhsachTBDT);

        // gawn adapter
        listViewTBDT.setAdapter(adapterTBDT);

        // chuyển qua item được chọn
        listViewTBDT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giaTriChuyen = data[position];
                // chuyen
                Intent intent = new Intent(Cau2Activity.this, ItemActivity.class);
                intent.putExtra("item", giaTriChuyen);
                Toast.makeText(Cau2Activity.this, "Đã chọn: "+giaTriChuyen, Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

    }
}