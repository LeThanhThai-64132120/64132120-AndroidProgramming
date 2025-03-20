package com.example.mathappforkids_figma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Count extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    TextView tvKQ;
    ImageView imgBackHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_count);

        btn1 = findViewById(R.id.btn4);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn1);
        btn4 = findViewById(R.id.btn6);
        tvKQ = findViewById(R.id.tvKetQua);
        imgBackHome = findViewById(R.id.imgBackHome);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvKQ.setText("Sai rồi😒");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvKQ.setText("Sai rồi😒");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvKQ.setText("Sai rồi😒");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvKQ.setText("Đúng 👍");
            }
        });

        imgBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Count.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}