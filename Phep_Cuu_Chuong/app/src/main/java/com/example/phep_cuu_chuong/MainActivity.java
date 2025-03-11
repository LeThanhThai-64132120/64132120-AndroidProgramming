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
    Button btnCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tvsoA = findViewById(R.id.tvsoA);
        tvsoB = findViewById(R.id.tvsoB);
        tvCheck = findViewById(R.id.tvCheck);
        edtKQ = findViewById(R.id.edtKQ);
        btnCheck = findViewById(R.id.btnTinh);
        TaoRandomSo();
    }

    void TaoRandomSo (){
        // Tạo số ngẫu nhiên toán hạng
        Random random = new Random();
        int randomSoA = random.nextInt(9) + 1 ; // Từ 1 đến 9
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
            tvCheck.setText("Đúng");
            TaoRandomSo();
        }
        else {
            tvCheck.setText("Sai. Hãy nhập lại");
        }


    }
}