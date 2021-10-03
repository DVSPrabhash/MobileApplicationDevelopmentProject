package com.example.nightmare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class adminHome extends AppCompatActivity {

    //intialiation
    Button btn_home4, btn_home5, btn_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        btn_home4 = (Button) findViewById(R.id.btn_home4);
        btn_home5 = (Button) findViewById(R.id.btn_home5);
        btn_logout = (Button) findViewById(R.id.btn_logout);
    }

    public void logInAdmin(View view) {
        Intent intent = new Intent(this, AdminInterfaceIt20149994Activity.class);
        startActivity(intent);
    }

    public void openAddDevice(View view){
        Intent intent = new Intent(this,MainHimashaActivity.class);
        startActivity(intent);
    }

    public void logout(View view){
        Toast.makeText(adminHome.this, "Logout Success", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,logIn.class);
        startActivity(intent);
    }


}