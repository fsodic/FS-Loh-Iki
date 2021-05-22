package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class VU {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Class<?>> f3340a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f3341b;

    /* renamed from: c  reason: collision with root package name */
    private final UU f3342c;
    private final UT d;
    private final ST e;
    private HU f;
    private final Object g = new Object();

    public VU(Context context, UU uu, UT ut, ST st) {
        this.f3341b = context;
        this.f3342c = uu;
        this.d = ut;
        this.e = st;
    }

    private final Object a(Class<?> cls, LU lu) {
        try {
            return cls.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f3341b, "msa-r", lu.e(), null, new Bundle(), 2);
        } catch (Exception e2) {
            throw new SU(2004, e2);
        }
    }

    private final synchronized Class<?> b(LU lu) {
        if (lu.b() != null) {
            String n = lu.b().n();
            Class<?> cls = f3340a.get(n);
            if (cls != null) {
                return cls;
            }
            try {
                if (this.e.a(lu.c())) {
                    try {
                        File d2 = lu.d();
                        if (!d2.exists()) {
                            d2.mkdirs();
                        }
                        Class<?> loadClass = new DexClassLoader(lu.c().getAbsolutePath(), d2.getAbsolutePath(), null, this.f3341b.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                        f3340a.put(n, loadClass);
                        return loadClass;
                    } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
                        throw new SU(2008, e2);
                    }
                } else {
                    throw new SU(2026, "VM did not pass signature verification");
                }
            } catch (GeneralSecurityException e3) {
                throw new SU(2026, e3);
            }
        } else {
            throw new SU(4010, "mc");
        }
    }

    public final XT a() {
        HU hu;
        synchronized (this.g) {
            hu = this.f;
        }
        return hu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Exception] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.ads.LU r9) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.VU.a(com.google.android.gms.internal.ads.LU):void");
    }

    public final LU b() {
        synchronized (this.g) {
            if (this.f == null) {
                return null;
            }
            return this.f.b();
        }
    }
}
