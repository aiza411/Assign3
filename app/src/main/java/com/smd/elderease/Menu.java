package com.smd.elderease;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.smd.elderease.classes.ChatList;
import com.smd.elderease.fragments.Chat;
import com.smd.elderease.fragments.Emergency;
import com.smd.elderease.fragments.Home;

public class Menu extends AppCompatActivity {

    Button home_button;
    Button reminder_button;
    Button chat_button;
    Button alert_button;

    LinearLayout fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        home_button=findViewById(R.id.home_btn);
        reminder_button=findViewById(R.id.reminder_btn);
        chat_button=findViewById(R.id.chat_btn);
        alert_button=findViewById(R.id.emergency_btn);
        fragment=findViewById(R.id.fragment);


        home_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Home fragment_home=new Home();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment,fragment_home);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        alert_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Emergency fragment_home=new Emergency();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment,fragment_home);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        chat_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Chat fragment_home=new Chat();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment,fragment_home);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
}