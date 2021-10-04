package com.example.nightmare;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.nightmare.database.DBHelperIT20149994;

import java.util.List;

public class AdminInterfaceIt20149994Activity extends AppCompatActivity {

    EditText etDeviceName;
    EditText etManufacturer;
    EditText etYear;
    EditText etPrice;
    EditText etSpecialNotes;
    EditText etDeviceID;
    EditText etusername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_interface_it20149994);

        etDeviceName = findViewById(R.id.etDeviceName);
        etManufacturer = findViewById(R.id.etManufacturer);
        etYear = findViewById(R.id.etYear);
        etPrice = findViewById(R.id.etPrice);
        etSpecialNotes = findViewById(R.id.etSpecialNotes);
        etusername = findViewById(R.id.etusername);
        etDeviceID = findViewById(R.id.etDeviceID);
    }

    // Display all devices from all users
    public void viewAllAdmin(View view){
        DBHelperIT20149994 dbHelper = new DBHelperIT20149994(this);

        List info = dbHelper.readAllAdmin();

        String[] infoArray = (String[]) info.toArray(new String[0]);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Phones Details");

        builder.setItems(infoArray, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String deviceName = infoArray[i].split(":")[0];
                String manufacturer = infoArray[i].split(":")[1];
                String year = infoArray[i].split(":")[2];
                String price = infoArray[i].split(":")[3];
                String specialNotes = infoArray[i].split(":")[4];
                String username = infoArray[i].split(":")[5];
                String deviceID = infoArray[i].split(":")[6];

                etDeviceName.setText(deviceName);
                etManufacturer.setText(manufacturer);
                etYear.setText(year);
                etPrice.setText(price);
                etSpecialNotes.setText(specialNotes);
                etusername.setText(username);
                etDeviceID.setText(deviceID);


            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

    }
}