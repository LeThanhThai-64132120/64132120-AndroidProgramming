package vn.lethanhthai.a64132120_thigiuaky;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ItemActivity extends AppCompatActivity {

    TextView textViewGiaTriNhanDuoc;
    ImageView imageViewBackList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item);

        textViewGiaTriNhanDuoc = findViewById(R.id.tvItem);
        // nhan
        String giaTriNhan = getIntent().getStringExtra("item");
        // gan
        textViewGiaTriNhanDuoc.setText(giaTriNhan);
    }
}