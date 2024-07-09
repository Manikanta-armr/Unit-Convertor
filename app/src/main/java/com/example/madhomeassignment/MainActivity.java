package com.example.madhomeassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView temp;
        CardView weight;
        CardView length;
        CardView speed;
        CardView freq;
        CardView vol;
        CardView time;
        CardView area;
        CardView fuel;
        CardView pressure;
        CardView energy;
        CardView storage;
        CardView current;
        CardView force;
        CardView resistance;

        temp=findViewById(R.id.cv_tmp);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Temperature is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Temparature.class));
            }
        });

        weight=findViewById(R.id.cv_weight);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Weight is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Weight.class));
            }
        });

        length=findViewById(R.id.cv_length);
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Length is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Length.class));
            }
        });

        speed=findViewById(R.id.cv_speed);
        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Speed is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Speed.class));
            }
        });

        freq=findViewById(R.id.cv_freq);
        freq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Frequency is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Frequency.class));
            }
        });

        vol=findViewById(R.id.cv_vol);
        vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Volume is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Volume.class));
            }
        });

        time=findViewById(R.id.cv_time);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Time is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Time.class));
            }
        });

        area=findViewById(R.id.cv_area);
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Area is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Area.class));
            }
        });

        fuel=findViewById(R.id.cv_fuel);
        fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Fuel is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Fuel.class));
            }
        });

        pressure=findViewById(R.id.cv_pressure);
        pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Pressure is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Pressure.class));
            }
        });

        energy=findViewById(R.id.cv_energy);
        energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Energy is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Energy.class));
            }
        });

        storage=findViewById(R.id.cv_storage);
        storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Storage is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Storage.class));
            }
        });

        current=findViewById(R.id.cv_current);
        current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Current is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Current.class));
            }
        });

        force=findViewById(R.id.cv_force);
        force.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Force is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Force.class));
            }
        });

        resistance=findViewById(R.id.cv_resistance);
        resistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Resistance is Selected",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Resistance.class));
            }
        });
    }
}