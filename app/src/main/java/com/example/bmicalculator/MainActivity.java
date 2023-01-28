package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // This is connected to button's "on click"
    public void makeConversion(View view) {
        // read weight and height input value and convert the text to float
        EditText editTextWeight = findViewById(R.id.editTextWeight);
        String weightAsString = editTextWeight.getText().toString();
        float weight = Float.valueOf(weightAsString);
        EditText editTextHeight = findViewById(R.id.editTextHeight);
        String heightAsString = editTextHeight.getText().toString();
        float height = Float.valueOf(heightAsString);
        float heightMeter = (float) (height * 0.01);
        float heightSquare = (float) Math.pow(heightMeter,2);
        float bmi = weight / heightSquare;

        // calculate IBM based on the value and write it to TextView
        TextView textViewIbm = findViewById(R.id.textViewIbm);
        textViewIbm.setText(""+ bmi + "" );
    }
}