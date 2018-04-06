package mx.unam.fi.unica.clonspotify;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnIniFacebook;
    Button btnIniSesion;
    ImageView imgvCon1;
    AnimationDrawable conciertoAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgvCon1 = (ImageView)findViewById(R.id.imgvCon1);
        imgvCon1.setBackgroundResource(R.drawable.animation);
        conciertoAnimation = (AnimationDrawable)imgvCon1.getBackground();


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

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        conciertoAnimation.start();
    }
}
