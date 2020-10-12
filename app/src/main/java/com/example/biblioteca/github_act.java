package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class github_act extends AppCompatActivity {

    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spinner= (Spinner)findViewById(R.id.spinner);

        String[] lista1 = {"Farenheith", "Revival", "El Alquimista"};

        ArrayAdapter<String> adap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista1);
        spinner.setAdapter(adap);
    }

    public void libros()
    {
        int Farenheith= 5000;
        int Revival = 12000;
        int El_Alquimista = 45000;
    }

}