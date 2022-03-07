package com.example.fthelloworld;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnMainClick(View view)
    {
        final TextView greetingTextView = findViewById(R.id.tvMain);
        greetingTextView.setText("Opa!");
    }
    public void setColour(View view)
    {
        final TextView greetingTextView = findViewById(R.id.tvMain);
        Random spalvos_id = new Random();
        int color = spalvos_id.nextInt();
        greetingTextView.setTextColor(color);
    }


}