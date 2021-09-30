package com.example.nightmare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    //intialiation
    Button btn_home1, btn_home2, btn_home3, btn_home4, btn_home5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_home1 = (Button) findViewById(R.id.btn_home1);
        btn_home2 = (Button) findViewById(R.id.btn_home2);
        btn_home3 = (Button) findViewById(R.id.btn_home3);
        btn_home4 = (Button) findViewById(R.id.btn_home4);
        btn_home5 = (Button) findViewById(R.id.btn_home5);

    }

    public void openWallet(View view){
        Intent intent = new Intent(this,addMyCard.class);
        startActivity(intent);
    }

}