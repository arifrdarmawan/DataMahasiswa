package com.example.datamahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void LihatData (View view){
        Intent i = new Intent(this, DataMahasiswa.class);
        startActivity(i);
    }
    public void InputData(View view){
        Intent i = new Intent(this, InputData.class);
        startActivity(i);
    }
    public void Informasi(View view){
        Intent i = new Intent(this, InputData.class);
        startActivity(i);
    }
}
