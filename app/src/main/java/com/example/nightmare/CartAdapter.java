package com.example.nightmare;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.nightmare.database.OrderContract;

public class CartAdapter extends CursorAdapter {


    public CartAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.cartlist, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        // getting theviews

        TextView phoneName, yesTemp, yesBack, price, quantity;


        phoneName = view.findViewById(R.id.phoneNameinOrderSummary);
        price = view.findViewById(R.id.priceinOrderSummary);
        yesTemp = view.findViewById(R.id.addTemperdGlass);
        yesBack = view.findViewById(R.id.addbackcover);
        quantity = view.findViewById(R.id.quantityinOrderSummary);

        // getting the values by first getting the position of their columns

        int name = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_NAME);
        int priceofphone = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_PRICE);
        int quantityofphone = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_QUANTITY);
        int hasTemperd = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_HASTEMPERD);
        int hasBackcover = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_HASBACKCOVER);


        String nameofphone = cursor.getString(name);
        String pricesofphone = cursor.getString(priceofphone);
        String quantitysofphone = cursor.getString(quantityofphone);
        String yeshastemperd = cursor.getString(hasTemperd);
        String yeshasbackcover = cursor.getString(hasBackcover);



        phoneName.setText(nameofphone);
        price.setText(pricesofphone);
        //yesTemp.setText(yeshastemperd);
        // yesBack.setText(yeshasbackcover);
        quantity.setText(quantitysofphone);





    }
}
