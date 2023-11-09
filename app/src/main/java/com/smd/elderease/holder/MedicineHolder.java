package com.smd.elderease.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smd.elderease.R;

public class MedicineHolder extends RecyclerView.ViewHolder {
    public TextView medicine_name,medicine_description,price;
    public ImageView medicine_image;

    public MedicineHolder(@NonNull View itemView)
    {
        super(itemView);
        this.medicine_name=itemView.findViewById(R.id.medicine_name);
        this.medicine_description=itemView.findViewById(R.id.medicine_description);
        this.price=itemView.findViewById(R.id.medicine_price);
        this.medicine_image=itemView.findViewById(R.id.medicine_picture);
    }
}
