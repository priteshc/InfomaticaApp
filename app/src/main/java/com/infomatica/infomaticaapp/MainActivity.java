package com.infomatica.infomaticaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.jorgecastillo.FillableLoader;
import com.github.jorgecastillo.State;
import com.github.jorgecastillo.listener.OnStateChangeListener;
import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;
import com.infomatica.infomaticaapp.constant.Constants;

public class MainActivity extends AppCompatActivity {


    FillableLoader fillableLoader;
    HTextView hTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        fillableLoader = (FillableLoader) findViewById(R.id.fillableLoader);

        fillableLoader.setSvgPath(Constants.DROID_LOGO);
        fillableLoader.start();



        fillableLoader.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(int state) {

                switch (state){

                    case State.FINISHED:

                        hTextView = (HTextView) findViewById(R.id.text);

                        hTextView.animateText("INFOMATICA");


                        Toast.makeText(MainActivity.this,"finish",Toast.LENGTH_SHORT).show();


                        break;



                }

            }
        });


    }
}
