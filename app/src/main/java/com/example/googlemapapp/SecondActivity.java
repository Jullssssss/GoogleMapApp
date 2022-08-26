package com.example.googlemapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button back;
    TextView tx;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        back = findViewById(R.id.back);
        tx = findViewById(R.id.textView);
        im = findViewById(R.id.imageView2);

        if (Data.marker == 1) {
            tx.setText(Data.d1);
            im.setImageResource(R.drawable.moscow);
        } else if (Data.marker == 2) {
            tx.setText(Data.d2);
            im.setImageResource(R.drawable.voronezh);
        }else if (Data.marker == 3) {
            tx.setText(Data.d3);
            im.setImageResource(R.drawable.tula);
        }else if (Data.marker == 4) {
            tx.setText(Data.d4);
            im.setImageResource(R.drawable.ryazan);
        }else if (Data.marker == 5) {
            tx.setText(Data.d5);
            im.setImageResource(R.drawable.kaluga);
        }else if (Data.marker == 6) {
            tx.setText(Data.d6);
            im.setImageResource(R.drawable.bryansk);
        }else if (Data.marker == 7) {
            tx.setText(Data.d7);
            im.setImageResource(R.drawable.orel);
        }else if (Data.marker == 8) {
            tx.setText(Data.d8);
            im.setImageResource(R.drawable.smolensk);
        }



    }
}