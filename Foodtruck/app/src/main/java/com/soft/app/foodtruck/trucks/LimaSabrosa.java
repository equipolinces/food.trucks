package com.soft.app.foodtruck.trucks;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.soft.app.foodtruck.R;

public class LimaSabrosa extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_lima_sabrosa);
    }
    public void sendMenu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

}
