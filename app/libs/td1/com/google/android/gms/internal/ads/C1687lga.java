package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.lga  reason: case insensitive filesystem */
public class C1687lga implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f4886a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4887b;

    protected C1687lga(IBinder iBinder, String str) {
        this.f4886a = iBinder;
        this.f4887b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel Jb() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4887b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f4886a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f4886a;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4886a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void c(int i, Parcel parcel) {
        try {
            this.f4886a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
