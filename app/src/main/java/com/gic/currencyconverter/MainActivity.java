package com.gic.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Converter(View view){
        EditText usd=(EditText) findViewById(R.id.usdf);
        Log.i("Test", "Button works");
        double usdc=Double.parseDouble(usd.getText().toString());
        TextView inr=(TextView) findViewById(R.id.inrf);

        double usda=usdc*74.70;
        inr.setText(""+usda);
        Toast.makeText(this, "Conversion rate: 1$=74.70 INR!", Toast.LENGTH_LONG).show();
        ImageView bgc=(ImageView) findViewById(R.id.bg);
        bgc.setImageResource(R.drawable.cc);


    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}