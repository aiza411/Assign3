package com.smd.elderease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Credentials extends AppCompatActivity
{
    RelativeLayout doctor_layout,caregiver_layout,elder_layout;

    Button save_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credentials);

        doctor_layout=findViewById(R.id.doctor_layout);
        caregiver_layout=findViewById(R.id.caregiver_layout);
        elder_layout=findViewById(R.id.elder_layout);

        save_btn=findViewById(R.id.save_btn);


        Intent intent = getIntent();
        String selectedRole = intent.getStringExtra("selectedRole");


        if(selectedRole.equals("Medical Professional"))
        {
            doctor_layout.setVisibility(View.VISIBLE);
            caregiver_layout.setVisibility(View.INVISIBLE);
            elder_layout.setVisibility(View.INVISIBLE);
        }

        else if (selectedRole.equals("Care Giver"))
        {
            doctor_layout.setVisibility(View.INVISIBLE);
            caregiver_layout.setVisibility(View.VISIBLE);
            elder_layout.setVisibility(View.INVISIBLE);
        }

        else if (selectedRole.equals("Elder"))
        {
            doctor_layout.setVisibility(View.INVISIBLE);
            caregiver_layout.setVisibility(View.INVISIBLE);
            elder_layout.setVisibility(View.VISIBLE);
        }


        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Credentials.this,Home.class);
                startActivity(intent);
                finish();
            }
        });

    }
}