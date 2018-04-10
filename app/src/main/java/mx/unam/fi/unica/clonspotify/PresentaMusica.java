package mx.unam.fi.unica.clonspotify;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class PresentaMusica extends AppCompatActivity {

    String [] Canciones;
    ListView lstMusica;
    TextView txtvUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presenta_musica);

        Canciones = getResources().getStringArray(R.array.array_canciones);
        lstMusica = (ListView)findViewById(R.id.lstvMusica);
        txtvUsuario =(TextView)findViewById(R.id.txtvUsuario);

        Bundle  parametros = getIntent().getExtras();

        txtvUsuario.setText(parametros.getString("Usuario"));

        ArrayAdapter<String> AdapterCancion = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Canciones);
        lstMusica.setAdapter(AdapterCancion);


        lstMusica.setOnItemClickListener(ItemListener());


    }

    protected AdapterView.OnItemClickListener ItemListener(){
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),Canciones[i],Toast.LENGTH_SHORT).show();
            }
        };
    }

}
