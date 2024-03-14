package com.example.dialog;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.tonew) {
            Toast.makeText(this, "File Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.toopn) {
            Toast.makeText(this, "Open Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.tosave) {
            Toast.makeText(this, "Save Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.tosaveas) {
            Toast.makeText(this, "Save As Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.todelete) {
            Toast.makeText(this, "Delete Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.toExit) {
            Toast.makeText(this, "Exit Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
    }

}
