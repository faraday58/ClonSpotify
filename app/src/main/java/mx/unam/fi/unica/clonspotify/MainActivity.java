package mx.unam.fi.unica.clonspotify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIniFacebook;
    Button btnIniSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniFacebook = (Button)findViewById(R.id.btnIniFacebook);

        btnIniFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentIniFacebook = new Intent(getApplicationContext(),RegistroFacebook.class);
                startActivity(intentIniFacebook);
            }
        });

        btnIniSesion=(Button)findViewById(R.id.btnIniSesion);

        btnIniSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentIniSesion = new Intent(getApplicationContext(),IniciarSesion.class);
                startActivity(intentIniSesion);
            }
        });

    }
}
