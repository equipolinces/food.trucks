package com.google.maps.android.utils.demo;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Perfil extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

    public void sendAtrasPerfil(View view){
        Intent intent = new Intent(this, Logeo.class);
        startActivity(intent);
    }

    public void sendConfig(View view){
        Intent intent = new Intent(this, Config.class);
        startActivity(intent);
    }

    public void sendMapa(View view){
        Intent intent = new Intent(this, CustomMarkerClusteringDemoActivity.class);
        startActivity(intent);
    }

}
