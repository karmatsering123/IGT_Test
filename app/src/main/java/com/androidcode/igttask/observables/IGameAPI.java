package com.androidcode.igttask.observables;

import com.androidcode.igttask.model.Games;
import com.androidcode.igttask.utils.Constants;

import retrofit.http.GET;
import rx.Observable;


public interface IGameAPI {
    @GET(Constants.SECOND_URL)
    Observable<Games> getGames();
}
