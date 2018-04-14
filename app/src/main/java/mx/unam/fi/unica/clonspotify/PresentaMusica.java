package mx.unam.fi.unica.clonspotify;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class PresentaMusica extends AppCompatActivity {

    String [] Canciones;
    ListView lstMusica;
    TextView txtvUsuario;
    MediaPlayer mp;
    Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presenta_musica);

        btnStop = (Button)findViewById(R.id.btnStop);
        Canciones = getResources().getStringArray(R.array.array_canciones);
        lstMusica = (ListView)findViewById(R.id.lstvMusica);
        txtvUsuario =(TextView)findViewById(R.id.txtvUsuario);

        Bundle  parametros = getIntent().getExtras();

        txtvUsuario.setText(parametros.getString("Usuario"));

        ArrayAdapter<String> AdapterCancion = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Canciones);
        lstMusica.setAdapter(AdapterCancion);


        lstMusica.setOnItemClickListener(ItemListener());
        btnStop.setOnClickListener(OnClickStop);


    }

    protected View.OnClickListener OnClickStop= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mp.stop();


        }
    };

    protected AdapterView.OnItemClickListener ItemListener(){
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                String [] Uri= Canciones[i].toString().split("/");

                mp=new MediaPlayer();
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try {
                 mp.setDataSource(Canciones[i].toString());
                 mp.prepare();
                }
                 catch (IOException e) {
                    e.printStackTrace();
                }
                mp.start();
                Toast.makeText(getApplicationContext(),"Escuchando " + Uri[4],Toast.LENGTH_SHORT).show();
            }
        };
    }

}
