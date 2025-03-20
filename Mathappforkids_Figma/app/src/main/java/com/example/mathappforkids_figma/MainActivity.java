package com.example.mathappforkids_figma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView CardMode1,CardMode2,CardMode3 ,CardMode4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            CardMode1 = findViewById(R.id.mode1Card);
            CardMode2 = findViewById(R.id.mode2Card);
            CardMode3 = findViewById(R.id.mode3Card);
            CardMode4 = findViewById(R.id.mode4Card);

            CardMode1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Count.class);
                    startActivity(intent);
                }
            });
//
            CardMode2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Match.class);
                    startActivity(intent);
                }
            });


            CardMode4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Settings.class);
                    startActivity(intent);
                }
            });
    }
}