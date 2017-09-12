package explicitos.intents.curso.udemy.adolfo.com.intentsexplicitos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Android Intent explicitos
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void intentExplicito(View view) {
        //creas un intent, dandole como parametros (contexto, activity a la que nos dirigimos)
        Intent intent = new Intent(this,SegundaActivity.class);
        //se agregar extras al intent, como parametros (key,value)
        intent.putExtra("data","Esto es un intent explicito!!");
        intent.putExtra("boolean",true);
        //se empieza el intent
        startActivity(intent);
    }
}
