package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class github_act extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spinner= (Spinner)findViewById(R.id.spinner);
        textView1 =(TextView)findViewById(R.id.t2);

        String[] lista1 = {"Farenheith", "Revival", "El Alquimista"};

        ArrayAdapter<String> adap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista1);
        spinner.setAdapter(adap);




    }
    public void Mostrar(View v)
    {
        String m1 = getIntent().getStringExtra("mensaje1");
        String m2 = getIntent().getStringExtra("mensaje2");
        String m3 = getIntent().getStringExtra("mensaje3");
        String libro = spinner.getSelectedItem().toString();

        if (libro.equals("Farenheith")) {
            textView1.setText(m1);
        } else if (libro.equals("Revival")) {
            textView1.setText(m2);
        } else if (libro.equals("El Alquimista")) {
            textView1.setText(m3);
        }
    }
}