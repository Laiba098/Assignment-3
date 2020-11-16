package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class character extends AppCompatActivity {
    String[] A = {"Afghanistan","Albania","Algeria","Andorra","Angola","Anguilla","Antigua &amp; Barbuda","Argentina","Armenia","Aruba","Australia","Austria","Azerbaijan"};
    String[] B={"Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bermuda","Bhutan","Bolivia","Bosnia &amp; Herzegovina","Botswana","Brazil","British Virgin Islands","Brunei","Bulgaria","Burkina Faso","Burundi"};
    String[] C={"Cambodia","Cameroon","Cape Verde","Cayman Islands","Chad","Chile","China","Colombia","Congo","Cook Islands","Costa Rica","Cote D Ivoire","Croatia","Cruise Ship","Cuba","Cyprus","Czech Republic"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        Bundle bn=getIntent().getExtras();
        String ch=bn.getString("character");
           switch (ch)
                {

                    case "A":
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, A);
                        ListView listview = (ListView) findViewById(R.id.listView1);
                        listview.setAdapter(adapter);
                        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
                        {
                            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                                Toast.makeText(getApplicationContext(), A[position], Toast.LENGTH_SHORT).show();
                            }
                        });
                        break;

                    case "B":
                        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, B);
                        ListView listview1 = (ListView) findViewById(R.id.listView1);
                        listview1.setAdapter(adapter1);
                        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener()
                        {
                            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                                Toast.makeText(getApplicationContext(), B[position], Toast.LENGTH_SHORT).show();
                            }
                        });

                        break;
                    case "C":
                        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, C);
                        ListView listview2 = (ListView) findViewById(R.id.listView1);
                        listview2.setAdapter(adapter2);
                        listview2.setOnItemClickListener(new AdapterView.OnItemClickListener()
                        {
                            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                                Toast.makeText(getApplicationContext(), C[position], Toast.LENGTH_SHORT).show();
                            }
                        });

                        break;
                        // And So On





                }
    }
}