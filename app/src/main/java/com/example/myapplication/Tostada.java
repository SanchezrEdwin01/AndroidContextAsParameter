package com.example.myapplication;

import android.content.Context;
import android.widget.Toast;

public class Tostada {
    public static void TostadaMaker(Context context) {
        Toast.makeText(context, "Estoy corriendo un toast en una Java class", Toast.LENGTH_SHORT).show();
    }
}
