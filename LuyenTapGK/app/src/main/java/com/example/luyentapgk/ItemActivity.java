package com.example.luyentapgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ItemActivity extends AppCompatActivity {

    TextView textViewGiaTriNhanDuoc;
    ImageView imageViewBackList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item);

       textViewGiaTriNhanDuoc = findViewById(R.id.tvItem);
        // nhan
        String giaTriNhan = getIntent().getStringExtra("item");
        // gan
        textViewGiaTriNhanDuoc.setText(giaTriNhan);

        imageViewBackList = findViewById(R.id.imgBackList);
        imageViewBackList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemActivity.this, Cau2Activity.class);
                startActivity(intent);
            }
        });
    }
}