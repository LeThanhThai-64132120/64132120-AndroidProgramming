package com.example.tinhbmi;

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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // Chú ý: phải có tham số cho hàm
    public void TinhBMI(View v){
        //Tìm data
        EditText canNang = (EditText) findViewById(R.id.edtCanNang);
        EditText chieuCao = (EditText) findViewById(R.id.edtChieuCao);
        TextView KetQua = (TextView) findViewById(R.id.tvKetQua);
        TextView LoiKhuyen = (TextView) findViewById(R.id.tvLoiKhuyen);
        Button btnTinhBMI = findViewById(R.id.btnTinhBMI);

        // Lấy data từ đk đưa vào dạng chuỗi
        String strCanNang = canNang.getText().toString();
        String strChieuCao = chieuCao.getText().toString();

        // Chuyển dạng cho data
        float soCanNang = Float.parseFloat(strCanNang);
        float soChieuCao = Float.parseFloat(strChieuCao);

        // TÍnh BMI
        float BMI = soCanNang / (soChieuCao * soChieuCao);

        // Hiển thị KQ
        //Chuyển về dạng chuỗi để hiển thị
        String strKQ = String.valueOf(BMI);
        KetQua.setText(strKQ);

        // Hiển thị từng phân loại
        /*if(BMI < 18.5) {
            KetQua.setText(strKQ);
            LoiKhuyen.setText("(Thiếu cân - Gầy)\nRủi ro: Dễ bị suy dinh dưỡng, giảm sức đề kháng, loãng xương.\n Lời khuyên:\n" +
                    " Tăng cường chế độ ăn giàu dinh dưỡng: ăn đủ chất đạm, tinh bột, chất béo lành mạnh.\n" +
                    " Ăn nhiều bữa trong ngày, bổ sung thực phẩm giàu calo (bơ, sữa, hạt, thịt, cá).\n" +
                    " Kết hợp tập thể dục để tăng khối lượng cơ (tập tạ, yoga, thể dục nhịp điệu nhẹ nhàng).\n");
        } else if (18.5<= BMI && BMI<= 24.9) {
            KetQua.setText(strKQ);
            LoiKhuyen.setText("(Bình thường - Cân đối)\nRủi ro: Thấp, nhưng vẫn cần duy trì thói quen lành mạnh.\n" +
                    " Lời khuyên:\n" +
                    " Duy trì chế độ ăn uống cân bằng, đủ protein, chất béo, vitamin.\n" +
                    " Tập thể dục thường xuyên (tối thiểu 150 phút/tuần).\n" +
                    " Ngủ đủ giấc, tránh căng thẳng, duy trì tinh thần thoải mái.");
        } else if (25 <= BMI && BMI <= 29.9) {
            KetQua.setText(strKQ);
            LoiKhuyen.setText("(Thừa cân - Hơi béo)\nRủi ro: Nguy cơ mắc bệnh tim mạch, tiểu đường, huyết áp cao tăng lên.\n" +
                    "Lời khuyên:\n" +
                    " Giảm lượng calo nạp vào, hạn chế đồ ăn nhanh, nước ngọt, thực phẩm chế biến sẵn.\n" +
                    " Tăng cường vận động: đi bộ, chạy bộ, tập gym, bơi lội.\n" +
                    " Kiểm soát stress, ngủ đủ giấc để tránh rối loạn chuyển hóa.");
        } else if ( 30 <= BMI && BMI <= 34.9) {
            KetQua.setText(strKQ);
            LoiKhuyen.setText("(Béo phì cấp độ 1)\n Rủi ro: Cao, dễ mắc bệnh tiểu đường, huyết áp cao, gan nhiễm mỡ.\n" +
                    " Lời khuyên:\n" +
                    " Cắt giảm tinh bột xấu (cơm trắng, bánh mì trắng), thay bằng tinh bột tốt (yến mạch, khoai lang).\n" +
                    " Tăng cường chất xơ từ rau xanh, hoa quả ít đường.\n" +
                    " Luyện tập thể dục ít nhất 30-60 phút/ngày.\n" +
                    " Kiểm tra sức khỏe định kỳ.");
        } else if (35 <= BMI && BMI <=39.9) {
            KetQua.setText(strKQ);
            LoiKhuyen.setText("(Béo phì cấp độ 2)\n Rủi ro: Rất cao, dễ mắc bệnh tim mạch, đột quỵ, thoái hóa khớp.\n" +
                    " Lời khuyên:\n" +
                    " Hạn chế tối đa đồ ăn nhanh, nước ngọt, thực phẩm chế biến sẵn.\n" +
                    " Kiểm soát khẩu phần ăn, áp dụng chế độ ăn kiêng khoa học (Mediterranean, DASH).\n" +
                    " Kết hợp tập luyện cường độ cao: HIIT, cardio, tập tạ.\n" +
                    " Tham khảo ý kiến bác sĩ nếu cần giảm cân theo lộ trình y khoa.");
        } else if (BMI >= 40) {
            KetQua.setText(strKQ);
            LoiKhuyen.setText("(Béo phì cấp độ 3 - Béo phì nguy hiểm)\n Rủi ro: Cực kỳ cao, nguy cơ tử vong sớm do biến chứng tim mạch, tiểu đường, ung thư.\n" +
                    " Lời khuyên:\n" +
                    " Áp dụng chế độ ăn kiêng nghiêm ngặt dưới sự hướng dẫn của chuyên gia dinh dưỡng.\n" +
                    " Tập thể dục hàng ngày, bắt đầu từ nhẹ nhàng rồi tăng dần cường độ.\n" +
                    " Cân nhắc các biện pháp y khoa như điều trị bằng thuốc hoặc phẫu thuật giảm cân (nếu cần).\n" +
                    " Kiểm tra sức khỏe định kỳ để theo dõi tiến triển.");
        }*/


    }
}