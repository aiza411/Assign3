package com.smd.elderease.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.smd.elderease.R;

public class RoleHolder extends RecyclerView.ViewHolder
{

    public TextView role_name;
    public TextView role_description;
    public ImageView role_image;

    public CardView cardView;
    public RoleHolder(@NonNull View itemView) {
        super(itemView);

        this.cardView=itemView.findViewById(R.id.card_layout);
        this.role_image=itemView.findViewById(R.id.role_picture);
        this.role_name=itemView.findViewById(R.id.role_name);
        this.role_description=itemView.findViewById(R.id.role_description);
    }
}
