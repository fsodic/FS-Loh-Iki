package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class DX {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList<AX> f1773a = new CopyOnWriteArrayList<>();

    public static AX a(String str) {
        Iterator<AX> it = f1773a.iterator();
        while (it.hasNext()) {
            AX next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
