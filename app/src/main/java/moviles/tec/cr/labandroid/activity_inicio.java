package moviles.tec.cr.labandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.parse.Parse;

public class activity_inicio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Lab1", "Estoy en el onCreate()");
        setContentView(R.layout.activity_activity_inicio);
        //Inicializa el Parse
        Parse.initialize(this, "D0VpI5julPhBx23w2lGwdNu1liCebML65PnidGyp", "B1HC6iACNeUwbE5xNWxYBOFQIlNomBgJrjCXVcoH");
        //Crea las instancias de FoodAdapter
        FoodAdapter foodAdapter = new FoodAdapter(this);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(foodAdapter);
        foodAdapter.loadObjects();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        Log.d("Lab1","Estoy en el onCreateOptionsMenu()");
        getMenuInflater().inflate(R.menu.activity_inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Log.d("Lab1","Estoy en el onOptionsItemSelected()");
        int id = item.getItemId();
        //Se aconseja realizar en vez de un if
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }
}
