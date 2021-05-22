package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.b.c;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Za  reason: case insensitive filesystem */
public final class C0838Za extends c.b {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0812Ya f3643a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f3644b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f3645c;
    private final double d;
    private final int e;
    private final int f;

    public C0838Za(AbstractC0812Ya ya) {
        Drawable drawable;
        int i;
        this.f3643a = ya;
        Uri uri = null;
        try {
            a Ja = this.f3643a.Ja();
            if (Ja != null) {
                drawable = (Drawable) b.Q(Ja);
                this.f3644b = drawable;
                uri = this.f3643a.getUri();
                this.f3645c = uri;
                double d2 = 1.0d;
                d2 = this.f3643a.Ya();
                this.d = d2;
                int i2 = -1;
                i = this.f3643a.getWidth();
                this.e = i;
                i2 = this.f3643a.getHeight();
                this.f = i2;
            }
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
        }
        drawable = null;
        this.f3644b = drawable;
        try {
            uri = this.f3643a.getUri();
        } catch (RemoteException e3) {
            C0745Vl.b(BuildConfig.FLAVOR, e3);
        }
        this.f3645c = uri;
        double d22 = 1.0d;
        try {
            d22 = this.f3643a.Ya();
        } catch (RemoteException e4) {
            C0745Vl.b(BuildConfig.FLAVOR, e4);
        }
        this.d = d22;
        int i22 = -1;
        try {
            i = this.f3643a.getWidth();
        } catch (RemoteException e5) {
            C0745Vl.b(BuildConfig.FLAVOR, e5);
            i = -1;
        }
        this.e = i;
        try {
            i22 = this.f3643a.getHeight();
        } catch (RemoteException e6) {
            C0745Vl.b(BuildConfig.FLAVOR, e6);
        }
        this.f = i22;
    }

    @Override // com.google.android.gms.ads.b.c.b
    public final Drawable a() {
        return this.f3644b;
    }

    @Override // com.google.android.gms.ads.b.c.b
    public final int b() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.b.c.b
    public final double c() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.b.c.b
    public final Uri d() {
        return this.f3645c;
    }

    @Override // com.google.android.gms.ads.b.c.b
    public final int e() {
        return this.e;
    }
}
