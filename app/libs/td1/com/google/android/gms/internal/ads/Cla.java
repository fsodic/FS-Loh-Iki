package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

final class Cla implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Dla f1725a;

    Cla(Dla dla) {
        this.f1725a = dla;
    }

    public final void run() {
        synchronized (this.f1725a.f1814c) {
            if (!(this.f1725a.d) || !(this.f1725a.e)) {
                C0745Vl.a("App is still foreground");
            } else {
                this.f1725a.d = false;
                C0745Vl.a("App went background");
                for (Fla fla : this.f1725a.f) {
                    try {
                        fla.a(false);
                    } catch (Exception e) {
                        C0745Vl.b(BuildConfig.FLAVOR, e);
                    }
                }
            }
        }
    }
}
