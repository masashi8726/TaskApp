package jp.techacademy.masashi.muto.taskapp;

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public  void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
