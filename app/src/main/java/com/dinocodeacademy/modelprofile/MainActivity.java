package com.dinocodeacademy.modelprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

  // Here I made something new

    GridView imageDisplay;
    private String [] TEXT = {
     "User 1",
     "User 2",
     "User 3",
     "User 4",
     "User 5",
     "User 6"
   };


   private int [] IMAGE = {
           R.drawable.a,
           R.drawable.b,
           R.drawable.c,
           R.drawable.d,
           R.drawable.e,
           R.drawable.f
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
