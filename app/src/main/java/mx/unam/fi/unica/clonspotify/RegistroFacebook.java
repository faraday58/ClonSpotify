package mx.unam.fi.unica.clonspotify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroFacebook extends AppCompatActivity {

    Button btnAceptar;
    EditText edtUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_facebook);

        btnAceptar = (Button)findViewById(R.id.btnAceptar);
        edtUsuario = (EditText)findViewById(R.id.edtUsuario);

        btnAceptar.setOnClickListener(Click);

    }

    protected View.OnClickListener Click= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent IntentFace= new Intent(getApplicationContext(),PresentaMusica.class);
              IntentFace.putExtra("Usuario",edtUsuario.getText().toString());
              startActivity(IntentFace);
        }
    };


}
