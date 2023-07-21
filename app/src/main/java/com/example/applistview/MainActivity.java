package com.example.applistview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String namaNegara[] = {"Amerika Serikat", "Argentina", "Australia", "Brazil", "China", "India", "Indonesia", "Jepang", "Jerman",
    "Kanada", "Korea Selatan", "Malaysia", "Meksiko", "Perancis", "Rusia", "Saudi Arabia", "Selandia Baru", "Singapura", "Spanyol",
    "Swedia", "Thailand", "Turki", "Uni Emirat Arab", "Vietnam", "Zimbabwe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Aplikasi List View");
        }

        listView = findViewById(R.id.listv);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<>(
                this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, namaNegara
        );
        listView.setAdapter(arr);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, arr.getItem(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}