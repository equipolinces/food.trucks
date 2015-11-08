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

import com.parse.Parse;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class Registro extends Activity {

    private EditText etNombre;
    private EditText etEmail;
    private EditText etUsuario;
    private EditText etPassword;
    private Button b1;
    private TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        b1 = (Button)findViewById(R.id.buttonCrear);
        etNombre = (EditText)findViewById(R.id.textNombre);
        etEmail = (EditText)findViewById(R.id.textEmail);
        etUsuario = (EditText)findViewById(R.id.textUsuario);
        etPassword = (EditText)findViewById(R.id.textPassword);


            b1.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {

                    String nombre = etNombre.getText().toString();
                    String email = etEmail.getText().toString();
                    String usuario = etUsuario.getText().toString();
                    String password = etPassword.getText().toString();

                    if(usuario.equals("") && password.equals("")&& nombre.equals("") && email.equals("")){
                        Toast.makeText(getApplicationContext(),
                                "El formulario está incompleto", Toast.LENGTH_SHORT).show();
                    }else{
                        ParseUser user = new ParseUser();
                        user.setUsername(usuario);
                        user.setPassword(password);
                        user.setEmail(email);
                                    user.signUpInBackground(new SignUpCallback() {
                                        @Override
                                        public void done(ParseException e) {
                                            if(e == null){
                                                Toast.makeText(getApplicationContext(),
                                                        "Registro exitoso", Toast.LENGTH_SHORT).show();
                                            }else{
                                    Toast.makeText(getApplicationContext(),
                                            "Error en el registro", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

                    }


                }

            });


    }
}
