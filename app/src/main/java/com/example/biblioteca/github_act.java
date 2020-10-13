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
            Intent a = new Intent(this, github_act.class);
            a.putExtra("mensaje1", "El costo de Farenheith es de: 5000 ");
            String m1 = a.getStringExtra("mensaje1");
            textView.setText(m1);
        }
        if (libro.equals("Revival"))
        {
            Intent b = new Intent(this, github_act.class);
            b.putExtra("mensaje2", "El costo de Revival es de: 12000 ");
            String m2 = b.getStringExtra("mensaje2");
            textView.setText(m2);
        }
        if (libro.equals("El Alquimista"))
        {
            Intent c = new Intent(this, github_act.class);
            c.putExtra("mensaje3", "El costo de El Alquimista es de: 45000 ");
            String m3 = c.getStringExtra("mensaje3");
            textView.setText(m3);
        }

    }

}