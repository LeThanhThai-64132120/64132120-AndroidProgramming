package com.example.chuvidientich_hinhtugiac;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtCanhA ;
    EditText edtCanhB ;
    EditText edtCanhC;
    EditText edtCanhD ;
    EditText edtCanhH ;
    EditText edtKetQua ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    void TimDieuKhien(){
        edtCanhA = findViewById(R.id.edtcanhA);
        edtCanhB = findViewById(R.id.edtcanhB);
        edtCanhC = findViewById(R.id.edtcanhC);
        edtCanhD = findViewById(R.id.edtcanhD);
        edtCanhH = findViewById(R.id.edtcanhH);
        edtKetQua = findViewById(R.id.edtKetQua);



    }



// Chu vi tu giac
    public void TinhChuViHCN(View v){
        String strcanhA = edtCanhA.getText().toString();
        String strcanhB = edtCanhB.getText().toString();
        float soA = Float.parseFloat(strcanhA);
        float soB = Float.parseFloat(strcanhB);
        float ChuVi = (soA + soB) * 2;
        String strKQ = String.valueOf(ChuVi);
        edtKetQua.setText(strKQ);

    }

    public void TinhChuViHV(View v){
        String strcanhA = edtCanhA.getText().toString();
        float soA = Float.parseFloat(strcanhA);
        float ChuVi = soA * 4;
        String strKQ = String.valueOf(ChuVi);
        edtKetQua.setText(strKQ);
    }

    public void TinhChuViHThang(View v){
        String strcanhA = edtCanhA.getText().toString();
        String strcanhB = edtCanhB.getText().toString();
        String strcanhC = edtCanhC.getText().toString();
        String strcanhD = edtCanhD.getText().toString();
        float soA = Float.parseFloat(strcanhA);
        float soB = Float.parseFloat(strcanhB);
        float soC = Float.parseFloat(strcanhC);
        float soD = Float.parseFloat(strcanhD);
        float ChuVi = soA + soB + soC + soD;
        String strKQ = String.valueOf(ChuVi);
        edtKetQua.setText(strKQ);
    }


    // Dien tich tu giac
    public void TinhDienTichHCN(View view){
        String strcanhA = edtCanhA.getText().toString();
        String strcanhB = edtCanhB.getText().toString();
        float soA = Float.parseFloat(strcanhA);
        float soB = Float.parseFloat(strcanhB);
        float DienTich = (soA * soB);
        String strKQ = String.valueOf(DienTich);
        edtKetQua.setText(strKQ);
    }
    public void TinhDienTichHV(View view){
        String strcanhA = edtCanhA.getText().toString();
        float soA = Float.parseFloat(strcanhA);
        float DienTich = soA * soA;
        String strKQ = String.valueOf(DienTich);
        edtKetQua.setText(strKQ);

    }

    public void TinhDienTichHThang(View view){
        String strcanhA = edtCanhA.getText().toString();
        String strcanhB = edtCanhB.getText().toString();
        String strcanhH = edtCanhH.getText().toString();
        float soA = Float.parseFloat(strcanhA);
        float soB = Float.parseFloat(strcanhB);
        float soH = Float.parseFloat(strcanhH);
        float DienTich = (soA + soB) * soH / 2;
        String strKQ = String.valueOf(DienTich);
        edtKetQua.setText(strKQ);
    }
}