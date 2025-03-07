package com.example.chuyenmanhinhintent;

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

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        // Nhận Intent
        Intent iNhanDuoc = getIntent();
        // bóc lấy data
        String strTenDangNhap = iNhanDuoc.getStringExtra("tenDN"); // doi tuong co nhieu thứ
        // Xử lý
        // Hiện ra điều khiển view
        TextView textViewDn = findViewById(R.id.tvUserName);
        textViewDn.setText(strTenDangNhap);

        ImageView imgQuayLai = findViewById(R.id.imgBack);
        imgQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Back = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(Back);
            }
        });
    }

}