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

    }

    public void TinhChuViHThang(View v){

    }

    public void TinhChuViHThoi(View v){

    }
    // Dien tich tu giac
    public void TinhDienTichHV(View view){

    }

    public void TinhDienTichHThang(View view){

    }

    public void TinhDienTichHThoi(View view){

    }

}