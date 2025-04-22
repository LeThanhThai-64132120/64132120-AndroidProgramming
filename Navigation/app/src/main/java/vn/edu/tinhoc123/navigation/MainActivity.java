package vn.edu.tinhoc123.navigation;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


// tìm
        bottomNav = findViewById(R.id.bot_nav);
        // Lắng nghe sk user click vào
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int mnuItemDuocChonID = item.getItemId();
                if (mnuItemDuocChonID == R.id.mnu_home) {
                    // thay fragment
                    Toast.makeText(MainActivity.this, "Thay Home", Toast.LENGTH_SHORT).show();
                }
                else if (mnuItemDuocChonID == R.id.mnu_search) {
                    Toast.makeText(MainActivity.this, "Thay Search", Toast.LENGTH_SHORT).show();
                }
                else if (mnuItemDuocChonID == R.id.mnu_frofile) {
                    Toast.makeText(MainActivity.this, "Thay Profile", Toast.LENGTH_SHORT).show();
                }
                else {
                    return false;
                }

                return true;
            }
        });


    }
}