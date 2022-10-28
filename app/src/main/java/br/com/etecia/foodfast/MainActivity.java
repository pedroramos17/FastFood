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
            case R.id.mHome:
                Toast.makeText(getApplicationContext(),
                        "Página inicial",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHear:
                Toast.makeText(getApplicationContext(),
                        "Escute tudo, mesmo!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHeal:
                Toast.makeText(getApplicationContext(),
                        "Te curando agora!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHelp:
                Toast.makeText(getApplicationContext(),
                        "Abrindo Ajuda!",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}