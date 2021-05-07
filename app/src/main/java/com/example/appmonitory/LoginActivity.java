package com.example.appmonitory;
//Nama : Rizky Muslimin
//NIM: 10118002
//Kelas : IF-1

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btn_masuk(View view) {
        Intent intent =  new Intent(this, com.example.appmonitory.BiodataActivity.class);
        startActivity(intent);
    }
}