package com.sgs.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sgs.messagedisplay.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToasterMessage.s(this,"Hi, Hello , How Are You....");
    }
}
