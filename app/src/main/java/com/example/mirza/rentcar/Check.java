package com.example.mirza.rentcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Check extends AppCompatActivity {

    ListView list;
    DatabaseReference database;
    List<ConfirmCar> carList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        database = FirebaseDatabase.getInstance().getReference("confirm");
        carList = new ArrayList<>();




        list = (ListView) findViewById(R.id.listy);






    }
    @Override
    protected void onStart() {
        super.onStart();


        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for(DataSnapshot ordersnapo: dataSnapshot.getChildren()) {


                    ConfirmCar car= ordersnapo.getValue(ConfirmCar.class);

                    carList.add(car);

                }


                ListCar conf= new ListCar(Check.this, carList);
                list.setAdapter((ListAdapter) conf);



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}




