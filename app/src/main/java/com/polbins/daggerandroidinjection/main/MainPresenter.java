package com.polbins.daggerandroidinjection.main;

import javax.inject.Inject;

/**
 * Created by polbins on 31/3/17.
 */

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View view;
    private int counter = 1;

    @Inject
    MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {
        view.updateView(counter);
    }

    @Override
    public void incrementButtonClick() {
        counter++;
        view.updateView(counter);
    }

    @Override
    public void resetButtonClick() {
        counter = 0;
        view.updateView(counter);
    }
}
