package vn.lethanhthai.a64132120_thigiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Cau3Activity extends AppCompatActivity {

    ElectronicAdapter electronicAdapter;
    ArrayList<Electronic> recyclerViewData;
    RecyclerView recyclerViewElectronic;

    ImageView imageViewHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau3);

        recyclerViewData = getDataForRecyclerView();
        recyclerViewElectronic = findViewById(R.id.recyclerElectronic);

        RecyclerView.LayoutManager layoutLinear =new LinearLayoutManager(this);
        recyclerViewElectronic.setLayoutManager(layoutLinear);

        electronicAdapter =new ElectronicAdapter(this, recyclerViewData);

        recyclerViewElectronic.setAdapter(electronicAdapter);

    }
    //7 Khởi tạo và setting tại activity Hiển thị
    // tạo data
    ArrayList<Electronic> getDataForRecyclerView() {
        // tao danh sach
        ArrayList<Electronic> dsDuLieu = new ArrayList<Electronic>();
        dsDuLieu.add(new Electronic("huccong", "Húc đổ cổng Dinh Độc Lập"));
        dsDuLieu.add(new Electronic("vesinh", "Thanh niên vệ sinh bãi biển"));
        dsDuLieu.add(new Electronic("trongcay", "Thanh niên trồng cây"));
        dsDuLieu.add(new Electronic("chienthangdbp", "Chiến thắng Điện Biên Phủ"));
        dsDuLieu.add(new Electronic("chaoco", "Chào cờ"));

        return dsDuLieu;
    }
}