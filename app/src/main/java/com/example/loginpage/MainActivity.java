package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.id1);
        ed2=findViewById(R.id.id2);
        b1=findViewById(R.id.id3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=ed1.getText().toString();
                String p=ed2.getText().toString();

                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                intent.putExtra("email",e);
                intent.putExtra("password",p);
                startActivity(intent);
            }
        });
    }
}