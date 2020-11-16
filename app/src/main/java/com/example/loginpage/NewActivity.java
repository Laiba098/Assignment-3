package com.example.loginpage;
import android.view.View;



import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;


public class NewActivity extends AppCompatActivity {
Button b2;
EditText ed3;

    public boolean flag=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        b2=findViewById(R.id.id5);
        ed3=findViewById(R.id.id4);
        Bundle bn=getIntent().getExtras();
        String em=bn.getString("email");
        String pass=bn.getString("password");
        String[] email = getResources().getStringArray(R.array.email);
        String[] password= getResources().getStringArray(R.array.password);
        for(int i=0;i<email.length;i++)
        {
            if(em.equals(email[i]))
            {
                if(pass.equals(password[i])) {
                    flag = true;
                }
            }
        }
        if(flag==true)
        {

            ed3.setText("Signed In Successfully");
            ed3.setVisibility(View.VISIBLE);
            Intent intent = new Intent(NewActivity.this, NewActivity2.class);
            startActivity(intent);


        }
        else {
            ed3.setText("Invalid E-Mail or Password");
            ed3.setVisibility(View.VISIBLE);
        }
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}