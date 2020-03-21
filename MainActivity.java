package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int duration;
    private double Count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inc(View view) {
        Count=Count+1000;
        TextView text=(TextView)findViewById(R.id.tv1);
        TextView te=(TextView)findViewById(R.id.tv2);
        text.setText("₹ "+Count);
        if(Count>9000)
        {
            text.setTextColor(Color.BLACK);
        }
        if(Count>19000)
        {
            text.setTextColor(Color.YELLOW);
        }
        if(Count>50000)
        {
            text.setTextColor(Color.GRAY);
        }
        if(Count>50000)
        {
            te.setText("Yeah...!Bro you are getting richer");
        }

    }

    public void toast(View view) {
        String msg="its raining money";
        Toast toast=Toast.makeText(this,msg,duration);
        toast.show();
    }
}
