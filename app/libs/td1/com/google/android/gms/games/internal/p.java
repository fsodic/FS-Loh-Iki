package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public IBinder f1469a;

    /* renamed from: b  reason: collision with root package name */
    public int f1470b;

    /* renamed from: c  reason: collision with root package name */
    public int f1471c;
    public int d;
    public int e;
    public int f;
    public int g;

    private p(int i, IBinder iBinder) {
        this.f1471c = -1;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.f1470b = i;
        this.f1469a = null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.f1470b);
        bundle.putInt("popupLocationInfo.displayId", this.f1471c);
        bundle.putInt("popupLocationInfo.left", this.d);
        bundle.putInt("popupLocationInfo.top", this.e);
        bundle.putInt("popupLocationInfo.right", this.f);
        bundle.putInt("popupLocationInfo.bottom", this.g);
        return bundle;
    }
}
