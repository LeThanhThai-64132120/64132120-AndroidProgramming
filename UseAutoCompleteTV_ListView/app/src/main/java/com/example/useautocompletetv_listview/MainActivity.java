package com.example.useautocompletetv_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView lvTraiCay;
    AutoCompleteTextView autoCompleteTextView;
    ArrayList<String> dsTraiCay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // khai báo listView và autoCompleteTextView
        lvTraiCay = findViewById(R.id.lvTraiCay);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        // Chuan bị data, hard code
        String[] data =  {"Banana", "Apple", "Orange", "Grapes", "Pineapple", "Strawberry", "Mango", "Passion", "Blueberry"};
        dsTraiCay = new ArrayList<>(Arrays.asList(data));
        // tao Adapter
        
        ArrayAdapter<String> adapterTraiCay;
        adapterTraiCay = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTraiCay);

        // B3 gắn adapter
        lvTraiCay.setAdapter(adapterTraiCay);
        autoCompleteTextView.setAdapter(adapterTraiCay);

        // Bắt sự kiện chọn item trong AutoCompleteTextView
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // code
                String giaTriNhanDuoc =(String) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this,"Đã chọn: " + giaTriNhanDuoc, Toast.LENGTH_SHORT).show();

            }
        });
        lvTraiCay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String giaTriListView = dsTraiCay.get(position);
                String giaTriListView =(String) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Đã chọn: " + giaTriListView, Toast.LENGTH_SHORT).show();
            }
        });


    }
}