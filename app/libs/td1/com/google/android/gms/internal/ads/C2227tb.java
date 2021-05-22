package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.ads.b.i;
import com.google.android.gms.ads.s;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.tb  reason: case insensitive filesystem */
public final class C2227tb implements i {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC2158sb f5621a;

    /* renamed from: b  reason: collision with root package name */
    private final b f5622b;

    /* renamed from: c  reason: collision with root package name */
    private final s f5623c = new s();

    public C2227tb(AbstractC2158sb sbVar) {
        Context context;
        this.f5621a = sbVar;
        b bVar = null;
        try {
            context = (Context) b.c.b.a.c.b.Q(sbVar.yb());
        } catch (RemoteException | NullPointerException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
            context = null;
        }
        if (context != null) {
            b bVar2 = new b(context);
            try {
                if (this.f5621a.v(b.c.b.a.c.b.a(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e2) {
                C0745Vl.b(BuildConfig.FLAVOR, e2);
            }
        }
        this.f5622b = bVar;
    }

    @Override // com.google.android.gms.ads.b.i
    public final String J() {
        try {
            return this.f5621a.J();
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    public final AbstractC2158sb a() {
        return this.f5621a;
    }
}
