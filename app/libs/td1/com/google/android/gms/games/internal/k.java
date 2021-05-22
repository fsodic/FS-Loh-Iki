package com.google.android.gms.games.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.e.a;
import b.c.b.a.d.e.l;

public final class k extends a implements j {
    k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    @Override // com.google.android.gms.games.internal.j
    public final Bundle F() {
        Parcel a2 = a(5004, ub());
        Bundle bundle = (Bundle) l.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.games.internal.j
    public final Intent Ra() {
        Parcel a2 = a(9003, ub());
        Intent intent = (Intent) l.a(a2, Intent.CREATOR);
        a2.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.j
    public final void a(long j) {
        Parcel ub = ub();
        ub.writeLong(j);
        b(5001, ub);
    }

    @Override // com.google.android.gms.games.internal.j
    public final void a(IBinder iBinder, Bundle bundle) {
        Parcel ub = ub();
        ub.writeStrongBinder(iBinder);
        l.a(ub, bundle);
        b(5005, ub);
    }

    @Override // com.google.android.gms.games.internal.j
    public final void a(f fVar) {
        Parcel ub = ub();
        l.a(ub, fVar);
        b(5002, ub);
    }

    @Override // com.google.android.gms.games.internal.j
    public final void a(f fVar, String str, int i, IBinder iBinder, Bundle bundle) {
        Parcel ub = ub();
        l.a(ub, fVar);
        ub.writeString(str);
        ub.writeInt(i);
        ub.writeStrongBinder(iBinder);
        l.a(ub, bundle);
        b(5025, ub);
    }

    @Override // com.google.android.gms.games.internal.j
    public final void a(f fVar, String str, long j, String str2) {
        Parcel ub = ub();
        l.a(ub, fVar);
        ub.writeString(str);
        ub.writeLong(j);
        ub.writeString(str2);
        b(7002, ub);
    }

    @Override // com.google.android.gms.games.internal.j
    public final void a(f fVar, String str, IBinder iBinder, Bundle bundle) {
        Parcel ub = ub();
        l.a(ub, fVar);
        ub.writeString(str);
        ub.writeStrongBinder(iBinder);
        l.a(ub, bundle);
        b(5024, ub);
    }

    @Override // com.google.android.gms.games.internal.j
    public final void a(h hVar, long j) {
        Parcel ub = ub();
        l.a(ub, hVar);
        ub.writeLong(j);
        b(15501, ub);
    }

    @Override // com.google.android.gms.games.internal.j
    public final void eb() {
        b(5006, ub());
    }

    @Override // com.google.android.gms.games.internal.j
    public final Intent va() {
        Parcel a2 = a(9005, ub());
        Intent intent = (Intent) l.a(a2, Intent.CREATOR);
        a2.recycle();
        return intent;
    }
}
