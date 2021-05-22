package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import b.c.b.a.b.f;
import b.c.b.a.b.g;
import b.c.b.a.b.h;
import com.google.android.gms.ads.c.a;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.nfa  reason: case insensitive filesystem */
public class C1823nfa {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5063a = "nfa";

    /* renamed from: b  reason: collision with root package name */
    protected Context f5064b;

    /* renamed from: c  reason: collision with root package name */
    private ExecutorService f5065c;
    private DexClassLoader d;
    private C1888oda e;
    private byte[] f;
    private volatile a g = null;
    private volatile boolean h;
    private Future i;
    private boolean j;
    private volatile C1511jB k;
    private Future l;
    private C1670lW m;
    private boolean n;
    private boolean o;
    private Map<Pair<String, String>, C0999bga> p;
    private boolean q;
    private C1685lfa r;

    private C1823nfa(Context context) {
        boolean z = false;
        this.h = false;
        this.i = null;
        this.k = null;
        this.l = null;
        this.n = false;
        this.o = false;
        this.q = false;
        Context applicationContext = context.getApplicationContext();
        this.j = applicationContext != null ? true : z;
        this.f5064b = this.j ? applicationContext : context;
        this.p = new HashMap();
        if (this.r == null) {
            this.r = new C1685lfa(this.f5064b);
        }
    }

    public static C1823nfa a(Context context, String str, String str2, boolean z) {
        C1823nfa nfa = new C1823nfa(context);
        try {
            nfa.f5065c = Executors.newCachedThreadPool(new ThreadFactoryC2098rfa());
            nfa.h = z;
            if (z) {
                nfa.i = nfa.f5065c.submit(new RunnableC1961pfa(nfa));
            }
            nfa.f5065c.execute(new RunnableC2167sfa(nfa));
            try {
                f a2 = f.a();
                nfa.n = a2.b(nfa.f5064b) > 0;
                nfa.o = a2.c(nfa.f5064b) == 0;
            } catch (Throwable unused) {
            }
            nfa.a(0, true);
            if (C2512xfa.a()) {
                if (((Boolean) C2392voa.e().a(C2474x.Ib)).booleanValue()) {
                    throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                }
            }
            nfa.e = new C1888oda(null);
            try {
                nfa.f = nfa.e.a(str);
                try {
                    File cacheDir = nfa.f5064b.getCacheDir();
                    if (cacheDir == null) {
                        cacheDir = nfa.f5064b.getDir("dex", 0);
                        if (cacheDir == null) {
                            throw new C1616kfa();
                        }
                    }
                    File file = new File(String.format("%s/%s.jar", cacheDir, "1584479576572"));
                    if (!file.exists()) {
                        byte[] a3 = nfa.e.a(nfa.f, str2);
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        fileOutputStream.write(a3, 0, a3.length);
                        fileOutputStream.close();
                    }
                    nfa.b(cacheDir, "1584479576572");
                    try {
                        nfa.d = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, nfa.f5064b.getClassLoader());
                        a(file);
                        nfa.a(cacheDir, "1584479576572");
                        a(String.format("%s/%s.dex", cacheDir, "1584479576572"));
                        nfa.m = new C1670lW(nfa);
                        nfa.q = true;
                        return nfa;
                    } catch (Throwable th) {
                        a(file);
                        nfa.a(cacheDir, "1584479576572");
                        a(String.format("%s/%s.dex", cacheDir, "1584479576572"));
                        throw th;
                    }
                } catch (FileNotFoundException e2) {
                    throw new C1616kfa(e2);
                } catch (IOException e3) {
                    throw new C1616kfa(e3);
                } catch (Qca e4) {
                    throw new C1616kfa(e4);
                } catch (NullPointerException e5) {
                    throw new C1616kfa(e5);
                }
            } catch (Qca e6) {
                throw new C1616kfa(e6);
            }
        } catch (C1616kfa unused2) {
        }
    }

    private static void a(File file) {
        if (!file.exists()) {
            Log.d(f5063a, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf A[SYNTHETIC, Splitter:B:39:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d4 A[SYNTHETIC, Splitter:B:43:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[ExcHandler: Qca | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:20:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00de A[SYNTHETIC, Splitter:B:52:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e3 A[SYNTHETIC, Splitter:B:56:0x00e3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.io.File r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1823nfa.a(java.io.File, java.lang.String):void");
    }

    private static void a(String str) {
        a(new File(str));
    }

    /* access modifiers changed from: private */
    public static boolean b(int i2, C1511jB jBVar) {
        if (i2 < 4) {
            return jBVar == null || !jBVar.o() || jBVar.n().equals("0000000000000000000000000000000000000000000000000000000000000000") || !jBVar.s() || !jBVar.t().n() || jBVar.t().o() == -2;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e2 A[SYNTHETIC, Splitter:B:51:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e7 A[SYNTHETIC, Splitter:B:55:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[ExcHandler: Qca | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:21:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ee A[SYNTHETIC, Splitter:B:63:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f3 A[SYNTHETIC, Splitter:B:67:0x00f3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(java.io.File r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1823nfa.b(java.io.File, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public final void p() {
        try {
            if (this.g == null && this.j) {
                a aVar = new a(this.f5064b);
                aVar.c();
                this.g = aVar;
            }
        } catch (g | h | IOException unused) {
            this.g = null;
        }
    }

    private final C1511jB q() {
        try {
            return C0911aU.a(this.f5064b, this.f5064b.getPackageName(), Integer.toString(this.f5064b.getPackageManager().getPackageInfo(this.f5064b.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Context a() {
        return this.f5064b;
    }

    public final Method a(String str, String str2) {
        C0999bga bga = this.p.get(new Pair(str, str2));
        if (bga == null) {
            return null;
        }
        return bga.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        if (this.o) {
            Future<?> submit = this.f5065c.submit(new RunnableC2236tfa(this, i2, z));
            if (i2 == 0) {
                this.l = submit;
            }
        }
    }

    public final boolean a(String str, String str2, Class<?>... clsArr) {
        if (this.p.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.p.put(new Pair<>(str, str2), new C0999bga(this, str, str2, clsArr));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final C1511jB b(int i2, boolean z) {
        if (i2 > 0 && z) {
            try {
                Thread.sleep((long) (i2 * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return q();
    }

    public final boolean b() {
        return this.q;
    }

    public final int c() {
        if (this.m != null) {
            return C1670lW.a();
        }
        return Integer.MIN_VALUE;
    }

    public final boolean d() {
        return this.r.a();
    }

    public final ExecutorService e() {
        return this.f5065c;
    }

    public final DexClassLoader f() {
        return this.d;
    }

    public final C1888oda g() {
        return this.e;
    }

    public final byte[] h() {
        return this.f;
    }

    public final boolean i() {
        return this.n;
    }

    public final C1670lW j() {
        return this.m;
    }

    public final boolean k() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public final C1685lfa l() {
        return this.r;
    }

    public final C1511jB m() {
        return this.k;
    }

    public final Future n() {
        return this.l;
    }

    public final a o() {
        if (!this.h) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        Future future = this.i;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.i = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.i.cancel(true);
            }
        }
        return this.g;
    }
}
