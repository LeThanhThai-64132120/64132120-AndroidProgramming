package com.example.ex7_intentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);


        Button btnXacNhan = findViewById(R.id.btnOK);

        // thuc hien
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý đăng nhập
                // lấy data
                // B1. Tìm tham chiếu đến điều khiển
                EditText edtTenDN = (EditText) findViewById(R.id.edtUsername);
                EditText edtPass = findViewById(R.id.edtPassword);
                ImageView img = findViewById(R.id.img);
                // B2. Lấy data
                String tenDangNhap = edtTenDN.getText().toString();
                String matKhau = edtPass.getText().toString();
                img.setImageResource(R.drawable.user_icon);
                // Kiểm tra data
                if(tenDangNhap.equals("lethanhthai") && matKhau.equals("123")) // Mật khẩu đúng
                {// Chuyển sang màn hình Home
                    Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                    // Gói data vào iQuiz, dạng key - value; key được dùng để bên kia lọc ra data
                    iQuiz.putExtra("ten_dang_nhap", tenDangNhap);
                    iQuiz.putExtra("mat_khau", matKhau);
                    // Gửi data đi
                    startActivity(iQuiz);


                }
                else {
                    Toast.makeText(LoginActivity.this, "THÔNG TIN CỦA BẠN SAI", Toast.LENGTH_LONG).show();
                }
            }
        });

        TextView tvGuest = findViewById(R.id.tvguest);
        tvGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyenGuest = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(chuyenGuest);
            }
        });

    }
}