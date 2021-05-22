package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class HK {

    /* renamed from: a  reason: collision with root package name */
    private final LK<C0952at> f2119a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2120b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC2187spa f2121c;
    private boolean d = false;

    public HK(LK<C0952at> lk, String str) {
        this.f2119a = lk;
        this.f2120b = str;
    }

    public final synchronized String a() {
        try {
            if (this.f2121c == null) {
                return null;
            }
            return this.f2121c.k();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final synchronized void a(Zna zna, int i) {
        this.f2121c = null;
        this.d = this.f2119a.a(zna, this.f2120b, new MK(i), new GK(this));
    }

    public final synchronized boolean b() {
        return this.f2119a.q();
    }

    public final synchronized String c() {
        try {
            if (this.f2121c == null) {
                return null;
            }
            return this.f2121c.k();
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
            return null;
        }
    }
}
