package com.polbins.daggerandroidinjection.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.polbins.daggerandroidinjection.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    @BindView(R.id.textView)
    TextView textView;

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.start();
    }

    @Override
    public void updateView(int count) {
        textView.setText(String.valueOf(count));
    }

    @OnClick(R.id.incrementButton)
    void onIncrementClick() {
        presenter.incrementButtonClick();
    }

    @OnClick(R.id.resetButton)
    void onResetClick() {
        presenter.resetButtonClick();
    }

}
