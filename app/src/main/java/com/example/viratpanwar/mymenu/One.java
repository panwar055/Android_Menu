package com.example.viratpanwar.mymenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class One extends AppCompatActivity {
ListView lv;
    ArrayList<String> al;

    ArrayAdapter<String>ad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        lv=(ListView)findViewById(R.id.lv);

        al = new ArrayList<String>();

        al.add("Dharma");

        ad = new ArrayAdapter<String>(One.this,android.R.layout.simple_list_item_1,al);

        lv.setAdapter(ad);

        registerForContextMenu(lv);




    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("selectOption");
        menu.add(0, v.getId(), 0, "close");
        menu.add(0, v.getId(), 1, "print");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "close") {
            finish();
        } else if (item.getTitle() == "print") {

            Toast.makeText(One.this,"this is too much",Toast.LENGTH_LONG).show();
        }


        return true;

    }
}
