package com.example.study_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listMenu);

        ListView listView = (ListView) findViewById(R.id.listview1);
        listView.setAdapter(adapter);

    }

    static final String[] listMenu = {"list4", "list5", "list6"};


}