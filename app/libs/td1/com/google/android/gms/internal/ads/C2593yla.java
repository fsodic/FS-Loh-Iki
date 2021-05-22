package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.yla  reason: case insensitive filesystem */
public final class C2593yla {

    /* renamed from: a  reason: collision with root package name */
    private final int f6128a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6129b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6130c;
    private final boolean d;
    private final Nla e;
    private final Ula f;
    private final Object g = new Object();
    private ArrayList<String> h = new ArrayList<>();
    private ArrayList<String> i = new ArrayList<>();
    private ArrayList<Lla> j = new ArrayList<>();
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private int n;
    private String o = BuildConfig.FLAVOR;
    private String p = BuildConfig.FLAVOR;
    private String q = BuildConfig.FLAVOR;

    public C2593yla(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.f6128a = i2;
        this.f6129b = i3;
        this.f6130c = i4;
        this.d = z;
        this.e = new Nla(i5);
        this.f = new Ula(i6, i7, i8);
    }

    private final int a(int i2, int i3) {
        return this.d ? this.f6129b : (i2 * this.f6128a) + (i3 * this.f6129b);
    }

    private static String a(ArrayList<String> arrayList, int i2) {
        if (arrayList.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = arrayList.get(i3);
            i3++;
            sb.append(str);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    private final void c(String str, boolean z, float f2, float f3, float f4, float f5) {
        if (str != null && str.length() >= this.f6130c) {
            synchronized (this.g) {
                this.h.add(str);
                this.k += str.length();
                if (z) {
                    this.i.add(str);
                    this.j.add(new Lla(f2, f3, f4, f5, this.i.size() - 1));
                }
            }
        }
    }

    public final int a() {
        return this.n;
    }

    public final void a(int i2) {
        this.l = i2;
    }

    public final void a(String str, boolean z, float f2, float f3, float f4, float f5) {
        c(str, z, f2, f3, f4, f5);
        synchronized (this.g) {
            if (this.m < 0) {
                C0745Vl.a("ActivityContent: negative number of WebViews.");
            }
            j();
        }
    }

    public final void b(String str, boolean z, float f2, float f3, float f4, float f5) {
        c(str, z, f2, f3, f4, f5);
    }

    public final boolean b() {
        boolean z;
        synchronized (this.g) {
            z = this.m == 0;
        }
        return z;
    }

    public final String c() {
        return this.o;
    }

    public final String d() {
        return this.p;
    }

    public final String e() {
        return this.q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2593yla)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C2593yla) obj).o;
        return str != null && str.equals(this.o);
    }

    public final void f() {
        synchronized (this.g) {
            this.n -= 100;
        }
    }

    public final void g() {
        synchronized (this.g) {
            this.m--;
        }
    }

    public final void h() {
        synchronized (this.g) {
            this.m++;
        }
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final void i() {
        synchronized (this.g) {
            int a2 = a(this.k, this.l);
            if (a2 > this.n) {
                this.n = a2;
            }
        }
    }

    public final void j() {
        synchronized (this.g) {
            int a2 = a(this.k, this.l);
            if (a2 > this.n) {
                this.n = a2;
                if (!q.g().i().j()) {
                    this.o = this.e.a(this.h);
                    this.p = this.e.a(this.i);
                }
                if (!q.g().i().g()) {
                    this.q = this.f.a(this.i, this.j);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int k() {
        return this.k;
    }

    public final String toString() {
        int i2 = this.l;
        int i3 = this.n;
        int i4 = this.k;
        String a2 = a(this.h, 100);
        String a3 = a(this.i, 100);
        String str = this.o;
        String str2 = this.p;
        String str3 = this.q;
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 165 + String.valueOf(a3).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i2);
        sb.append(" score:");
        sb.append(i3);
        sb.append(" total_length:");
        sb.append(i4);
        sb.append("\n text: ");
        sb.append(a2);
        sb.append("\n viewableText");
        sb.append(a3);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
