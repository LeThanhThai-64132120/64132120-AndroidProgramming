package com.example.ex7_intentlogin;

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

        // Lấy Intent về
        Intent intentTuLogin = getIntent();
        //Lọc ra lấy data chuỗi
        String tenDN_NhanDuoc = intentTuLogin.getStringExtra("ten_dang_nhap");
        // Gán vào điều khiển
        TextView tvTenDN = findViewById(R.id.tvUsername);
        tvTenDN.setText(tenDN_NhanDuoc);

        ImageView nutVeMain = findViewById(R.id.imgBackMain);
        nutVeMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent veMain = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(veMain);
            }
        });
    }
}