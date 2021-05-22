package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* renamed from: com.google.android.gms.internal.ads.tg  reason: case insensitive filesystem */
public class C2237tg {
    public static AbstractC1755mg a(String str) {
        try {
            return new BinderC2168sg((RtbAdapter) Class.forName(str, false, C2237tg.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
