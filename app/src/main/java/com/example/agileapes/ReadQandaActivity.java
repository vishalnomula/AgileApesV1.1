package com.example.agileapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ReadQandaActivity extends AppCompatActivity {

    private TextView tvShowQanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_qanda);

        tvShowQanda = findViewById(R.id.tvShowQanda);

        List<Qanda> qandas = HomeActivity.myAppDatabase.myDao().getQandas();

        String info = "";

        for(Qanda qnda : qandas) {
            int id = qnda.getId();
            String question = qnda.getQuestion();
            String answer = qnda.getAnswer();

            info = info+"\n\n"+"Id :"+id+"\nQuestion :"+question+"\n"+"Answer :"+answer;
        }

        tvShowQanda.setText(info);
        Global.info = info;

    }
}
