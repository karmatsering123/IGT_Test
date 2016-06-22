package com.androidcode.igttask.game;

import android.content.Context;

import com.androidcode.igttask.BasePresenter;
import com.androidcode.igttask.BaseView;
import com.androidcode.igttask.data.GameRepository;
import com.androidcode.igttask.model.Data;
import com.androidcode.igttask.observables.IGameAPI;

import java.util.List;


public interface GameContract {

    interface View extends BaseView<Presenter> {
        void showUsers(String s);
        void setAdapters(List<Data> results, boolean fromAPI);
        void showDialog();
        Context getApplicationContext();
    }

    interface Presenter extends BasePresenter {
        void loadUsers();
        void loadGames(IGameAPI _api, final boolean initialLoad);
        void loadLocalGames();
        GameRepository getRepository();
        void setRepository(GameRepository songRepo);
    }
}
