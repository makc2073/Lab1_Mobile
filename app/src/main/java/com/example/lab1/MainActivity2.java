package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Bundle arguments = getIntent().getExtras();
        //String FIO = arguments.getString("FIO");
        // MainActivity.user
        String fio = MainActivity.user.FIO;
        TextView textView = findViewById(R.id.textView);
        textView.setText(fio);
        int age = MainActivity.user.age;
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(Integer.toString (age));
        String height = MainActivity.user.Height;
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(height);
        String weigth = MainActivity.user.Weight;
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setText(weigth);
        String color = MainActivity.user.ColorHair;
        TextView textView5 = findViewById(R.id.textView5);
        textView5.setText(color);
        String gen = MainActivity.user.Gender;
        TextView textView6 = findViewById(R.id.textView6);
        textView6.setText(gen);

        Button prevBtn = findViewById(R.id.prevBtn2);
        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }


        });

    }
}