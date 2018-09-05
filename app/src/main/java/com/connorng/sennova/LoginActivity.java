package com.connorng.sennova;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.connorng.sennova.bd.BaseDatosHelper;

public class LoginActivity extends Activity {

    Button btnIngresarLogin;
    EditText etCorreoUser, etPassUser;
    TextView tvRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etCorreoUser = (EditText)findViewById(R.id.etCorreoLogin);
        etPassUser = (EditText)findViewById(R.id.etPasswordLogin);
        tvRegistrar = (TextView)findViewById(R.id.tvRegistrar);

        BaseDatosHelper db = new BaseDatosHelper(getApplicationContext());
        SQLiteDatabase consulta = db.getWritableDatabase();
        ContentValues values = new ContentValues();

        btnIngresarLogin = (Button)findViewById(R.id.btnIngresarLogin);

        tvRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registro = new Intent(getApplicationContext(),RegistroActivity.class);
                startActivity(registro);

            }
        });

        btnIngresarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMain = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentMain);
            }
        });
    }
}
