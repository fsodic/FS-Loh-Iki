package org.cocos2dx.lib;

import b.d.a.a.q;
import java.util.Map;

/* renamed from: org.cocos2dx.lib.l  reason: case insensitive filesystem */
class RunnableC2703l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxDownloader f6391a;

    RunnableC2703l(Cocos2dxDownloader cocos2dxDownloader) {
        this.f6391a = cocos2dxDownloader;
    }

    public void run() {
        for (Map.Entry entry : Cocos2dxDownloader.access$400(this.f6391a).entrySet()) {
            q qVar = ((Qa) entry.getValue()).f6323a;
            if (qVar != null) {
                qVar.a(true);
            }
        }
    }
}
