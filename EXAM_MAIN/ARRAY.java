package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] names= new String[] {"Settings","Recents","Phone","Options","Manager"};
        list=(ListView) findViewById(R.id.list);
        ArrayAdapter <String> aa=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,names);
        list.setAdapter(aa);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value=names[i];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_LONG).show();;



            }
        });

    }
}