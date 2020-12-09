package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import static androidx.recyclerview.widget.LinearLayoutManager.*;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    RecyclerView recyclerView;
    MyAdapter myAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 =findViewById(R.id.button2);



        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, VERTICAL, false);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                setContentView(R.layout.activity_second);
                recyclerView = findViewById(R.id.recyclerView);
                recyclerView.setLayoutManager(linearLayoutManager);
                myAdapter = new MyAdapter();

                recyclerView.setAdapter(myAdapter);
                recyclerView.setHasFixedSize(true);
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_second);
                recyclerView = findViewById(R.id.recyclerView);
                recyclerView.setLayoutManager(linearLayoutManager);
                MyAdapter1 myAdapter1 = new MyAdapter1();

                recyclerView.setAdapter(myAdapter1);
                recyclerView.setHasFixedSize(true);
                
            }
        });

    }
}