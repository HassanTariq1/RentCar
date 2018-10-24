package com.example.mirza.rentcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText namea, Idcrdd, loca ,timee, datee, phnoo, carnamee;
    DatabaseReference data;


    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        namea= (EditText) findViewById(R.id.textname);
        Idcrdd= (EditText) findViewById(R.id.idnmbr);
        loca= (EditText) findViewById(R.id.textloc);
        timee= (EditText) findViewById(R.id.txttime);
        datee= (EditText) findViewById(R.id.txtdate);
        phnoo= (EditText) findViewById(R.id.phtext);
        carnamee= (EditText) findViewById(R.id.carname);

        data= FirebaseDatabase.getInstance().getReference("confirm");


        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addconfirm();


                Intent i= new Intent(MainActivity.this, Check.class);
                startActivity(i);


            }
        });



    }

    private void addconfirm() {


        String name= namea.getText().toString().trim();
        String Idcrd=Idcrdd.getText().toString().trim();
        String loc= loca.getText().toString().trim();
        String time= timee.getText().toString().trim();
        String date= datee.getText().toString().trim();
        String phno= phnoo.getText().toString().trim();
        String carname= carnamee.getText().toString().trim();
        if(!TextUtils.isEmpty(Idcrd)){

            String id =data.push().getKey();
            ConfirmCar or=new ConfirmCar(name, Idcrd,loc,time,date,phno,carname);
            data.child(id).setValue(or);
            Toast.makeText(this,"Confirm", Toast.LENGTH_SHORT).show();
        }else {

            Toast.makeText(this,"Need to fill All Values ", Toast.LENGTH_SHORT).show();

        }




    }



}
