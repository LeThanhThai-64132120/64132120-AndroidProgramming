package com.example.chuvidientich_hinhtamgiac;

import static java.lang.Math.sqrt;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtA;
    EditText edtB;
    EditText edtC;
    EditText edtKQ;
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
        edtA = findViewById(R.id.edtcanhA);
        edtB = findViewById(R.id.edtcanhB);
        edtC = findViewById(R.id.edtcanhC);
        edtKQ = findViewById(R.id.edtKetQua);

    }

    public void TinhDienTich(View v){
        String canhA = edtA.getText().toString();
        String canhB = edtB.getText().toString();
        String canhC = edtC.getText().toString();

        float soA = Float.parseFloat(canhA);
        float soB = Float.parseFloat(canhB);
        float soC = Float.parseFloat(canhC);

        float p = (soA +soB + soC) / 2; // Nữa chu vi
        float DienTich = (float) sqrt(p * (p - soA)*(p - soB)*(p-soC));

        String strKQ = String.valueOf(DienTich);
        edtKQ.setText(strKQ);

    }

    public void TinhDienTichCoH(View v){
        EditText edtH = findViewById(R.id.edtcanhH);
        String canhA = edtA.getText().toString();
        String canhB = edtB.getText().toString();
        String canhC = edtC.getText().toString();
        String canhH = edtH.getText().toString();

        float soA = Float.parseFloat(canhA);
        float soB = Float.parseFloat(canhB);
        float soC = Float.parseFloat(canhC);
        float soH = Float.parseFloat(canhH);

        float DienTichCoH = (float) 1/2 * soC * soH;

        String strKQ = String.valueOf(DienTichCoH);
        edtKQ.setText(strKQ);
    }

    public void TinhChuVi(View v){
        String canhA = edtA.getText().toString();
        String canhB = edtB.getText().toString();
        String canhC = edtC.getText().toString();

        float soA = Float.parseFloat(canhA);
        float soB = Float.parseFloat(canhB);
        float soC = Float.parseFloat(canhC);
        float ChuVi = soA +soB + soC;

        String strKQ = String.valueOf(ChuVi);
        edtKQ.setText(strKQ);

    }
}