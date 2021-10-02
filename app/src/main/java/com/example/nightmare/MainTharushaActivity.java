package com.example.nightmare;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainTharushaActivity extends AppCompatActivity {

    List<Model> modelList;
    RecyclerView recyclerView;
    OrderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tharusha);

        // creating an arraylist

        modelList = new ArrayList<>();
        modelList.add(new Model("Iphone 12", getString(R.string.iphone12), R.drawable.apple12 ));
        modelList.add(new Model("Iphone X", getString(R.string.iphone10), R.drawable.apple10));
        modelList.add(new Model("Xiomi mi 10 Pro", getString(R.string.mi10pro), R.drawable.mi10pro));
        modelList.add(new Model("Oppo F11", getString(R.string.oppo11), R.drawable.oppof11));
        modelList.add(new Model("NOKIA Macleran Plus", getString(R.string.nokiamac), R.drawable.nokiyamac));
        modelList.add(new Model("Iphone 7 Plus", getString(R.string.apple7), R.drawable.iphone7plus));
        modelList.add(new Model("Samsung m21", getString(R.string.samsungm21), R.drawable.m21));
        modelList.add(new Model("Samsung note10", getString(R.string.samsungno10), R.drawable.samsungnote10));
        modelList.add(new Model("Samsung galaxy S9", getString(R.string.galaxys9), R.drawable.galaxys9));

        // recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));
        // adapter
        mAdapter = new OrderAdapter(this, modelList);
        recyclerView.setAdapter(mAdapter);




    }
}