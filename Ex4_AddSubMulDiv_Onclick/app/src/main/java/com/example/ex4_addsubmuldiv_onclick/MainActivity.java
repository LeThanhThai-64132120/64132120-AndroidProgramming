package com.example.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //
     void XuLyCong(View v){
        //1. Lấy data 2 số
         //1.1 tìm EditText1 và 2
         EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
         EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
         //1.2 Lấy data từ 2 điều khiển
         String soThu1 = editTextSo1.getText().toString();
         String soThu2 = editTextSo2.getText().toString();
         //1.3 Chuyển data từ chuỗi sang số
         float soA = Float.parseFloat(soThu1);
         float soB = Float.parseFloat(soThu2);
         //2. Thực hiện tính toán
         float tong = soA + soB;
         //3. Hiện kết quả
         //3.1 Tìm nơi hiện KQ
         EditText editTextKQ = (EditText) findViewById(R.id.edtKetQua);
         //3.2 Chuẩn bị data để xuất
         String chuoiKQ = String.valueOf(tong);
         //3.3 Gán kết quả
         editTextKQ.setText(chuoiKQ);
     }

     // phép trừ
     void XuLyTru(View v){
         //1. Lấy data 2 số
         //1.1 tìm EditText1 và 2
         EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
         EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
         //1.2 Lấy data từ 2 điều khiển
         String soThu1 = editTextSo1.getText().toString();
         String soThu2 = editTextSo2.getText().toString();
         //1.3 Chuyển data từ chuỗi sang số
         float soA = Float.parseFloat(soThu1);
         float soB = Float.parseFloat(soThu2);
         //2. Thực hiện tính toán
         float tru = soA - soB;
         //3. Hiện kết quả
         //3.1 Tìm nơi hiện KQ
         EditText editTextKQ = (EditText) findViewById(R.id.edtKetQua);
         //3.2 Chuẩn bị data để xuất
         String chuoiKQ = String.valueOf(tru);
         //3.3 Gán kết quả
         editTextKQ.setText(chuoiKQ);
     }

     // phép nhân
     void XuLyNhan(View v){
         //1. Lấy data 2 số
         //1.1 tìm EditText1 và 2
         EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
         EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
         //1.2 Lấy data từ 2 điều khiển
         String soThu1 = editTextSo1.getText().toString();
         String soThu2 = editTextSo2.getText().toString();
         //1.3 Chuyển data từ chuỗi sang số
         float soA = Float.parseFloat(soThu1);
         float soB = Float.parseFloat(soThu2);
         //2. Thực hiện tính toán
         float nhan = soA * soB;
         //3. Hiện kết quả
         //3.1 Tìm nơi hiện KQ
         EditText editTextKQ = (EditText) findViewById(R.id.edtKetQua);
         //3.2 Chuẩn bị data để xuất
         String chuoiKQ = String.valueOf(nhan);
         //3.3 Gán kết quả
         editTextKQ.setText(chuoiKQ);
     }

     // phép chia
     void XuLyChia(View v){
         //1. Lấy data 2 số
         //1.1 tìm EditText1 và 2
         EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
         EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
         //1.2 Lấy data từ 2 điều khiển
         String soThu1 = editTextSo1.getText().toString();
         String soThu2 = editTextSo2.getText().toString();
         //1.3 Chuyển data từ chuỗi sang số
         float soA = Float.parseFloat(soThu1);
         float soB = Float.parseFloat(soThu2);
         //2. Thực hiện tính toán
         float chia = soA / soB;
         //3. Hiện kết quả
         //3.1 Tìm nơi hiện KQ
         EditText editTextKQ = (EditText) findViewById(R.id.edtKetQua);
         //3.2 Chuẩn bị data để xuất
         String chuoiKQ = String.valueOf(chia);
         //3.3 Gán kết quả
         editTextKQ.setText(chuoiKQ);
     }
}