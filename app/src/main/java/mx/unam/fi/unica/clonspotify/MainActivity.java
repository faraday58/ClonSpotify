package mx.unam.fi.unica.clonspotify;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnIniFacebook;
    Button btnIniSesion;
    ImageView imgvCon1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgvCon1 = (ImageView)findViewById(R.id.imgvCon1);


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
