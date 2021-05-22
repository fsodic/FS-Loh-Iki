package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.eK  reason: case insensitive filesystem */
public final class C1176eK {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, AbstractC1755mg> f4198a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final C1789nD f4199b;

    public C1176eK(C1789nD nDVar) {
        this.f4199b = nDVar;
    }

    public final void a(String str) {
        try {
            this.f4198a.put(str, this.f4199b.a(str));
        } catch (RemoteException e) {
            C0745Vl.b("Couldn't create RTB adapter : ", e);
        }
    }

    public final AbstractC1755mg b(String str) {
        if (this.f4198a.containsKey(str)) {
            return this.f4198a.get(str);
        }
        return null;
    }
}
