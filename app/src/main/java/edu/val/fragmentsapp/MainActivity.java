package edu.val.fragmentsapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import edu.val.fragmentsapp.tablayout.TabLayoutActivity;
import edu.val.fragmentsapp.viewpager.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ppal);

        startActivity(new Intent(this, TabLayoutActivity.class));
        //startActivity(new Intent(this, ViewPagerActivity.class));
    }
}
