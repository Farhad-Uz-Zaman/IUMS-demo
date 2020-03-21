package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView username;
    TextView userid;
    String name ;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        username=(TextView)findViewById(R.id.username);
        userid=(TextView)findViewById(R.id.userid);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
             name = bundle.getString("name");
             userID = bundle.getString("id");
            username.setText(name);
            userid.setText(userID);
        }


    }

    public void Back(View v){
        String name=username.getText().toString();
        String id=userid.getText().toString();
      Intent backIntent=new Intent(ThirdActivity.this,HomeActivity.class);
       backIntent.putExtra("name",name);
       backIntent.putExtra("id",id);
      startActivity(backIntent);


    }

}
