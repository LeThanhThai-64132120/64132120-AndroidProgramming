package com.example.tinhbmi;

import android.os.Bundle;
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
    public void TinhBMI(){
        //Tìm data
        EditText canNang = findViewById(R.id.edtCanNang);
        EditText chieuCao = findViewById(R.id.edtChieuCao);
        // Lấy data từ đk đưa vào dạng chuỗi
        String strCanNang = canNang.getText().toString();
        String strChieuCao = chieuCao.getText().toString();
        // Chuyển dạng cho data
        float soCanNang = Float.parseFloat(strCanNang);
        float soChieuCao = Float.parseFloat(strChieuCao);
        // TÍnh 


    }
}