package com.example.exercicio_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btClicked(View v){
        try{


            RadioGroup choice = findViewById(R.id.rGOperation);

            if (choice.getCheckedRadioButtonId() == R.id.circleRButton) {
                Intent openCircleActivity = new Intent(this, CircleActivity.class);
                startActivity(openCircleActivity);
            } else if (choice.getCheckedRadioButtonId() == R.id.squareRButton) {
                Intent openSquareActivity = new Intent(this, SquareActivity.class);
                startActivity(openSquareActivity);
            }else if (choice.getCheckedRadioButtonId() == R.id.triangleRButton) {
                Intent openTriangleActivity = new Intent(this, TriangleActivity.class);
                startActivity(openTriangleActivity);
            }



        }catch (Exception e){
            Toast.makeText(this, "Error on the loading!", Toast.LENGTH_LONG).show();
        }
    }
}
