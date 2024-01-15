package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.example.myapplication.Tostada;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = this;
        
        Tostada.TostadaMaker(context);
        
        //Toast.makeText(this, "Hola Marce esto es un toast", Toast.LENGTH_LONG).show();
    }

}