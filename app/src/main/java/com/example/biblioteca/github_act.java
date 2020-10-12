package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class github_act extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spinner= (Spinner)findViewById(R.id.spinner);
        textView =(TextView)findViewById(R.id.t2);

        String[] lista1 = {"Farenheith", "Revival", "El Alquimista"};

        ArrayAdapter<String> adap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista1);
        spinner.setAdapter(adap);

        String libro = spinner.getSelectedItem().toString();


        if (libro.equals("Farenheith"))
        {
            Intent i = new Intent(this, github_act.class);
            i.putExtra("mensaje1", "El costo de Farenheith es de: 5000 ");
            startActivity(i);

            String m1 = getIntent().getStringExtra("mensaje1");
            textView.setText(m1);
        }
        else if (libro.equals("Revival"))
        {
            Intent i = new Intent(this, github_act.class);
            i.putExtra("mensaje2", "El costo de Revival es de: 12000 ");
            startActivity(i);

            String m2 = getIntent().getStringExtra("mensaje2");
            textView.setText(m2);
        }
        else if (libro.equals("El Alquimista"))
        {
            Intent i = new Intent(this, github_act.class);
            i.putExtra("mensaje3", "El costo de El Alquimista es de: 45000 ");
            startActivity(i);

            String m3 = getIntent().getStringExtra("mensaje3");
            textView.setText(m3);
        }

    }
}