package com.example.recyclerview_luyentap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    // buoc 4. Data cho adapter
    Context context;
    ArrayList<LandScape> lstData;
    // tao construstor

    public LandScapeAdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    // buoc 3. Tao
    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // buoc 5. Ghi de method
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandHolder holderCreated = new ItemLandHolder(vItem);

        return holderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
    // buoc 6. Lấy đối tượng hiển thị
        LandScape landScapeHienThi = lstData.get(position);
        // Trích thông tin
        String caption = landScapeHienThi.getLandCaption();
        String tenFileAnh = landScapeHienThi.getLandImageFileName();
        // Đặt các trường thông tin vào holder
        holder.tvCaption.setText(caption);
        // đặt ảnh
        String packagedName = holder.itemView.getContext().getPackageName();
        // Lấy id của ảnh
        int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipmap",packagedName);
        holder.ivLandScape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        // buoc 7
        return lstData.size();
    }
    // xây đựng View Holer trước rồi điền vào <>
    // bước 1. tạo  View Holer
    class ItemLandHolder extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView ivLandScape;


        // taoj construstor
        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandScape = itemView.findViewById(R.id.imageViewLand);
        }
// buoc 2. Dien <>
    }
}
