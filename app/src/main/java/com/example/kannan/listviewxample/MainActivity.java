package com.example.kannan.listviewxample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;

    String[] cities = {"Chennai","Tirchy","Madurai"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_item1);

        adapter = new ArrayAdapter<String>(this,R.layout.list_view_custom,R.id.text_list,cities);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Toast.makeText(getBaseContext(),adapterView.getItemAtPosition(i)+" is Selected", Toast.LENGTH_SHORT).show();
                view.setSelected(true);
            }
        });
    }
}
