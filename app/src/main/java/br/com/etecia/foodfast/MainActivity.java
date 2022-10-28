package br.com.etecia.foodfast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // inserindo menu inflate
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mFav:
                Toast.makeText(getApplicationContext(),
                        "Clique em Favoritos!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSearch:
                Toast.makeText(getApplicationContext(),
                        "Clique em Buscar!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHistory:
                Toast.makeText(getApplicationContext(),
                        "Clique em histórico!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mInfo:
                Toast.makeText(getApplicationContext(),
                        "Clique em Info!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mShare:
                Toast.makeText(getApplicationContext(),
                        "Clique em Share!",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}