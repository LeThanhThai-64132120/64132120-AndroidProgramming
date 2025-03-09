package com.example.ex7_intentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Mon1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mon1);
        ImageView nutVeMain = findViewById(R.id.imgBackMain2);
        nutVeMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent veMain = new Intent(Mon1.this, HomeActivity.class);
                startActivity(veMain);
            }
        });
    }
}