package edu.val.fragmentsapp.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.val.fragmentsapp.R;

public class ScreenFragment3 extends Fragment {

    public ScreenFragment3() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deslizantet3, container, false);
    }

}
