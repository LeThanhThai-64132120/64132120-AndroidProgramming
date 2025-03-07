package com.example.chuyenmanhinhintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    EditText edtTenDangNhap;
    Button nutXacNhan, nutQuayVe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
       nutXacNhan = findViewById(R.id.btnOK);
       edtTenDangNhap = findViewById(R.id.edtUserName);
       nutXacNhan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
               // Lay data de goi
               String strtenDangNhap = edtTenDangNhap.getText().toString();
               // gói
               iQuiz.putExtra("tenDN",strtenDangNhap);
               // gửi
               startActivity(iQuiz);
           }
       });
       nutQuayVe = findViewById(R.id.btnBack);
       nutQuayVe.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent Back = new Intent(LoginActivity.this, MainActivity.class);
               startActivity(Back);
           }
       });
    }
}