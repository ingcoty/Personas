package com.example.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class CrearPersonas extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Persona> personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);

        tabla = findViewById(R.id.tblPersonas);
        personas = Datos.obtener();

        for(int i=0; i<personas.size(); i++){
            TableRow fila = new TableRow(this);
            TextView nro = new TextView(this);
            TextView cedula = new TextView(this);
            TextView nombre = new TextView(this);
            TextView apellido = new TextView(this);

            nro.setText(""+(i+1));
            cedula.setText(personas.get(i).getCedula());
            nombre.setText(personas.get(i).getNombre());
            apellido.setText(personas.get(i).getApellido());

            fila.addView(nro);
            fila.addView(cedula);
            fila.addView(nombre);
            fila.addView(apellido);

            tabla.addView(fila);
        }
    }
}