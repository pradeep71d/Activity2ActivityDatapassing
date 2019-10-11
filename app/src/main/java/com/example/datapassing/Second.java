package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        String s3 = bundle.getString("Key1");// here we enter keys of 1st activity(same keys)
        String s4 = bundle.getString("key2");// getting data in two string.
        TextView textView1 = new TextView(this);//these both textviews are dynamically generated
        TextView textView2=new TextView(this);
        textView1.setText(s3);
        textView2.setText(s4);
        linearLayout = findViewById(R.id.l1);
        linearLayout.addView(textView1);
        linearLayout.addView(textView2);
    }
}
