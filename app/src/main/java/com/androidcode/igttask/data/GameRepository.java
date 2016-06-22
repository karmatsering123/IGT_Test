package com.androidcode.igttask.data;

import android.content.Context;

import com.androidcode.igttask.data.remote.RemoteGameSource;
import com.androidcode.igttask.data.local.LocalGameSource;


public class GameRepository {

    private LocalGameSource localSource;

    private RemoteGameSource remoteSource;

    public GameRepository(Context c)
    {
        this.localSource = new LocalGameSource(c);
        this.remoteSource = new RemoteGameSource();
    }

    public RemoteGameSource getRemoteSource()
    {
        return this.remoteSource;
    }
    public void setRemoteSource(RemoteGameSource remote)
    {
        this.remoteSource = remote;
    }

    public LocalGameSource getLocalSource()
    {
        return this.localSource;
    }
    public void setLocalSource(LocalGameSource local)
    {
        this.localSource = local;
    }
}
