package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SemActivity extends AppCompatActivity {

    String name;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            name = bundle.getString("name");
            userID = bundle.getString("id");

        }
    }

    public void Back(View v){

        Intent backIntent=new Intent(SemActivity.this,HomeActivity.class);
        backIntent.putExtra("name",name);
        backIntent.putExtra("id",userID);
        startActivity(backIntent);


    }


}
