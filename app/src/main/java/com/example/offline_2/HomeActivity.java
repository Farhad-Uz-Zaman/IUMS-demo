package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button profile;
    Button result;
    Button logout;
    String name;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profile=(Button)findViewById(R.id.profile);
        result=(Button)findViewById(R.id.result);
        logout=(Button)findViewById(R.id.logout);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            name = bundle.getString("name");
            userID = bundle.getString("id");

        }


    }


    public void Result(View v){


        Intent tableIntent=new Intent(HomeActivity.this,ThirdActivity.class);
        tableIntent.putExtra("name",name);
        tableIntent.putExtra("id",userID);
        startActivity(tableIntent);


    }
    public void Profile(View v){


        Intent profileIntent=new Intent(HomeActivity.this,ProfileActivity.class);
        profileIntent.putExtra("name",name);
        profileIntent.putExtra("id",userID);
        startActivity(profileIntent);


    }

    public void Logout(View v){

        Intent logoutIntent=new Intent(HomeActivity.this,MainActivity.class);
        startActivity(logoutIntent);
    }


    public void Payments(View v){


        Intent paymentIntent=new Intent(HomeActivity.this,PaymentsActivity.class);
        paymentIntent.putExtra("name",name);
        paymentIntent.putExtra("id",userID);
        startActivity(paymentIntent);

    }

    public void SemFee(View v){


        Intent semIntent=new Intent(HomeActivity.this,SemActivity.class);
        semIntent.putExtra("name",name);
        semIntent.putExtra("id",userID);
        startActivity(semIntent);

    }

}
