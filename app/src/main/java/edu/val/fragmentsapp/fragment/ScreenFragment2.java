package edu.val.fragmentsapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import edu.val.fragmentsapp.R;

public class ScreenFragment2 extends Fragment {



    public ScreenFragment2() {
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_deslizante2, container, false);

        return rootView;
    }
}