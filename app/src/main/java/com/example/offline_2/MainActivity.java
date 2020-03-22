package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  {

    private Button loginButton;
    private EditText userIDText ;
    private EditText editText;
    private ImageView aust1;
    private ImageView aust2;
    private ImageView aust3;
    private ImageView aust4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aust1 =(ImageView)findViewById(R.id.aust1);
        aust2 =(ImageView)findViewById(R.id.aust2);
        aust3 =(ImageView)findViewById(R.id.aust3);
        aust4 =(ImageView)findViewById(R.id.aust4);

        loginButton=(Button)findViewById(R.id.loginButton);
        userIDText = (EditText) findViewById(R.id.userIdText);
        editText=(EditText)findViewById(R.id.editText);


    }

    public void login(View v){
        String username=userIDText.getText().toString();
        String userid=editText.getText().toString();

        Intent loginIntent=new Intent(MainActivity.this,HomeActivity.class) ;
        loginIntent.putExtra("name",username);
        loginIntent.putExtra("id",userid);

        startActivity(loginIntent);


    }



    public void signup(View v){
        String username=userIDText.getText().toString();
        String userid=editText.getText().toString();

        Intent signupIntent=new Intent(MainActivity.this,SecondActivity.class) ;
        signupIntent.putExtra("name",username);
        signupIntent.putExtra("id",userid);

        startActivity(signupIntent);


    }



    public void aust3id(View v){

      aust4.setVisibility(View.GONE);
      aust3.setVisibility(View.VISIBLE);

    }

    public void aust2id(View v){

        aust3.setVisibility(View.GONE);
        aust2.setVisibility(View.VISIBLE);

    }

    public void aust1id(View v){

        aust2.setVisibility(View.GONE);
        aust1.setVisibility(View.VISIBLE);

    }
    public void aust4id(View v){

        aust1.setVisibility(View.GONE);
        aust4.setVisibility(View.VISIBLE);

    }

}
