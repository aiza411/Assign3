package com.smd.elderease.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smd.elderease.Checkout;
import com.smd.elderease.R;
import com.smd.elderease.UserChat;
import com.smd.elderease.classes.ChatList;
import com.smd.elderease.classes.Medicine;
import com.smd.elderease.holder.ChatListHolder;
import com.smd.elderease.holder.MedicineHolder;

import java.util.ArrayList;

public class MedicineAdapter extends RecyclerView.Adapter<MedicineHolder>{
    Context c;
    ArrayList<Medicine> models;

    public MedicineAdapter(Context c, ArrayList<Medicine> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MedicineHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.medicine,null);
        return new MedicineHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MedicineHolder holder, int position)
    {
        holder.medicine_name.setText(models.get(position).getMedicine_name());
        holder.medicine_description.setText(models.get(position).getMedicine_descriptiomn());
        holder.price.setText(String.valueOf(models.get(position).getPrice()));
        holder.medicine_image.setImageResource(models.get(position).getImage());

        Animation animation= AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent credentialsIntent = new Intent(c, Checkout.class);
                c.startActivity(credentialsIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
