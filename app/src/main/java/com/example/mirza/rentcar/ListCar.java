package com.example.mirza.rentcar;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mirza on 4/29/2018.
 */

public class ListCar extends ArrayAdapter<ConfirmCar> {


    private Activity context;
    private List<ConfirmCar> listcar;

    public ListCar(Activity context, List<ConfirmCar> listcar){

        super(context, R.layout.listcar, listcar);
        this.context=context;
        this.listcar=listcar;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layout= context.getLayoutInflater();

        View listcaro= layout.inflate(R.layout.listcar, null, true);


        TextView txtv= (TextView) listcaro.findViewById(R.id.textv2);
        TextView txtv1= (TextView) listcaro.findViewById(R.id.textv3);
        TextView txtv2= (TextView) listcaro.findViewById(R.id.textv4);
        TextView txtv4= (TextView) listcaro.findViewById(R.id.textv5);
        TextView txtv5= (TextView) listcaro.findViewById(R.id.textv8);
        TextView txtv6= (TextView) listcaro.findViewById(R.id.textv9);
        TextView txtv7= (TextView) listcaro.findViewById(R.id.textv10);


        ConfirmCar con= listcar.get(position);

        txtv.setText(con.getName());
        txtv1.setText(con.getIdcrd());
        txtv2.setText(con.getLoc()); txtv4.setText(con.getTime()); txtv5.setText(con.getDate()); txtv6.setText(con.getPhno()); txtv7.setText(con.getCarname());


        return listcaro;






    }
}



