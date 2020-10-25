package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progress;
    private Button boton;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress =(ProgressBar)findViewById(R.id.progressBar);
        boton =(Button)findViewById(R.id.button);
        imageButton=(ImageButton)findViewById(R.id.ib1);

        progress.setVisibility(View.INVISIBLE);
        // elemento OnClick (boton de log in)
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Task().execute();
            }
        });

    }

    // tarea asincronica
    class Task extends AsyncTask<String, Void, String>
    {

        @Override
        protected void onPreExecute() {
            progress.setVisibility(View.VISIBLE); // Hace visible la progressbar.
        }

        @Override
        protected String doInBackground(String... strings) {
            for (int i=1; i<=10; i++){
                try {
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }

            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {

            progress.setVisibility(View.INVISIBLE);
            Intent i = new Intent(getBaseContext(),Home_act.class);
            startActivity(i);
        }

    }

    public void Github(View v)
    {
        Intent i = new Intent(this,github_act.class);
        i.putExtra("mensaje1", "El costo de Farenheith es de: 7000 ");
        i.putExtra("mensaje2", "El costo de Revival es de: 22000 ");
        i.putExtra("mensaje3", "El costo de El Alquimista es de: 45000 ");
        i.putExtra("mensaje4", "El costo de El Poder es de: 88000 ");
        i.putExtra("mensaje5", "El costo de Despertar es de: 156000 ");
        startActivity(i);

    }
}