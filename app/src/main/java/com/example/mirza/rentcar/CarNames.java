package com.example.mirza.rentcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class CarNames extends AppCompatActivity {
    Button btn;


    ListView list;
    int[] car= new int[]{R.drawable.accord, R.drawable.audi , R.drawable.bmw, R.drawable.civic, R.drawable.hummer, R.drawable.mercedes, R.drawable.prado, R.drawable.range  };

    String [] names= new String[]{"Accord    $100/day","Audi   $100/day","BMW   $100/day","Civic   $100/day","Hummer    $100/day","Mercedes    $100/day","Prado    $100/day"  };


    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_names);
        adapter= new CustomAdapter(getApplicationContext(),car, names);
       list=(ListView)findViewById(R.id.listc);
        btn= (Button) findViewById(R.id.owner);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarNames.this, Check.class);
                startActivity(i);


            }
        });

        list.setAdapter(adapter);



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), names[position], Toast.LENGTH_SHORT).show();

                if (position == 0) {

                    Intent i = new Intent(CarNames.this, MainActivity.class);
                    startActivity(i);


                }
                if (position == 1) {

                    Intent i = new Intent(CarNames.this, MainActivity.class);
                    startActivity(i);


                }
                if (position == 2) {

                    Intent i = new Intent(CarNames.this, MainActivity.class);
                    startActivity(i);


                }
                if (position == 3) {

                    Intent i = new Intent(CarNames.this, MainActivity.class);
                    startActivity(i);


                }
                if (position == 4) {

                    Intent i = new Intent(CarNames.this, MainActivity.class);
                    startActivity(i);


                }
                if (position == 5) {

                    Intent i = new Intent(CarNames.this, MainActivity.class);
                    startActivity(i);


                }
                if (position == 6) {

                    Intent i = new Intent(CarNames.this, MainActivity.class);
                    startActivity(i);


                }
                if (position == 7) {

                    Intent i = new Intent(CarNames.this, MainActivity.class);
                    startActivity(i);


                }
                if (position == 8) {

                    Intent i = new Intent(CarNames.this, MainActivity.class);
                    startActivity(i);


                }
            }
        });






    }
}
