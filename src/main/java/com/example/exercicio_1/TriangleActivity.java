package com.example.exercicio_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TriangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
    }

    public void btClickTriangle(View v){
        EditText baseValue = findViewById(R.id.triangleBase);
        EditText highValue = findViewById(R.id.triangleHigh);
        try{
            double base = Double.parseDouble(baseValue.getText().toString());
            double high = Double.parseDouble(highValue.getText().toString());
            double result = 0;

            result = (base * high)/2;

            Intent openResponse = new Intent(this, TriangleResponse.class);
            openResponse.putExtra("result", result);
            startActivity(openResponse);
        }catch (Exception e){
            Toast.makeText(this, "Erro ao realizar o cálculo!", Toast.LENGTH_LONG).show();
        }
    }
}
