package vn.lethanhthai.a64132120_thigiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RecyclerItemActivity extends AppCompatActivity {

    TextView textViewCaption;
    ImageView imageViewAnh, imageViewHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_item);

        textViewCaption = findViewById(R.id.tvCaption);
        imageViewAnh = findViewById(R.id.imgAnh);
        imageViewHome = findViewById(R.id.imgHome);

        String caption = getIntent().getStringExtra("caption");
        int imageID = getIntent().getIntExtra("imageID", R.mipmap.ic_launcher);

        textViewCaption.setText(caption);
        imageViewAnh.setImageResource(imageID);

        Toast.makeText(this, "Đã chọn: "+caption, Toast.LENGTH_SHORT).show();

        imageViewHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerItemActivity.this, Cau3Activity.class);
                startActivity(intent);
            }
        });

    }
}