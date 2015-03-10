package com.example.lala.myapplication;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Imagenes extends Fragment {

    View parentView;

    public Fragment_Imagenes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        parentView = inflater.inflate(R.layout.fragment_fragment__imagenes, container, false);

        return parentView;
    }

    public void cargar_imagen(String msg){
        switch (msg){
            case "1":
                parentView.setBackgroundResource(R.drawable.squirtle_grande);
            break;
            case "2":
                parentView.setBackgroundResource(R.drawable.bulbasaur_grande);
                break;
            case "3":
                parentView.setBackgroundResource(R.drawable.charmander_grande);
                break;
        }
    }

}
