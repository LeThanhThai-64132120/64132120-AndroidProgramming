package com.example.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // xử lý code Cộng ở đây
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);

                float Cong = soA  + soB;
                String strKetQua = String.valueOf(Cong);
                editTextKQ.setText(strKetQua);
            }
        };
         nutCong.setOnClickListener(boLangNgheCong);


        // Cách inline anonyous (ẩn danh)
         nutTru.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String soThu1 = editTextSo1.getText().toString();
                 String soThu2 = editTextSo2.getText().toString();
                 float soA = Float.parseFloat(soThu1);
                 float soB = Float.parseFloat(soThu2);

                 float Tru = soA  - soB;
                 String strKetQua = String.valueOf(Tru);
                 editTextKQ.setText(strKetQua);
             }
         });
         // xử lý Nhân
         nutNhan.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String soThu1 = editTextSo1.getText().toString();
                 String soThu2 = editTextSo2.getText().toString();
                 float soA = Float.parseFloat(soThu1);
                 float soB = Float.parseFloat(soThu2);

                 float Nhan = soA  * soB;
                 String strKetQua = String.valueOf(Nhan);
                 editTextKQ.setText(strKetQua);

             }
         });

         // nút Chia
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);

                float Chia = soA  / soB;
                String strKetQua = String.valueOf(Chia);
                editTextKQ.setText(strKetQua);

            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    void TimDieuKhien(){
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKQ = (EditText) findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
}