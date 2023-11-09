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
import com.smd.elderease.UserChat;
import com.smd.elderease.classes.ChatList;
import com.smd.elderease.classes.Role;
import com.smd.elderease.holder.ChatListHolder;
import com.smd.elderease.holder.RoleHolder;

import java.util.ArrayList;

public class ChatListAdapter extends RecyclerView.Adapter<ChatListHolder>
{
    Context c;
    ArrayList<ChatList> models;

    public ChatListAdapter(Context c, ArrayList<ChatList> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public ChatListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_name,null);
        return new ChatListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatListHolder holder, int position)
    {
        holder.person_name.setText(models.get(position).getPerson_name());
        holder.unread_msg.setText(String.valueOf(models.get(position).getUnread_message()));
        holder.person_image.setImageResource(models.get(position).getImage());

        Animation animation= AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent credentialsIntent = new Intent(c, UserChat.class);
                c.startActivity(credentialsIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
