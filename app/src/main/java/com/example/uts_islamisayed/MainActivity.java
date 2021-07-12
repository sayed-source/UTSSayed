package com.example.uts_islamisayed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alqrn(View view) {
        Intent inew = new Intent(this,alquran.class);
        startActivity(inew);
    }

    public void Taurt(View view) {
        Intent inew = new Intent(this,taurat.class);
        startActivity(inew);
    }

    public void Injl(View view) {
        Intent inew = new Intent(this,injil.class);
        startActivity(inew);
    }

    public void Zabr(View view) {
        Intent inew = new Intent(this,zabur.class);
        startActivity(inew);
    }
}