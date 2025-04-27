package vn.edu.tinhoc123.baitaptonghopthi;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemId = item.getItemId();
                if (itemId == R.id.nav_welcome){
                    selectedFragment = new HomeFragment();
                } else if (itemId == R.id.nav_cau1 ) {
                    selectedFragment = new Cau1Fragment();
                }
                else if(itemId == R.id.nav_cau2){
                    selectedFragment = new Cau2Fragment();
                } else if (itemId == R.id.nav_cau3) {
                    selectedFragment = new Cau3Fragment();
                } else if (itemId == R.id.nav_cau4) {
                    selectedFragment = new Cau4Fragment();
                }

                if (selectedFragment != null){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentSpace, selectedFragment)
                            .commit();
                }
                return true;


            }
        });
    }
}