package mx.unam.fi.unica.clonspotify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Bienvenida extends AppCompatActivity {

    String [] arraycanciones;
    ListView LstvCanciones;
    TextView txtusuario;
    Toolbar mitoolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        mitoolbar = (Toolbar) findViewById(R.id.toolbarBienvenida);
        txtusuario = (TextView)findViewById(R.id.txtvBienvenida);
        LstvCanciones = (ListView)findViewById(R.id.lstCanciones);
        arraycanciones = getResources().getStringArray(R.array.canciones);

        setSupportActionBar(mitoolbar);

        Bundle parametros = this.getIntent().getExtras();//getResources Extraer la cadena del nombre de la variable
        String usuario = parametros.getString(getResources().getString(R.string.var_usuario_extra));
        txtusuario.setText(txtusuario.getText().toString() + " " + usuario);


        ArrayAdapter<String> AdapterCanciones = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,arraycanciones);
        LstvCanciones.setAdapter(AdapterCanciones);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mimenu_bienvenida,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.mAcercaDe:
                Intent intentacercadatos = new Intent(getApplicationContext(),AcercaDeDialogo.class);
                startActivity(intentacercadatos);

                //Toast.makeText(getApplicationContext(),"Acerca de",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mAlbum:
                Toast.makeText(getApplicationContext(),"Album",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(),"Buscar",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
