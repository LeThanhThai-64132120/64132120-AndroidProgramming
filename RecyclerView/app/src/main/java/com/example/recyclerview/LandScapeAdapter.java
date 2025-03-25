package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LandScapeAdapter extends RecyclerView.Adapter<   > { // Kế thừa

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
