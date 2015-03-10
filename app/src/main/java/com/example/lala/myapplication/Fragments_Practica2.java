package com.example.lala.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Fragments_Practica2 extends Activity implements imagen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments__practica2);

        if(savedInstanceState != null)
            return;

        getFragmentManager().beginTransaction().add(R.id.caja_imagenes,new Fragment_Imagenes()).commit();
        getFragmentManager().beginTransaction().add(R.id.caja_botones,new Fragment_Botones()).commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fragments__practica2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void clicar_boton(String msg){

        Fragment_Imagenes f= (Fragment_Imagenes) getFragmentManager().findFragmentById(R.id.caja_imagenes);

        if(f !=null) {
            f.cargar_imagen(msg);
        }
    }
}
