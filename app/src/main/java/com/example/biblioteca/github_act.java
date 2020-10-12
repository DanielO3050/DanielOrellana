package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

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
        int CFa= 5000;
        int CRe = 12000;
        int CAL = 45000;

        if (libro.equals("Farenheith"))
        {
            textView.setText(new StringBuilder().append("El costo de ").append("Farenheith ").append("Es de ").append(CFa).toString());
        }
        else if (libro.equals("Revival"))
        {
            textView.setText(new StringBuilder().append("El costo de ").append("Revival ").append("Es de ").append(CRe).toString());
        }
        else if (libro.equals("El Alquimista"))
        {
            textView.setText(new StringBuilder().append("El costo de ").append("El Alquimista ").append("Es de ").append(CAL).toString());
        }
    }

}