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

import com.smd.elderease.Credentials;
import com.smd.elderease.R;
import com.smd.elderease.classes.Role;
import com.smd.elderease.holder.RoleHolder;

import java.util.ArrayList;

public class RoleAdapter extends RecyclerView.Adapter<RoleHolder>
{
    Context c;
    ArrayList<Role> models;

    public RoleAdapter(Context c, ArrayList<Role> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public RoleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.role,null);
        return new RoleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoleHolder holder, int position)
    {
        holder.role_name.setText(models.get(position).getName());
        holder.role_description.setText(models.get(position).getDescription());
        holder.role_image.setImageResource(models.get(position).getImage());

        Animation animation= AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedRole = models.get(position).getName();
                Intent credentialsIntent = new Intent(c, Credentials.class);
                credentialsIntent.putExtra("selectedRole", selectedRole);
                c.startActivity(credentialsIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
