package edu.val.fragmentsapp.tablayout;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import edu.val.fragmentsapp.fragment.ScreenFragment1;
import edu.val.fragmentsapp.fragment.ScreenFragment2;
import edu.val.fragmentsapp.fragment.ScreenFragment3;


public class PagerAdapterTL extends FragmentStatePagerAdapter {

    //Simplemente llamo al contrstructor del padre
    public PagerAdapterTL(FragmentManager fm) {
        super(fm);
    }

    //De forma similar al GETVIEW, este adpater también devuelve una vista
    //pero en este caso, es un Fragment! (y se llama getItem)
    @Override
    public Fragment getItem(int posicion) {

        Fragment fragment = null;

        switch (posicion)
        {
            case 0: fragment = new ScreenFragment1(); break;
            case 1: fragment = new ScreenFragment2(); break;
            default: fragment = new ScreenFragment3();
        }

        return  fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    //sobrrescribo este método para que se pinte el tab como parte
    //del fragtment
    @Override
    public CharSequence getPageTitle(int position) {
        return TabLayoutActivity.getTitulo(position);
    }
}