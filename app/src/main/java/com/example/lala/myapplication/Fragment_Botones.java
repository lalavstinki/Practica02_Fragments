package com.example.lala.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Botones extends Fragment implements View.OnClickListener{

    View parentView;
    imagen MiCallBack;

    public Fragment_Botones() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        parentView = inflater.inflate(R.layout.fragment_fragment__botones, container, false);
        parentView.findViewById(R.id.SQUIRTLE_GRANDE).setOnClickListener(this);
        parentView.findViewById(R.id.BULBASAUR_GRANDE).setOnClickListener(this);
        parentView.findViewById(R.id.CHARMANDER_GRANDE).setOnClickListener(this);
        return parentView;
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        MiCallBack = (imagen) activity;
    }

    @Override
    public void onClick(View v){
        int id = v.getId();
        switch (id){
            case R.id.SQUIRTLE_GRANDE:
                MiCallBack.clicar_boton("1");
                break;
            case R.id.BULBASAUR_GRANDE:
                MiCallBack.clicar_boton("2");
                break;
            case R.id.CHARMANDER_GRANDE:
                MiCallBack.clicar_boton("3");
                break;
        }
    }
}
