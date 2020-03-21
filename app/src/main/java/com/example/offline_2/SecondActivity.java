package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String name;
    String userID;
    TextView username;
    TextView userid;
    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        username = (TextView) findViewById(R.id.username);
        userid=(TextView) findViewById(R.id.userid);
        proceed=(Button) findViewById(R.id.proceed);
        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
              name = bundle.getString("name");
              userID = bundle.getString("id");
            username.setText(name);
            userid.setText(userID);
        }


    }

    public void Proceed(View v){



        Intent homeIntent=new Intent(SecondActivity.this,HomeActivity.class);
        homeIntent.putExtra("name",name);
        homeIntent.putExtra("id",userID);
        startActivity(homeIntent);


    }

    public void Back(View v){

        Intent backIntent=new Intent(SecondActivity.this,MainActivity.class);
        startActivity(backIntent);
    }



}
