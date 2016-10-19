package com.sam_chordas.android.stockhawk.singleton;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by kunaljaggi on 6/17/16.
 */
public class StockHawkApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
