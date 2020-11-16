package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class NewActivity2 extends AppCompatActivity {
    String alpha[];
    String[] months = {"January", "February", "March", "April", "May", "June", "July",  "August", "September", "October", "November", "December"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);
        alpha=getResources().getStringArray(R.array.alphabets);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alpha);
        GridView gridview = (GridView) findViewById(R.id.gridView1);
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {

                //Toast.makeText(getApplicationContext(), "You Clicked: "  + alpha[position], Toast.LENGTH_LONG).show();
                String chr;
                chr=alpha[position];
                Intent intent = new Intent(NewActivity2.this, character.class);
                intent.putExtra("character",chr);
                startActivity(intent);






            }
        });

    }
}