package com.smd.elderease;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.smd.elderease.adapter.MedicineAdapter;
import com.smd.elderease.adapter.RoleAdapter;
import com.smd.elderease.classes.Medicine;
import com.smd.elderease.classes.Role;

import java.util.ArrayList;

public class OrderMedicine extends AppCompatActivity {

    RecyclerView recyclerView;
    MedicineAdapter medicineAdapter;
    ArrayList<Medicine> medicines;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_medicine);

        getMedicineData();

        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(OrderMedicine.this,2));
        medicineAdapter=new MedicineAdapter(OrderMedicine.this,medicines);
        recyclerView.setAdapter(medicineAdapter);
    }

    private void getMedicineData()
    {
        medicines = new ArrayList<>();
        medicines.add(new Medicine("Medicine Name","Medicine Description",12,R.drawable.gradient_background));
        medicines.add(new Medicine("Medicine Name","Medicine Description",12,R.drawable.gradient_background));
        medicines.add(new Medicine("Medicine Name","Medicine Description",12,R.drawable.gradient_background));
    }
}