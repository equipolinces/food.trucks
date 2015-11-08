package com.google.maps.android.utils.demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

public class Inicio extends Activity {


    private Button b1;
    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        b1 = (Button) findViewById(R.id.ButtonLog);
        b2 = (Button) findViewById(R.id.ButtonRegistar);


        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(Inicio.this, Logeo.class);
                startActivity(intent);
            }

        });


        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(Inicio.this, Registro.class);
                startActivity(intent);
            }

        });


    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }
}
