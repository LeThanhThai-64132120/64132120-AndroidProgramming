package com.example.luyentapgk;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ElectronicAdapter extends RecyclerView.Adapter<ElectronicAdapter.ItemElectronicHolder> {
//3
    Context context;
    ArrayList<Electronic> lstData;

    // generate construstor
    public ElectronicAdapter(Context context, ArrayList<Electronic> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    //2
    @NonNull
    @Override
    public ItemElectronicHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 4
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_electronic, parent, false);
        ItemElectronicHolder viewholderCreated = new ItemElectronicHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemElectronicHolder holder, int position) {

        //5 lấy đối tượng hiển thị
        Electronic electronicHienThi = lstData.get(position);
        // Trích thông tin
        String caption = electronicHienThi.getElectronicCaption();
        String tenFileAnh = electronicHienThi.getElectronicImageFileName();
        // đặt vào các trường info của holder
        holder.tvCaption.setText(caption);
        // đặt ảnh
        String packageName =  holder.itemView.getContext().getPackageName();
        // lấy id ảnh
        int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh,"mipmap", packageName);
        holder.ivElectronic.setImageResource(imageID);


        // bắt sự kiện
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RecyclerItemActivity.class);
                intent.putExtra("caption", caption);
                intent.putExtra("imageID", imageID);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        //6
        return lstData.size();
    }

    // 1
    class ItemElectronicHolder extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView ivElectronic;

        public ItemElectronicHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivElectronic = itemView.findViewById(R.id.imageViewElectronic);
        }
    }
}
