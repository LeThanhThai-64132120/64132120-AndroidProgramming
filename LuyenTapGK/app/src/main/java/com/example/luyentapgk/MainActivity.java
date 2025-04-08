package com.example.luyentapgk;

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

    Button buttonCau1, buttonCau2, buttonCau3, buttonCau4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        buttonCau1 = findViewById(R.id.btnCau1);
        buttonCau2 = findViewById(R.id.btnCau2);
        buttonCau3 = findViewById(R.id.btnCau3);
        buttonCau4 = findViewById(R.id.btnCau4);

        buttonCau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cau1Activity.class);
                startActivity(intent);
            }
        });

        buttonCau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cau2Activity.class);
                startActivity(intent);
            }
        });

        buttonCau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cau3Activity.class);
                startActivity(intent);
            }
        });

        buttonCau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cau4Activity.class);
                startActivity(intent);
            }
        });
    }
}