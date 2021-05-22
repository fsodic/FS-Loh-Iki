package org.cocos2dx.lib;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.b.a.a;

/* renamed from: org.cocos2dx.lib.ia  reason: case insensitive filesystem */
class ServiceConnectionC2698ia implements ServiceConnection {
    ServiceConnectionC2698ia() {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a unused = Cocos2dxHelper.mGameServiceBinder = a.AbstractBinderC0008a.a(iBinder);
        Cocos2dxHelper.fastLoading(7);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Cocos2dxHelper.sActivity.getApplicationContext().unbindService(Cocos2dxHelper.connection);
    }
}
