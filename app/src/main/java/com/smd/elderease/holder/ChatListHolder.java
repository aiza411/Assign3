package com.smd.elderease.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smd.elderease.R;

public class ChatListHolder extends RecyclerView.ViewHolder
{
    public TextView person_name;
    public TextView unread_msg;
    public ImageView person_image;

    public ChatListHolder(@NonNull View itemView) {
        super(itemView);

        this.person_name=itemView.findViewById(R.id.person_name);
        this.unread_msg=itemView.findViewById(R.id.unread_message);
        this.person_image=itemView.findViewById(R.id.profile_image);
    }
}
