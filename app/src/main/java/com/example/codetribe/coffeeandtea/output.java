package com.example.codetribe.coffeeandtea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class output extends AppCompatActivity {

    ListView lvmain;
    ArrayList<String> dataFromMainActivity= new ArrayList<>();
    ArrayList<String>  remaindata = new ArrayList<>();
    ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        lvmain=(ListView)findViewById(R.id.lvmain);

        Intent intent= getIntent();

        dataFromMainActivity= intent.getStringArrayListExtra(MainActivity.DATA);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,dataFromMainActivity);

        lvmain.setAdapter(adapter);



        lvmain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                dataFromMainActivity.remove(position);
                remaindata=dataFromMainActivity;
                adapter=new ArrayAdapter<String>(output.this,android.R.layout.simple_dropdown_item_1line,remaindata);

                lvmain.setAdapter(adapter);

            }
        });

    }
}
