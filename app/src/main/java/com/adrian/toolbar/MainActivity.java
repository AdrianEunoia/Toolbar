package com.adrian.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    SearchView idBarraBusqueda;
    Toolbar idToolbar;
    FrameLayout idEstiloFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        personalizarToolbar();
        acciones();
        getSupportActionBar().setTitle("Titulo toolbar");
    }

    private void acciones() {
        idBarraBusqueda.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                System.out.println(newText);
                return true;
            }
        });
    }

    private void instancias() {
        idBarraBusqueda = findViewById(R.id.idBarraBusqueda);
        idToolbar = findViewById(R.id.idToolbar);
        // Para que identifica la toolbar como la barra de soporte
        setSupportActionBar(idToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(getApplicationContext());
        menuInflater.inflate(R.menu.menu_superior,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.idMenuUno:
                Toast.makeText(this, "Pulsado 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idMenuDos:
                Toast.makeText(this, "Pulsado 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idMenuTres:
                Toast.makeText(this, "Pulsado 3", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    private void personalizarToolbar() {

    }
}
