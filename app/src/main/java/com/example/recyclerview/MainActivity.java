package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rcv = (RecyclerView) findViewById(R.id.rclview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        String arr []= {"C","C++",".net","Php","C","C++",".net","Php","C","C++",".net","Php","C","C++",".net","Php"};
        rcv.setAdapter(new myadapter(arr));

    }
}