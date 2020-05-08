package com.example.mybattery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private static ImageView imgView;
private static Button pls;
private static Button min;
private int clickCount = 1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView = findViewById(R.id.battery);
        pls= findViewById(R.id.plus);
        min = findViewById(R.id.minus);

        pls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickCount<=7){
                clickCount++;
                changeImg();
                }else{
                    clickCount = 7;
                    changeImg();
                }

            }
        });


        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickCount>0){
                clickCount--;
                changeImg();
                }else{
                    clickCount = 1;
                    changeImg();
                }

            }
        });
    }

    private void changeImg(){

        switch(clickCount){
            case 1:
                imgView.setImageResource(R.drawable.battery1);
                    break;
            case 2:
                imgView.setImageResource(R.drawable.battery2);
                break;
            case 3:
                imgView.setImageResource(R.drawable.battery3);
                break;
            case 4:
                imgView.setImageResource(R.drawable.battery4);
                break;
            case 5:
                imgView.setImageResource(R.drawable.battery5);
                break;
            case 6:
                imgView.setImageResource(R.drawable.battery6);
                break;
            case 7:
                imgView.setImageResource(R.drawable.battery7);
                break;
        }

    }
}
