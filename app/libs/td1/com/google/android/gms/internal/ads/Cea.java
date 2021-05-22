package com.google.android.gms.internal.ads;

import android.util.Log;

public final class Cea extends Jea {

    /* renamed from: a  reason: collision with root package name */
    private String f1703a;

    public Cea(String str) {
        this.f1703a = str;
    }

    @Override // com.google.android.gms.internal.ads.Jea
    public final void a(String str) {
        String str2 = this.f1703a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
