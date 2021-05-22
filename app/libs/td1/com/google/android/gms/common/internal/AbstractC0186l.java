package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.c.b;
import b.c.b.a.d.c.c;

/* renamed from: com.google.android.gms.common.internal.l  reason: case insensitive filesystem */
public interface AbstractC0186l extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.l$a */
    public static abstract class a extends b implements AbstractC0186l {

        /* renamed from: com.google.android.gms.common.internal.l$a$a  reason: collision with other inner class name */
        public static class C0029a extends b.c.b.a.d.c.a implements AbstractC0186l {
            C0029a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.AbstractC0186l
            public final Account r() {
                Parcel a2 = a(2, ub());
                Account account = (Account) c.a(a2, Account.CREATOR);
                a2.recycle();
                return account;
            }
        }

        public static AbstractC0186l a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof AbstractC0186l ? (AbstractC0186l) queryLocalInterface : new C0029a(iBinder);
        }
    }

    Account r();
}
