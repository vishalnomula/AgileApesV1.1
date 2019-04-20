package com.example.agileapes;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home2Activity extends AppCompatActivity {

    //public static MyAppDatabase myAppDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

      //  myAppDatabase = Room.databaseBuilder(getApplicationContext(), MyAppDatabase.class, "QandaDb")
       //         .allowMainThreadQueries()
        //        .build();
    }

    public void launchAddQanda(View view) {
        Intent myIntent = new Intent(getBaseContext(), AddQandaActivity.class);
        startActivity(myIntent);
    }

    public void launchReadQanda(View view) {
        Intent myIntent = new Intent(getBaseContext(), ReadQandaActivity.class);
        startActivity(myIntent);
    }

}
