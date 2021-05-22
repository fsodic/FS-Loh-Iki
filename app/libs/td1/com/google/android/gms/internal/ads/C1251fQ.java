package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.fQ  reason: case insensitive filesystem */
public final class C1251fQ {
    public static <T> void a(AtomicReference<T> atomicReference, AbstractC1458iQ<T> iQVar) {
        T t = atomicReference.get();
        if (t != null) {
            try {
                iQVar.a(t);
            } catch (RemoteException e) {
                C0745Vl.d("#007 Could not call remote method.", e);
            }
        }
    }
}
