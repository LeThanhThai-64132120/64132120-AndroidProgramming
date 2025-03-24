package com.example.dashboard_luyentap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;

import java.util.ArrayList;
import java.util.Arrays;

public class ElectronicActivity extends AppCompatActivity {

    ImageView imageViewBack;
    ArrayList <String> dsElectronic;
    ListView listViewElectronic;
    AutoCompleteTextView autoCompleteTextViewElectronic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_electronic);

        imageViewBack = findViewById(R.id.imgBack);
        listViewElectronic = findViewById(R.id.lvElectronic);
        autoCompleteTextViewElectronic = findViewById(R.id.atctvElectronic);


        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectronicActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Chuẩn bị dữ liệu
        String[] data = {"Laptop", "Smart Phone", "TV"};
        ArrayList<String> dsElectronic = new ArrayList<String>(Arrays.asList(data));

        // Tạo adapter
        ArrayAdapter<String> adapterElectronic;
        adapterElectronic = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsElectronic);

        // Gán adapter
        listViewElectronic.setAdapter(adapterElectronic);

        // AutoCompleteTextView
        // Gắn adapter
        autoCompleteTextViewElectronic.setAdapter(adapterElectronic);
        // Bắt sự kiện chọn item trong AutoCompleteTextView
        autoCompleteTextViewElectronic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giatriNhanDuoc = (String) parent.getItemAtPosition(position);
                Toast.makeText(ElectronicActivity.this,"Đã chọn" + giatriNhanDuoc, Toast.LENGTH_SHORT).show();
            }
        });

        listViewElectronic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giaTriNhanDuoc = (String) parent.getItemAtPosition(position);
                Toast.makeText(ElectronicActivity.this, "Đã chọn "+ giaTriNhanDuoc, Toast.LENGTH_SHORT).show();
            }
        });
    }
}