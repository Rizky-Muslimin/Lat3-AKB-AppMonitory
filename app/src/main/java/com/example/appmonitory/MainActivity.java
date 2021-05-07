package com.example.appmonitory;
//Nama : Rizky Muslimin
//NIM: 10118002
//Kelas : IF-1

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnmulai(View view) {
        Intent intent =  new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}