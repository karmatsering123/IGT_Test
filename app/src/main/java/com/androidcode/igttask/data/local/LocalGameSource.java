package com.androidcode.igttask.data.local;

import android.content.Context;
import android.util.Log;

import com.androidcode.igttask.model.Data;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;


public class LocalGameSource {

    RealmConfiguration realmConfig;
    Realm realm;

    public LocalGameSource(Context context)
    {
        realmConfig = new RealmConfiguration.Builder(context).deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(realmConfig);

        realm = Realm.getDefaultInstance();
    }

    public void addData(List<Data> results)
    {
        realm.beginTransaction();
        Log.d("test", "loading in data");
        for(int i = 0; i < results.size(); i++)
        {
            Data r = results.get(i);
            final Data finalResult = realm.copyToRealm(r);
        }
        realm.commitTransaction();
    }

    public List<Data> getDataFromLocal()
    {
        Log.d("test", "local data loading");
        RealmResults<Data> result2 = realm.where(Data.class)
                .findAll();
        //Log.d("test", result2.get(0).getTrackName());
        return result2;
    }
}
