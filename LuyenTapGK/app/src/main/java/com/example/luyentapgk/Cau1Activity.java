package com.example.luyentapgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cau1Activity extends AppCompatActivity {

    EditText editTextSoA, editTextSoB;
    TextView textViewKetQua;
    Button buttonTinh;
    ImageView imageViewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau1);

        // Chương trình tính toán 2 số
        // tìm đk
        editTextSoA = findViewById(R.id.edtSoA);
        editTextSoB = findViewById(R.id.edtSoB);
        textViewKetQua = findViewById(R.id.edtKetQua);
        buttonTinh = findViewById(R.id.btnTinh);
        imageViewHome = findViewById(R.id.imgHome);

        editTextSoA.setText("0");
        editTextSoB.setText("0");



        buttonTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringSoA = editTextSoA.getText().toString();
                String stringSoB = editTextSoB.getText().toString();
                float soA = Float.parseFloat(stringSoA);
                float soB = Float.parseFloat(stringSoB);
                float  Tinh = soA + soB;
                String stringTinh = String.valueOf(Tinh);
                textViewKetQua.setText(stringTinh);
            }
        });

        imageViewHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cau1Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}