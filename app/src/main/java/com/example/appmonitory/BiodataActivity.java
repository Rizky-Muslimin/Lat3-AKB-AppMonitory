package com.example.appmonitory;
//Nama : Rizky Muslimin
//NIM: 10118002
//Kelas : IF-1

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class BiodataActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.appmoniitory.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void btn_selanjutnya(View view) {
        Intent intent = new Intent(this, com.example.appmonitory.HomeActivity.class);
        EditText nama = findViewById(R.id.txt_nama);
        String message = nama.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}