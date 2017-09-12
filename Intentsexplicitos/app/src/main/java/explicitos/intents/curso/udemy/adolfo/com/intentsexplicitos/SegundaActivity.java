package explicitos.intents.curso.udemy.adolfo.com.intentsexplicitos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tvData = (TextView) findViewById(R.id.tvData);
        //mandamos a llamar al metodo que se encargara de recibir los datos del intent
        getDataFromIntent();
    }

    private void getDataFromIntent(){
        //los extra que mandamos desde el intent, se reciben de distintas formas
        //getIntent().getExtras() o declarar un Bundle como se hace abajo
        Bundle extras = getIntent().getExtras();
        //para recibir los datos de una manera segura, se hace una verificacion
        //para ver si los extras no son nulos
        if (extras!=null){
            //en caso de tener datos en el extra, se obtendran y guardaran en variables para su uso deseado
            String data = extras.getString("data");
            boolean isTrue = extras.getBoolean("boolean");
            if (isTrue){
                tvData.setText(data);
                Toast.makeText(this, "Se recibio un booleano desde MainActivity", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "No se recibio nada :c", Toast.LENGTH_LONG).show();
            }
            //en caso de no tener daos dentro dle extra, entrara a esta parte de la condicion
        }else{
            Toast.makeText(this, "No hay datos extras", Toast.LENGTH_SHORT).show();
        }

    }

}
