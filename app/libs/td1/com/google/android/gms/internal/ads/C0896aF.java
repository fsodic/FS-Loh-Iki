package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aF  reason: case insensitive filesystem */
public class C0896aF extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final int f3789a;

    public C0896aF(int i) {
        this.f3789a = i;
    }

    public C0896aF(int i, String str) {
        super(str);
        this.f3789a = i;
    }

    public C0896aF(int i, String str, Throwable th) {
        super(str, th);
        this.f3789a = i;
    }

    public static Sna a(Throwable th) {
        if (th instanceof C0896aF) {
            return ((C0896aF) th).a();
        }
        if (!(th instanceof C0874_k)) {
            return WR.a(YR.f3560a, null);
        }
        C0874_k _kVar = (C0874_k) th;
        return new Sna(_kVar.a(), C2014qV.c(_kVar.getMessage()), "com.google.android.gms.ads");
    }

    public final Sna a() {
        int i;
        String message;
        if (getMessage() == null) {
            i = this.f3789a;
            message = null;
        } else {
            i = this.f3789a;
            message = getMessage();
        }
        return WR.a(i, message);
    }
}
