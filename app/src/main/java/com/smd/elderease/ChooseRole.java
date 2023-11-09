package com.smd.elderease;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.smd.elderease.adapter.RoleAdapter;
import com.smd.elderease.classes.Role;

import java.util.ArrayList;
import java.util.List;

public class ChooseRole extends AppCompatActivity {

    RecyclerView recyclerView;
    RoleAdapter adapter;

    ArrayList<Role> roleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_role);

        getRoleData();


        recyclerView=findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(ChooseRole.this, LinearLayoutManager.HORIZONTAL,false));
        adapter=new RoleAdapter(ChooseRole.this,roleList);
        recyclerView.setAdapter(adapter);
    }

    private void getRoleData()
    {
        roleList = new ArrayList<>();
        roleList.add(new Role("Medical Professional","If you are a healthcare professional, opt for this role to collaborate with caregivers and ensure the well-being of elderly users. Access relevant information and communicate effectively for comprehensive care.",R.drawable.role_doctor));
        roleList.add(new Role("Care Giver","Choose this role if you are responsible for the care of an elderly individual. Coordinate schedules, manage medications, and stay connected with the elderly user and their healthcare team.",R.drawable.role_doctor));
        roleList.add(new Role("Elder","Select this role if you are an elderly individual looking to connect with caregivers and medical professionals. Access features to manage your well-being and stay in touch with your support network",R.drawable.role_doctor));
    }


}