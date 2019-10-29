package edu.val.fragmentsapp.viewpager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import edu.val.fragmentsapp.R;


public class ViewPagerActivity extends AppCompatActivity {

    /**
     * El VIEWPAGER permite transitar entre las pantallas. Se encarga de la animación y atiende al desplazmiento (swipe)
     * Es el elemento contenedor
     */
    private ViewPager viewPager;

    /**
     * El PAGER ADAPTER es el "adapter" del VIEWPAGER. Es el proveedor de "patanllas". CUando el viewpager necesite transitar
     * será el pageradapter el que le de las vistas (fragments en este caso)
     */
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtengo la referencia al ViewPager
        viewPager = (ViewPager) findViewById(R.id.pager);
        //Y le asigno su adpter
        pagerAdapter = new PagerAdapterVP(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }


    //Sobreescribiendo este método, consigo personalizar el comportamiento del botón "hacia atrás"
    //en esta actividad.
    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            // Si estoy en la pantalla inicial, hago que se cierre la app (comportamiento por defecto logrado invocando al padre)
            super.onBackPressed();
        } else {
            // Si no, paso a una pantalla anterior
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }
}
