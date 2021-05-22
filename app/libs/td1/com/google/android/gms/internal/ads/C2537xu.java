package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.xu  reason: case insensitive filesystem */
public class C2537xu {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6037a;

    /* renamed from: b  reason: collision with root package name */
    private final GR f6038b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f6039c;
    private final String d;
    private final AR e;

    /* renamed from: com.google.android.gms.internal.ads.xu$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Context f6040a;

        /* renamed from: b  reason: collision with root package name */
        private GR f6041b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f6042c;
        private String d;
        private AR e;

        public final a a(Context context) {
            this.f6040a = context;
            return this;
        }

        public final a a(Bundle bundle) {
            this.f6042c = bundle;
            return this;
        }

        public final a a(AR ar) {
            this.e = ar;
            return this;
        }

        public final a a(GR gr) {
            this.f6041b = gr;
            return this;
        }

        public final a a(String str) {
            this.d = str;
            return this;
        }

        public final C2537xu a() {
            return new C2537xu(this);
        }
    }

    private C2537xu(a aVar) {
        this.f6037a = aVar.f6040a;
        this.f6038b = aVar.f6041b;
        this.f6039c = aVar.f6042c;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    /* access modifiers changed from: package-private */
    public final Context a(Context context) {
        return this.d != null ? context : this.f6037a;
    }

    /* access modifiers changed from: package-private */
    public final a a() {
        a aVar = new a();
        aVar.a(this.f6037a);
        aVar.a(this.f6038b);
        aVar.a(this.d);
        aVar.a(this.f6039c);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final GR b() {
        return this.f6038b;
    }

    /* access modifiers changed from: package-private */
    public final AR c() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public final Bundle d() {
        return this.f6039c;
    }

    /* access modifiers changed from: package-private */
    public final String e() {
        return this.d;
    }
}
