package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.d;
import b.c.b.a.b.f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC0186l;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.common.internal.f  reason: case insensitive filesystem */
public class C0180f extends a {
    public static final Parcelable.Creator<C0180f> CREATOR = new E();

    /* renamed from: a  reason: collision with root package name */
    private final int f1364a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1365b;

    /* renamed from: c  reason: collision with root package name */
    private int f1366c;
    String d;
    IBinder e;
    Scope[] f;
    Bundle g;
    Account h;
    d[] i;
    d[] j;
    private boolean k;

    public C0180f(int i2) {
        this.f1364a = 4;
        this.f1366c = f.f302a;
        this.f1365b = i2;
        this.k = true;
    }

    C0180f(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z) {
        this.f1364a = i2;
        this.f1365b = i3;
        this.f1366c = i4;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i2 < 2) {
            this.h = iBinder != null ? BinderC0175a.a(AbstractC0186l.a.a(iBinder)) : null;
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr;
        this.g = bundle;
        this.i = dVarArr;
        this.j = dVarArr2;
        this.k = z;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1364a);
        c.a(parcel, 2, this.f1365b);
        c.a(parcel, 3, this.f1366c);
        c.a(parcel, 4, this.d, false);
        c.a(parcel, 5, this.e, false);
        c.a(parcel, 6, (Parcelable[]) this.f, i2, false);
        c.a(parcel, 7, this.g, false);
        c.a(parcel, 8, (Parcelable) this.h, i2, false);
        c.a(parcel, 10, (Parcelable[]) this.i, i2, false);
        c.a(parcel, 11, (Parcelable[]) this.j, i2, false);
        c.a(parcel, 12, this.k);
        c.a(parcel, a2);
    }
}
