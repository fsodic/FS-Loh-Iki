package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new z();

    /* renamed from: a  reason: collision with root package name */
    private final int f1382a;

    /* renamed from: b  reason: collision with root package name */
    private final Account f1383b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1384c;
    private final GoogleSignInAccount d;

    s(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f1382a = i;
        this.f1383b = account;
        this.f1384c = i2;
        this.d = googleSignInAccount;
    }

    public s(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public Account L() {
        return this.f1383b;
    }

    public int M() {
        return this.f1384c;
    }

    public GoogleSignInAccount N() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1382a);
        c.a(parcel, 2, (Parcelable) L(), i, false);
        c.a(parcel, 3, M());
        c.a(parcel, 4, (Parcelable) N(), i, false);
        c.a(parcel, a2);
    }
}
