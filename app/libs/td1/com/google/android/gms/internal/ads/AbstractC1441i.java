package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.i  reason: case insensitive filesystem */
public abstract class AbstractC1441i<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4537a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4538b;

    /* renamed from: c  reason: collision with root package name */
    private final T f4539c;

    private AbstractC1441i(int i, String str, T t) {
        this.f4537a = i;
        this.f4538b = str;
        this.f4539c = t;
        C2392voa.d().a(this);
    }

    /* synthetic */ AbstractC1441i(int i, String str, Object obj, C1647l lVar) {
        this(i, str, obj);
    }

    public static AbstractC1441i<String> a(int i, String str) {
        AbstractC1441i<String> a2 = a(1, str, (String) null);
        C2392voa.d().c(a2);
        return a2;
    }

    public static AbstractC1441i<Float> a(int i, String str, float f) {
        return new C1716m(1, str, Float.valueOf(f));
    }

    public static AbstractC1441i<Integer> a(int i, String str, int i2) {
        return new C1578k(1, str, Integer.valueOf(i2));
    }

    public static AbstractC1441i<Long> a(int i, String str, long j) {
        return new C1785n(1, str, Long.valueOf(j));
    }

    public static AbstractC1441i<Boolean> a(int i, String str, Boolean bool) {
        return new C1647l(i, str, bool);
    }

    public static AbstractC1441i<String> a(int i, String str, String str2) {
        return new C1923p(1, str, str2);
    }

    /* access modifiers changed from: protected */
    public abstract T a(SharedPreferences sharedPreferences);

    public abstract T a(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract T a(JSONObject jSONObject);

    public final String a() {
        return this.f4538b;
    }

    public abstract void a(SharedPreferences.Editor editor, T t);

    public final int b() {
        return this.f4537a;
    }

    public final T c() {
        return this.f4539c;
    }
}
