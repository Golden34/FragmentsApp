package edu.val.fragmentsapp.viewpager;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import edu.val.fragmentsapp.fragment.ScreenFragment1;
import edu.val.fragmentsapp.fragment.ScreenFragment2;
import edu.val.fragmentsapp.fragment.ScreenFragment3;

public class PagerAdapterVP extends FragmentStatePagerAdapter {

    //En el construcutor, recojo el FragmentManager, que intermanete,
    //se encargará de suministrar los fragmentos o trozos pantallas
    public PagerAdapterVP(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    //Este método es análogo a nuestro getView del Adapter que usábamos con ListView
    //Con la salvedad de que aquí, en vez de vistas, devolveremos fragments
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position)
        {
            case 0: fragment = new ScreenFragment1(); break;
            case 1: fragment = new ScreenFragment2(); break;
            default: fragment = new ScreenFragment3();
        }

        return  fragment;
    }

    //Este método se usa sólo para saber cuántas pantallas tengo y si el adpter ha llegado al final
    @Override
    public int getCount() {
        return 3;
    }

}