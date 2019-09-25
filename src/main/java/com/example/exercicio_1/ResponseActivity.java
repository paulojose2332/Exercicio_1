package com.example.exercicio_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResponseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_response2);

        double result = getIntent().getDoubleExtra("result", -1);

        TextView tvRes = findViewById(R.id.resultText);
        tvRes.setText( String.valueOf(result) );
    }

    public void backHomeButtom(View v){
        Intent backHome = new Intent(this, MainActivity.class);
        startActivity(backHome);
    }
}
