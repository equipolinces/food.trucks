package com.soft.app.foodtruck;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class Logeo extends Activity {

    private EditText et1;
    private EditText et2;
    private Button b1;
    private TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logeo);



        et1 = (EditText)findViewById(R.id.textUsuario);
        et2 = (EditText)findViewById(R.id.textPassword);

        b1 = (Button)findViewById(R.id.buttonIngresar);

        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                String usernametxt = et1.getText().toString();
                String passwordtxt = et2.getText().toString();
                ParseUser.logInInBackground(usernametxt, passwordtxt, new LogInCallback() {
                    @Override
                    public void done(ParseUser user, ParseException e) {
                        if (user != null) {
                            Intent intent = new Intent(Logeo.this, Perfil.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(getApplicationContext(), "El usuario o la contraseña no son correctas", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }

        });


    }
}
