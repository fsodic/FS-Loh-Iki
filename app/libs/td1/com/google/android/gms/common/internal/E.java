package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a.b;

public final class E implements Parcelable.Creator<C0180f> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0180f createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        d[] dVarArr = null;
        d[] dVarArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.w(parcel, a2);
                    break;
                case 2:
                    i2 = b.w(parcel, a2);
                    break;
                case 3:
                    i3 = b.w(parcel, a2);
                    break;
                case 4:
                    str = b.o(parcel, a2);
                    break;
                case 5:
                    iBinder = b.v(parcel, a2);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.b(parcel, a2, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.f(parcel, a2);
                    break;
                case 8:
                    account = (Account) b.a(parcel, a2, Account.CREATOR);
                    break;
                case 9:
                default:
                    b.z(parcel, a2);
                    break;
                case 10:
                    dVarArr = (d[]) b.b(parcel, a2, d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (d[]) b.b(parcel, a2, d.CREATOR);
                    break;
                case 12:
                    z = b.s(parcel, a2);
                    break;
            }
        }
        b.r(parcel, b2);
        return new C0180f(i, i2, i3, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0180f[] newArray(int i) {
        return new C0180f[i];
    }
}
