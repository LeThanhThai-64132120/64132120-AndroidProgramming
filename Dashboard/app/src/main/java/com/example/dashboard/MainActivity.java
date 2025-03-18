package com.example.dashboard;

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
    CardView clothingCard, electronicCard, homeCard, beautyCard, pharmacyCard, groceriesCard ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        clothingCard = findViewById(R.id.clothingCard);
        electronicCard= findViewById(R.id.electronicCard);
        homeCard = findViewById(R.id.homeCard);
        beautyCard = findViewById(R.id.beautyCard);
        pharmacyCard = findViewById(R.id.beautyCard);
        groceriesCard = findViewById(R.id.groceriesCard);

        clothingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClothingActivity.class);
                startActivity(intent);
            }
        });

        electronicCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentELec = new Intent(MainActivity.this, ElectronicActivity.class);
                startActivity(intentELec);
            }
        });

    }
}