package com.example.chuvidientich_hinhtron;

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

    // tính chu vi hình tròn
    public void TinhChuVi(View view){
        EditText edtR = findViewById(R.id.edtBanKinh);
        EditText edtKQ = findViewById(R.id.edtKetQua);

        String strBanKinh = edtR.getText().toString();

        float banKinh = Float.parseFloat(strBanKinh);
        double ChuVi = (float) 2 * 3.14 * banKinh;

        String ketQua = String.valueOf(ChuVi);
        edtKQ.setText(ketQua);
    }


    // Tính Diện Tích
    public void TinhDienTich(View view){
        EditText edtR = findViewById(R.id.edtBanKinh);
        EditText edtKQ = findViewById(R.id.edtKetQua);

        String strBanKinh = edtR.getText().toString();

        float banKinh = Float.parseFloat(strBanKinh);
        float DienTich = (float) 3.14 * banKinh * banKinh;

        String strKQ = String.valueOf(DienTich);
        edtKQ.setText(strKQ);

    }
}