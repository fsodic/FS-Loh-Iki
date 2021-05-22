package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class o implements p {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f1379a;

    o(IBinder iBinder) {
        this.f1379a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.p
    public final void a(n nVar, C0180f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                fVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1379a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1379a;
    }
}
