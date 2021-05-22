package com.google.android.gms.ads.b;

import com.google.android.gms.ads.t;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1026a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1027b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1028c;
    private final boolean d;
    private final int e;
    private final t f;
    private final boolean g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1029a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f1030b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f1031c = 0;
        private boolean d = false;
        private t e;
        private int f = 1;
        private boolean g = false;

        public final a a(int i) {
            this.f = i;
            return this;
        }

        public final a a(t tVar) {
            this.e = tVar;
            return this;
        }

        public final a a(boolean z) {
            this.d = z;
            return this;
        }

        public final d a() {
            return new d(this);
        }

        @Deprecated
        public final a b(int i) {
            this.f1030b = i;
            return this;
        }

        public final a b(boolean z) {
            this.f1029a = z;
            return this;
        }
    }

    private d(a aVar) {
        this.f1026a = aVar.f1029a;
        this.f1027b = aVar.f1030b;
        this.f1028c = aVar.f1031c;
        this.d = aVar.d;
        this.e = aVar.f;
        this.f = aVar.e;
        this.g = aVar.g;
    }

    public final int a() {
        return this.e;
    }

    @Deprecated
    public final int b() {
        return this.f1027b;
    }

    public final int c() {
        return this.f1028c;
    }

    public final t d() {
        return this.f;
    }

    public final boolean e() {
        return this.d;
    }

    public final boolean f() {
        return this.f1026a;
    }

    public final boolean g() {
        return this.g;
    }
}
