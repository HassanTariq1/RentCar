package com.example.mirza.rentcar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mirza on 4/26/2018.
 */

public class CustomAdapter extends BaseAdapter {


    Context context;

    int[] car;
    String[] names;

    LayoutInflater layout= null;


    public CustomAdapter(Context applicationContext, int[] car, String[] names) {



        this.context= applicationContext;
        this.car= car;
        this.names=names;
        layout=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
         return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View caritem= layout.inflate(R.layout.names_car, null);
        ImageView img= (ImageView) caritem.findViewById(R.id.carimg);
        TextView txt= (TextView) caritem.findViewById(R.id.carnam);

        txt.setText(names[position]);
        img.setImageResource(car[position]);



        return caritem;




    }


    }

