package com.example.phep_cuu_chuong;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvsoA;
    TextView tvsoB;
    TextView tvCheck;
    EditText edtKQ;
    Button btnCheck, btnDelete,  btnSo1, btnSo2, btnSo3, btnSo4, btnSo5, btnSo6, btnSo7, btnSo8, btnSo9, btnSo10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tvsoA = findViewById(R.id.tvsoA);
        tvsoB = findViewById(R.id.tvsoB);
        tvCheck = findViewById(R.id.tvCheck);
        edtKQ = findViewById(R.id.edtKQ);
        btnCheck = findViewById(R.id.btnCheck);
        btnSo1 = findViewById(R.id.btnso1);
        btnSo3 = findViewById(R.id.btnso3);
        btnSo4 = findViewById(R.id.btnso4);
        btnSo5 = findViewById(R.id.btnso5);
        btnSo6 = findViewById(R.id.btnso6);
        btnSo7 = findViewById(R.id.btnso7);
        btnSo8 = findViewById(R.id.btnso8);
        btnSo9 = findViewById(R.id.btnso9);
        btnSo10 = findViewById(R.id.btnso10);


        TaoRandomSo();
    }

    void TaoRandomSo (){
        // Tạo số ngẫu nhiên toán hạng
        Random random = new Random();
        int randomSoA = random.nextInt(1) + 1 ; // Từ 1 đến 9
        int randomSoB = random.nextInt(10) + 1 ; // Từ 1 đến 10

        // chuyển về kiểu string
        String strRandomSoA = String.valueOf(randomSoA);
        String strRandomSoB = String.valueOf(randomSoB);

        // gán giá trị ngẫu nhiên
        tvsoA.setText(strRandomSoA);
        tvsoB.setText(strRandomSoB);

        String strsoA = tvsoA.getText().toString();
        String strsoB = tvsoB.getText().toString();
    }
    public void Tinh(View view){
         String strsoA = tvsoA.getText().toString();
        String strsoB = tvsoB.getText().toString();

        // Tính toán
        int soA = Integer.parseInt(strsoA);
        int soB = Integer.parseInt(strsoB);
        int KetQua = soA * soB;

        // Lấy kết quả người dùng nhập vào để kiểm tra
        String strKetQua = edtKQ.getText().toString();
        int KetQuaUser = Integer.parseInt(strKetQua);
        if (KetQuaUser == KetQua){
            tvCheck.setText("Giỏi quá 😍. Đúng rồi nè bạn ơi 👍");
            TaoRandomSo();
        }
        else {
            tvCheck.setText("Sai rồi 😭. Thử lại nhé! ");
        }
    }
    public void Delete(View view){
        edtKQ.setText("0");
    }

    public void Nhapso1(View v) {
        String strSo1 = btnSo1.getText().toString();
        int so1 = Integer.parseInt(strSo1);
            edtKQ.setText(strSo1);
    }

        public void Nhapso2(View v){
            btnSo2 = findViewById(R.id.btnso2);
            String strSo2 = btnSo2.getText().toString();
                edtKQ.setText(strSo2);
        }
    public void Nhapso3(View v){
        btnSo3 = findViewById(R.id.btnso3);
        String strSo3 = btnSo3.getText().toString();
            edtKQ.setText(strSo3);
    }

    public void Nhapso4(View v){
        btnSo4 = findViewById(R.id.btnso4);
        String strSo4 = btnSo4.getText().toString();
            edtKQ.setText(strSo4);
    }

    public void Nhapso5(View v){
        btnSo5 = findViewById(R.id.btnso5);
        String strSo5 = btnSo5.getText().toString();
        edtKQ.setText(strSo5);
    }

    public void Nhapso6(View v){
        btnSo6 = findViewById(R.id.btnso6);
        String strSo6 = btnSo6.getText().toString();
        edtKQ.setText(strSo6);
    }

    public void Nhapso7(View v){
        btnSo7 = findViewById(R.id.btnso7);
        String strSo7 = btnSo7.getText().toString();
        edtKQ.setText(strSo7);
    }

    public void Nhapso8(View v){
        btnSo8 = findViewById(R.id.btnso8);
        String strSo8 = btnSo8.getText().toString();
        edtKQ.setText(strSo8);
    }

    public void Nhapso9(View v){
        btnSo9 = findViewById(R.id.btnso9);
        String strSo9 = btnSo9.getText().toString();
        edtKQ.setText(strSo9);
    }

    public void Nhapso10(View v){
        btnSo10 = findViewById(R.id.btnso10);
        String strSo10 = btnSo10.getText().toString();
        edtKQ.setText(strSo10);
    }
}