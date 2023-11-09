package com.smd.elderease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Signup extends AppCompatActivity
{

    RelativeLayout join_layout,signup_layout;

    Button join_btn,signup_btn;
    TextView login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        join_layout=findViewById(R.id.join_layout);
        signup_layout=findViewById(R.id.signup_layout);

        join_btn=findViewById(R.id.join_btn);
        signup_btn=findViewById(R.id.signup_btn);
        login_btn=findViewById(R.id.login_btn);


        join_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                join_layout.setVisibility(View.INVISIBLE);
                signup_layout.setVisibility(View.VISIBLE);
            }
        });

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Signup.this,ChooseRole.class);
                startActivity(intent);
            }
        });

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Signup.this,Login.class);
                startActivity(intent);
            }
        });
    }
}