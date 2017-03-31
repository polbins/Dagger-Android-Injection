package com.polbins.daggerandroidinjection.main;

/**
 * Created by polbins on 31/3/17.
 */

public interface MainContract {

    interface View {

        void updateView(int count);

    }

    interface Presenter {

        void start();

        void incrementButtonClick();

        void resetButtonClick();

    }

}
