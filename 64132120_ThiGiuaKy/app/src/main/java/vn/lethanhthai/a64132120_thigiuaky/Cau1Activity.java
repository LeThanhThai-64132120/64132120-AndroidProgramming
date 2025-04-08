package vn.lethanhthai.a64132120_thigiuaky;

import android.content.Intent;
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

public class Cau1Activity extends AppCompatActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau1);


    }

    public void Check(View v){
        EditText editTextNgay = findViewById(R.id.edtNgay);
        EditText editTextThang = findViewById(R.id.edtThang);
       EditText editTextNam = findViewById(R.id.edtNam);
       TextView textViewKQ = findViewById(R.id.tvKetQua);

        String stringNgay = editTextNgay.getText().toString();
        String stringThang = editTextThang.getText().toString();
        String stringNam = editTextNam.getText().toString();

        if ((stringNgay.equals("30")) && (stringThang.equals("4")) && (stringNam.equals("1975"))){
            textViewKQ.setText("Đúng");
        }
        else
        {textViewKQ.setText("Sai");}
    }
}