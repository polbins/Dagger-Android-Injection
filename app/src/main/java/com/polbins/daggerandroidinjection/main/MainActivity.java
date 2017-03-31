package com.polbins.daggerandroidinjection.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.polbins.daggerandroidinjection.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void updateView(int count) {
        textView.setText(String.valueOf(count));
    }

}
