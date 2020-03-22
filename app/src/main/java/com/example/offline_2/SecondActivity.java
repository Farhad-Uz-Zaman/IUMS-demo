package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.widget.DatePicker;
import java.util.Calendar;

public class SecondActivity extends AppCompatActivity {

    String name1;
    String userID;
    TextView username;
    TextView userid;
    Button proceed;
    Button back;

    private static final String TAG = "MainActivity";

    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mDisplayDate = (TextView) findViewById(R.id.tvDate);






        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        SecondActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date = month + "/" + day + "/" + year;
                mDisplayDate.setText(date);
            }
        };

        proceed=(Button) findViewById(R.id.proceed);
        back=(Button)findViewById(R.id.back);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            name1 = bundle.getString("name");
            userID = bundle.getString("id");

        }



    }

    public void Proceed(View v){


        String name=name1;
        String id=userID;
        Intent homeIntent=new Intent(SecondActivity.this,HomeActivity.class);
        homeIntent.putExtra("name","Farhad Uz Zaman");
        homeIntent.putExtra("id","180104069");
        startActivity(homeIntent);


    }

    public void Back(View v){

        Intent backIntent=new Intent(SecondActivity.this,MainActivity.class);
        startActivity(backIntent);
    }



}
