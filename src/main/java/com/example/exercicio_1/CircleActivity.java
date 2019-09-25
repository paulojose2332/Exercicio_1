package com.example.exercicio_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CircleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
    }

    public void btClickRadius(View v){
        EditText radiusValue = findViewById(R.id.circleRadius);
        try{
            double value = Double.parseDouble(radiusValue.getText().toString());
            double result = 0;

            result = (value * value) * 3.1415;

            Intent openResponse = new Intent(this, ResponseActivity.class);
            openResponse.putExtra("result", result);
            startActivity(openResponse);
        }catch (Exception e){
            Toast.makeText(this, "Erro ao realizar o cálculo!", Toast.LENGTH_LONG).show();
        }
    }
}
