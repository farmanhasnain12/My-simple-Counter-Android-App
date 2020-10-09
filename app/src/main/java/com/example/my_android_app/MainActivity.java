package com.example.my_android_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView temp;
    TextView temp1;
    Button counter;
    Button reset;
    Button status;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp= (TextView)findViewById(R.id.message);
        counter=(Button)findViewById(R.id.counter);
        reset=(Button)findViewById(R.id.reset);
        status=(Button)findViewById(R.id.checkstauts);
        temp1=(TextView)findViewById(R.id.message1);



        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                count++;
                temp.setText("Your Count is : "+count);
                temp1.setText(" ");


            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                temp.setText("Your Count is : "+count);
                temp1.setText(" ");

            }
        });
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(count>=10)
                {
                    count=0;
                    temp1.setText("You won the game ! ");
                    temp.setText("Your Count is : "+count);



                }
                else
                {
                    temp1.setText("Come on guys , you can do it!");
                }

            }
        });


    }
}