package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity<Button> extends AppCompatActivity {

    Button back;
    String name;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        back=(Button)findViewById(R.id.back);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            name = bundle.getString("name");
            userID = bundle.getString("id");

        }

    }


    public void Back(View v){

        Intent backIntent=new Intent(ProfileActivity.this,HomeActivity.class);
        backIntent.putExtra("name",name);
        backIntent.putExtra("id",userID);
        startActivity(backIntent);


    }


}
