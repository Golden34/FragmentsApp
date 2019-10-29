package edu.val.fragmentsapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import edu.val.fragmentsapp.R;


public class ScreenFragment1 extends Fragment {



    //Llamo al constructor del padre. Necesario para iniciar el fragment
    public ScreenFragment1() {
        super();
    }

    //Sobreescribo este método para devolver la vista raíz del fragment
    //inflando para ello el layout que representa la vista de dicho fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_deslizante1, container, false);

        return rootView;
    }


}
