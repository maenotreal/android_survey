package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //В awnsers меняешь id правильных ответов
    //в res/values/question.xml находятся строки вопросов и ответов, меняешь их только там
    //result.xml можешь подредачить сам, я уже спать хочу
    private int awnsers[] = {R.id.a2, R.id.a5, R.id.a7, R.id.a11, R.id.a15};
    public int uAwnsers[] = {0, 0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.chngBUT1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.q1);
            }
        });
    }
    public void Ques1(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView Question = (TextView) findViewById(R.id.q1);

        switch (view.getId()) {
            case R.id.a1:
                if(checked) {
                    uAwnsers[0] = R.id.a1;
                }
                break;
            case R.id.a2:
                if(checked) {
                    uAwnsers[0] = R.id.a2;
                }
                break;
            case R.id.a3:
                if(checked) {
                    uAwnsers[0] = R.id.a3;
                }
                break;
        }
        Button button = (Button)findViewById(R.id.chngBUT2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.q2);
            }
        });
    }
    public void Ques2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView Question = (TextView) findViewById(R.id.q1);

        switch (view.getId()) {
            case R.id.a4:
                if(checked)
                    uAwnsers[1] = R.id.a4;
                break;
            case R.id.a5:
                if(checked)
                    uAwnsers[1] = R.id.a5;
                break;
            case R.id.a6:
                if(checked)
                    uAwnsers[1] = R.id.a6;
                break;


        }
        Button button = (Button)findViewById(R.id.chngBUT3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.q3);
            }
        });
    }
    public void Ques3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView Question = (TextView) findViewById(R.id.q1);

        switch (view.getId()) {
            case R.id.a7:
                if(checked) {
                    uAwnsers[2] = R.id.a7;
                }
                break;
            case R.id.a8:
                if(checked) {
                    uAwnsers[2] = R.id.a8;
                }
                break;
            case R.id.a9:
                if(checked) {
                    uAwnsers[2] = R.id.a9;
                }
                break;
        }
        Button button = (Button)findViewById(R.id.chngBUT4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.q4);
            }
        });
    }
    public void Ques4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView Question = (TextView) findViewById(R.id.q1);

        switch (view.getId()) {
            case R.id.a10:
                if(checked) {
                    uAwnsers[3] = R.id.a10;
                }
                break;
            case R.id.a11:
                if(checked) {
                    uAwnsers[3] = R.id.a11;
                }
                break;
            case R.id.a12:
                if(checked) {
                    uAwnsers[3] = R.id.a12;
                }
                break;
        }
        Button button = (Button)findViewById(R.id.chngBUT5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.q5);
            }
        });
    }
    public void Ques5(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView Question = (TextView) findViewById(R.id.q1);

        switch (view.getId()) {
            case R.id.a13:
                if(checked) {
                    uAwnsers[4] = R.id.a13;
                }
                break;
            case R.id.a14:
                if(checked) {
                    uAwnsers[4] = R.id.a14;
                }
                break;
            case R.id.a15:
                if(checked) {
                    uAwnsers[4] = R.id.a15;
                }
                break;
        }
        Button button = (Button)findViewById(R.id.chngBUT6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.result);
            }
        });
    }
    public void Results(View view) {
        Button button = (Button)findViewById(R.id.resultBut);
        TextView result = (TextView)findViewById(R.id.res);

        int count = 0;
        for (int i =0; i<5; i++) {
            if (uAwnsers[i] == awnsers[i])
                count++;
        }
        button.setGravity(Gravity.CENTER | Gravity.BOTTOM);
        result.setText("Ваш результат: " + count+"/5");
        result.setGravity(Gravity.CENTER);
    }
}