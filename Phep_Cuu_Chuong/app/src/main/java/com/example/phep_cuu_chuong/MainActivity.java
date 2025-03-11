package com.example.phep_cuu_chuong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

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

    public void Tinh(View view){
        TextView tvsoA = findViewById(R.id.tvsoA);
        TextView tvsoB = findViewById(R.id.tvsoB);
        TextView tvCheck = findViewById(R.id.tvCheck);
        EditText edtKQ = findViewById(R.id.edtKQ);

        // Tạo số ngẫu nhiên toán hạng
        Random random = new Random();
        int randomSoA = random.nextInt(9) + 1 ; // Từ 1 đến 9
        int randomSoB = random.nextInt(10) + 1 ; // Từ 1 đến 10

        // gán giá trị ngẫu nhiên
        tvsoA.setText(randomSoA);
        tvsoB.setText(randomSoB);

        String strsoA = tvsoA.getText().toString();
        String strsoB = tvsoB.getText().toString();

        // Tính toán
        int soA = Integer.parseInt(strsoA);
        int soB = Integer.parseInt(strsoB);
        int KetQua = soA * soB;

        // Lấy kết quả người dùng nhập vào để kiểm tra
        String strKetQua = edtKQ.getText().toString();


    }
}