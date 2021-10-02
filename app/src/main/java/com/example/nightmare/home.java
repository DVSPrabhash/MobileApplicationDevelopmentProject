package com.example.nightmare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class home extends AppCompatActivity {
    public static final String EXTRA_USERNAME = "com.example.nightmare.USERNAME";

    //intialiation
    Button btn_home1, btn_home2, btn_home3, btn_logout;
            //btn_home4, btn_home5;
    EditText etusername;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String username = intent.getStringExtra(logIn.EXTRA_USERNAME);
        etusername = findViewById(R.id.etusername);
        etusername.setText(username);
        etusername = findViewById(R.id.etusername);

        btn_home1 = (Button) findViewById(R.id.btn_home1);
        btn_home2 = (Button) findViewById(R.id.btn_home2);
        btn_home3 = (Button) findViewById(R.id.btn_home3);
        btn_logout = (Button) findViewById(R.id.btn_logout);
        //btn_home4 = (Button) findViewById(R.id.btn_home4);
       // btn_home5 = (Button) findViewById(R.id.btn_home5);

    }

    public void openWallet(View view){
        Intent intent = new Intent(this,addMyCard.class);
        startActivity(intent);
    }

    public void logInUser(View view) {
        Intent intent = new Intent(this, UserInterfaceIt20149994Activity.class);
        EditText editText = (EditText) findViewById(R.id.etusername);
        String username = editText.getText().toString();
        intent.putExtra(EXTRA_USERNAME, username);
        startActivity(intent);
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
        Toast.makeText(home.this, "Logout Success", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,logIn.class);
        startActivity(intent);
    }

    public void openProducts(View view){
        Intent intent = new Intent(this,MainTharushaActivity.class);
        startActivity(intent);
    }

}