package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.i  reason: case insensitive filesystem */
public abstract class AbstractC0183i {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1370a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static AbstractC0183i f1371b;

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.i$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f1372a;

        /* renamed from: b  reason: collision with root package name */
        private final String f1373b;

        /* renamed from: c  reason: collision with root package name */
        private final ComponentName f1374c = null;
        private final int d;

        public a(String str, String str2, int i) {
            r.b(str);
            this.f1372a = str;
            r.b(str2);
            this.f1373b = str2;
            this.d = i;
        }

        public final ComponentName a() {
            return this.f1374c;
        }

        public final Intent a(Context context) {
            String str = this.f1372a;
            return str != null ? new Intent(str).setPackage(this.f1373b) : new Intent().setComponent(this.f1374c);
        }

        public final String b() {
            return this.f1373b;
        }

        public final int c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return q.a(this.f1372a, aVar.f1372a) && q.a(this.f1373b, aVar.f1373b) && q.a(this.f1374c, aVar.f1374c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return q.a(this.f1372a, this.f1373b, this.f1374c, Integer.valueOf(this.d));
        }

        public final String toString() {
            String str = this.f1372a;
            return str == null ? this.f1374c.flattenToString() : str;
        }
    }

    public static AbstractC0183i a(Context context) {
        synchronized (f1370a) {
            if (f1371b == null) {
                f1371b = new F(context.getApplicationContext());
            }
        }
        return f1371b;
    }

    public final void a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        b(new a(str, str2, i), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void b(a aVar, ServiceConnection serviceConnection, String str);
}
