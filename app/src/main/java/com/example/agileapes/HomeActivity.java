package com.example.agileapes;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {


    public static MyAppDatabase myAppDatabase;
//Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myAppDatabase = Room.databaseBuilder(getApplicationContext(), MyAppDatabase.class, "QandaDb")
                .allowMainThreadQueries()
                .build();

        TextView tvHomeBananaNumber = findViewById(R.id.tvHomeBananaNumber);
        tvHomeBananaNumber.setText("" + Global.bananas);



    }

    public void launchSettingsScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), SettingsActivity.class);
        startActivity(myIntent);
    }

    public void launchQuizScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), QuizActivity.class);
        startActivity(myIntent);
    }

    public void launchMapScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), MapActivity.class);
        startActivity(myIntent);
    }

    public void launchDatabase(View view) {
        Intent myIntent = new Intent(getBaseContext(), Home2Activity.class);
        startActivity(myIntent);
    }

    public void launchPlay2(View view) {
        Intent myIntent = new Intent(getBaseContext(), Quiz2Activity.class);
        startActivity(myIntent);
    }
}
