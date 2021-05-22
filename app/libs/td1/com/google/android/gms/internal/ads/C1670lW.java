package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.C0262Cw;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.google.android.gms.internal.ads.lW  reason: case insensitive filesystem */
public class C1670lW {

    /* renamed from: a  reason: collision with root package name */
    private static final ConditionVariable f4858a = new ConditionVariable();

    /* renamed from: b  reason: collision with root package name */
    protected static volatile Hma f4859b = null;

    /* renamed from: c  reason: collision with root package name */
    private static volatile Random f4860c = null;
    private C1823nfa d;
    protected volatile Boolean e;

    public C1670lW(C1823nfa nfa) {
        this.d = nfa;
        nfa.e().execute(new IV(this));
    }

    public static int a() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : c().nextInt();
        } catch (RuntimeException unused) {
            return c().nextInt();
        }
    }

    private static Random c() {
        if (f4860c == null) {
            synchronized (C1670lW.class) {
                if (f4860c == null) {
                    f4860c = new Random();
                }
            }
        }
        return f4860c;
    }

    public final void a(int i, int i2, long j) {
        a(i, i2, j, null, null);
    }

    public final void a(int i, int i2, long j, String str) {
        a(i, -1, j, str, null);
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            f4858a.block();
            if (this.e.booleanValue() && f4859b != null) {
                C0262Cw.a n = C0262Cw.n();
                n.a(this.d.f5064b.getPackageName());
                n.a(j);
                if (str != null) {
                    n.d(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    C2159sba.a(exc, new PrintWriter(stringWriter));
                    n.b(stringWriter.toString());
                    n.c(exc.getClass().getName());
                }
                Lma a2 = f4859b.a(((C0262Cw) ((AbstractC2092rca) n.j())).f());
                a2.b(i);
                if (i2 != -1) {
                    a2.a(i2);
                }
                a2.a();
            }
        } catch (Exception unused) {
        }
    }
}
