package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemlandHoler> {

    Context context;
    ArrayList<LandScape> lstData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemlandHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent, false);
        ItemlandHoler viewholderCreated =  new ItemlandHoler(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemlandHoler holder, int position) {

        // Lấy đối tượng hiển thị
        LandScape landScapeHienThi = lstData.get(position);
        //Trích thông tin
        String caption = landScapeHienThi.getLandCaption();
        String tenFileAnh  = landScapeHienThi.getLandScapeFileName();
        // Đặt vào trường thông tin của Holder
        holder.tvCaption.setText(caption);
        // Đặt ảnh
            String  packedName = holder.itemView.getContext().getPackageName();
            // Lấy id ảnh
            int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh,"mipmap", packedName);
        holder.ivLandScape.setImageResource(imageID);

    }

    @Override
    public int getItemCount() {
        return lstData.size();
    } // Kế thừa

    class ItemlandHoler extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView ivLandScape;
        public ItemlandHoler(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandScape = itemView.findViewById(R.id.imageViewLand);

        }
    }
    
}
