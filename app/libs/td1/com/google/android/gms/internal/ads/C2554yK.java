package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.a.a;

/* renamed from: com.google.android.gms.internal.ads.yK  reason: case insensitive filesystem */
public final class C2554yK implements a {

    /* renamed from: a  reason: collision with root package name */
    private Uoa f6070a;

    public final synchronized Uoa a() {
        return this.f6070a;
    }

    public final synchronized void a(Uoa uoa) {
        this.f6070a = uoa;
    }

    @Override // com.google.android.gms.ads.a.a
    public final synchronized void a(String str, String str2) {
        if (this.f6070a != null) {
            try {
                this.f6070a.a(str, str2);
            } catch (RemoteException e) {
                C0745Vl.c("Remote Exception at onAppEvent.", e);
            }
        }
    }
}
