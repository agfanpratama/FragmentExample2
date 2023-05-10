package com.example.fragmentexample2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fragmentexample2.FirstFragment;

public  class  MainActivity  extends AppCompatActivity {
    Button firstFragment , secondFragment, thirdFragment, fourthFragment ;
    @Override
    protected  void onCreate ( Bundle savedInstanceState )  {
        super . onCreate ( savedInstanceState );
        setContentView ( R . layout . activity_main );
// get the reference of Button's
        firstFragment  =  ( Button ) findViewById ( R . id . firstFragment );
        secondFragment  =  ( Button ) findViewById ( R . id . secondFragment );
        thirdFragment = ( Button ) findViewById ( R . id . thirdFragment );
        fourthFragment = ( Button ) findViewById ( R . id . fourthFragment );
// perform setOnClickListener event on First Button
        firstFragment . setOnClickListener ( new  View . OnClickListener ()  {
            @Override
            public  void onClick ( View v )  {
// load First Fragment
                loadFragment ( new FirstFragment());
            }
        });
// perform setOnClickListener event on Second Button
        secondFragment . setOnClickListener ( new  View . OnClickListener ()  {
            @Override
            public  void onClick ( View v )  {
// load Second Fragment
                loadFragment ( new  SecondFragment ());
            }
        });
// perform setOnClickListener event on Third Button
        thirdFragment . setOnClickListener ( new  View . OnClickListener ()  {
            @Override
            public  void onClick ( View v )  {
// load Second Fragment
                loadFragment ( new ThirdFragment ());
            }
        });
// perform setOnClickListener event on Fourth Button
        fourthFragment . setOnClickListener ( new  View . OnClickListener ()  {
            @Override
            public  void onClick ( View v )  {
// load Second Fragment
                loadFragment ( new FourthFragment ());
            }
        });
    }
    private  void loadFragment ( Fragment fragment )  {
// create a FragmentManager
        FragmentManager fm  = getFragmentManager ();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction  = fm . beginTransaction ();
// replace the FrameLayout with new Fragment
        fragmentTransaction . replace ( R . id . frameLayout , fragment );
        fragmentTransaction . commit ();  // save the changes
    }
}