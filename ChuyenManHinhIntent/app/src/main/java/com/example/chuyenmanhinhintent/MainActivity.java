package com.example.chuyenmanhinhintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nutDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        nutDangNhap = findViewById(R.id.btnLogin);
        nutDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here
                // 1. Tao moi Intent
                Intent iLogin = new Intent(MainActivity.this, LoginActivity.class); // noi nhan LoginActivity.class
                //1.1 cu phap Goi data
                //iLogin.putExtra()
                // 2. Goi lenh chuyen
                startActivity(iLogin);
            }
        });
    }
}