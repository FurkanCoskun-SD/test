package com.example.toastlibrary;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PostActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_post);
    }

    public static void s(Context c, String message){
        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();
    }
}
