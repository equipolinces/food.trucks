package com.soft.app.foodtruck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.facebook.FacebookSdk;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;


public class Main extends Activity {

    private Button b1;
    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        /*Parse.enableLocalDatastore(this);
        Parse.initialize(this, "oRyFQc61kzm71qTQMXt0u87x6SfFsT2D6sCcIulc", "CK7THueGHaz7p1IzjuBhkUAGJYkiuP0Q2RrFSm59");
        ParseUser.enableAutomaticUser();
        ParseACL defauAcl = new ParseACL();

        defauAcl.setPublicReadAccess(true);
        ParseACL.setDefaultACL(defauAcl, true);
*/



        b1 = (Button) findViewById(R.id.ButtonLog);
        b2 = (Button) findViewById(R.id.ButtonRegistar);




        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main.this, Logeo.class);
                startActivity(intent);
            }

        });


        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main.this, Registro.class);
                startActivity(intent);

            }

        });


    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

}
