package com.soft.app.foodtruck;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;

public class Perfil extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_perfil);



    }

    public void sendAtrasPerfil(View view){
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
    }

    public void sendConfig(View view){
        Intent intent = new Intent(this, Config.class);
        startActivity(intent);
    }

    public void sendMapaGoogle(View view){
        Intent intent = new Intent(this, CustomMarkerClusteringDemoActivity.class);
        startActivity(intent);
    }


}