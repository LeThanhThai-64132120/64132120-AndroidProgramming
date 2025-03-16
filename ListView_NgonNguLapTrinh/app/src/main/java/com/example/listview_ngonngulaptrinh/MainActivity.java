package com.example.listview_ngonngulaptrinh;

import static android.widget.Toast.LENGTH_LONG;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ListView listViewNNLT;
        ArrayList<String> dsNNLT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listViewNNLT = findViewById(R.id.lvNNLT);
        // B1.Chuẩn bị data, hard-code
        dsNNLT = new ArrayList<String>();
        dsNNLT.add("Python");
        dsNNLT.add("C");
        dsNNLT.add("C++");
        dsNNLT.add("C#");
        dsNNLT.add("Java");
        // B2.
        ArrayAdapter<String> adapterNNLT;
        adapterNNLT = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,dsNNLT);

        // B3.Gắn Adapter
            listViewNNLT.setAdapter(adapterNNLT);
        // B4.Gắn bộ lắng nghe và xử lý sự kiện
        listViewNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // code here
                // Chú ý: Biến position: vị trí của Item được Click
                String giaTriDuocChon = dsNNLT.get(position);
                // Sử dụng các giá trị này
                // ta Toast lên
                Toast.makeText(MainActivity.this, giaTriDuocChon,LENGTH_LONG).show();
            }
        });


    }
}