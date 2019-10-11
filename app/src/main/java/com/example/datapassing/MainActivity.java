package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        String s1="Data passing between activities";
        String s2="Sharing of data between the activities";
        Intent intent=new Intent(MainActivity.this,Second.class);
        intent.putExtra("Key1",s1);//putting data in both strings
        intent.putExtra("key2",s2);
        startActivity(intent);
    }
});

}}