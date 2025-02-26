package com.example.ex3_simplesumapp;

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
        // Gắn layout tương ứng với file này
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); // tên của layout liên kết
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Lắng nghe và xử lý sự kiện lên nút tính Tổng
    public void XuLyCong(View view){
// Tìm, tham chiếu đến điều khiển tệp .XML, mapping sang java
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        // Lấy data ở điều khiển số a
        String strA = editTextSoA.getText().toString(); // người dùng nhập sẽ có dạng strA = "2"
        // Lấy data ở điều khiển số b
        String strB = editTextSoB.getText().toString(); // strB = "5"

        // chuyển data về dạng số
        int so_A = Integer.parseInt(strA); //so_A = 2
        int so_B = Integer.parseInt(strB); // so_B = 5

        // Tính toán theo yêu cầu
        int tong = so_A + so_B; // 7
        String strTong = String.valueOf(tong); // Chuyển sang dạng chuỗi vì hiển thị ra màn hình là dạng text "7"
        // Hiển thị ra màn hình
        editTextKetQua.setText(tong);


    }
}