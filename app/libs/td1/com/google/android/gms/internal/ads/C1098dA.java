package com.google.android.gms.internal.ads;

import a.c.g;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.dA  reason: case insensitive filesystem */
public final class C1098dA {

    /* renamed from: a  reason: collision with root package name */
    public static final C1098dA f4044a = new C1235fA().a();

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC2503xb f4045b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC2434wb f4046c;
    private final AbstractC0501Mb d;
    private final AbstractC0475Lb e;
    private final AbstractC2438wd f;
    private final g<String, AbstractC0293Eb> g;
    private final g<String, AbstractC0241Cb> h;

    private C1098dA(C1235fA fAVar) {
        this.f4045b = fAVar.f4267a;
        this.f4046c = fAVar.f4268b;
        this.d = fAVar.f4269c;
        this.g = new g<>(fAVar.f);
        this.h = new g<>(fAVar.g);
        this.e = fAVar.d;
        this.f = fAVar.e;
    }

    public final AbstractC0293Eb a(String str) {
        return this.g.get(str);
    }

    public final AbstractC2503xb a() {
        return this.f4045b;
    }

    public final AbstractC0241Cb b(String str) {
        return this.h.get(str);
    }

    public final AbstractC2434wb b() {
        return this.f4046c;
    }

    public final AbstractC0501Mb c() {
        return this.d;
    }

    public final AbstractC0475Lb d() {
        return this.e;
    }

    public final AbstractC2438wd e() {
        return this.f;
    }

    public final ArrayList<String> f() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.d != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f4045b != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f4046c != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.g.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> g() {
        ArrayList<String> arrayList = new ArrayList<>(this.g.size());
        for (int i = 0; i < this.g.size(); i++) {
            arrayList.add(this.g.b(i));
        }
        return arrayList;
    }
}
