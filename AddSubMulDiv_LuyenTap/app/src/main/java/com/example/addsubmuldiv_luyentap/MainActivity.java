package com.example.addsubmuldiv_luyentap;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.badge.BadgeUtils;

public class MainActivity extends AppCompatActivity {

    EditText editTextSoA, editTextSoB;
    TextView textViewKQ;
    Button buttonCong, buttonTru, buttonNhan, buttonChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDK();
        // Chương trình tính
        buttonCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strSoA = editTextSoA.getText().toString();
                String strSoB = editTextSoB.getText().toString();

                float soA = Float.parseFloat(strSoA);
                float soB = Float.parseFloat(strSoB);
                float tong = soA + soB;
                String strTong = String.valueOf(tong);
                textViewKQ.setText(strTong);
                Toast.makeText(MainActivity.this, "Đã chọn Phép Cộng", Toast.LENGTH_SHORT).show();
            }
        });

        buttonTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strSoA = editTextSoA.getText().toString();
                String strSoB = editTextSoB.getText().toString();

                float soA = Float.parseFloat(strSoA);
                float soB = Float.parseFloat(strSoB);

                float hieu = soA - soB;
                String strHieu = String.valueOf(hieu);
                textViewKQ.setText(strHieu);
                Toast.makeText(MainActivity.this, "Đã chọn Phép Trừ", Toast.LENGTH_SHORT).show();
            }
        });

        buttonNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strSoA = editTextSoA.getText().toString();
                String strSoB = editTextSoB.getText().toString();

                float soA = Float.parseFloat(strSoA);
                float soB = Float.parseFloat(strSoB);

                float Tich = soA * soB;
                String strTich = String.valueOf(Tich);
                textViewKQ.setText(strTich);
                Toast.makeText(MainActivity.this, "Đã chọn Phép Nhân", Toast.LENGTH_SHORT).show();

            }
        });

        buttonChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strSoA = editTextSoA.getText().toString();
                String strSoB = editTextSoB.getText().toString();

                float soA = Float.parseFloat(strSoA);
                float soB = Float.parseFloat(strSoB);

                float Thuong = soA / soB;
                String strThuong = String.valueOf(Thuong);
                textViewKQ.setText(strThuong);
                Toast.makeText(MainActivity.this, "Đã chọn Phép Chia", Toast.LENGTH_SHORT).show();
            }
        });
    }

    void TimDK(){
        editTextSoA= findViewById(R.id.edtSoA);
        editTextSoB = findViewById(R.id.edtSoB);
        textViewKQ = findViewById(R.id.tvKetQua);
        buttonCong = findViewById(R.id.btnCong);
        buttonTru = findViewById(R.id.btnTru);
        buttonNhan = findViewById(R.id.btnNhan);
        buttonChia = findViewById(R.id.btnChia);
    }
}