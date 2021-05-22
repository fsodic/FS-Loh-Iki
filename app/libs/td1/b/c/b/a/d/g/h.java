package b.c.b.a.d.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.b.b.a;
import b.c.b.a.f.a.a.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class h extends b.c.b.a.b.b.b.b implements b.c.b.a.f.a.a.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, a.C0012a<?, ?>> f487a;
    private boolean A;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Integer> f488b;

    /* renamed from: c  reason: collision with root package name */
    private final int f489c;
    private String d;
    private a e;
    private String f;
    private String g;
    private int h;
    private b i;
    private String j;
    private String k;
    private int l;
    private String m;
    private c n;
    private boolean o;
    private String p;
    private d q;
    private String r;
    private int s;
    private List<e> t;
    private List<f> u;
    private int v;
    private int w;
    private String x;
    private String y;
    private List<g> z;

    public static final class a extends b.c.b.a.b.b.b.b implements a.AbstractC0017a {
        public static final Parcelable.Creator<a> CREATOR = new j();

        /* renamed from: a  reason: collision with root package name */
        private static final HashMap<String, a.C0012a<?, ?>> f490a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Integer> f491b;

        /* renamed from: c  reason: collision with root package name */
        private final int f492c;
        private int d;
        private int e;

        static {
            HashMap<String, a.C0012a<?, ?>> hashMap = new HashMap<>();
            f490a = hashMap;
            hashMap.put("max", a.C0012a.b("max", 2));
            f490a.put("min", a.C0012a.b("min", 3));
        }

        public a() {
            this.f492c = 1;
            this.f491b = new HashSet();
        }

        a(Set<Integer> set, int i, int i2, int i3) {
            this.f491b = set;
            this.f492c = i;
            this.d = i2;
            this.e = i3;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final Object a(a.C0012a aVar) {
            int i;
            int L = aVar.L();
            if (L == 2) {
                i = this.d;
            } else if (L == 3) {
                i = this.e;
            } else {
                int L2 = aVar.L();
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(L2);
                throw new IllegalStateException(sb.toString());
            }
            return Integer.valueOf(i);
        }

        @Override // b.c.b.a.b.b.b.a
        public final /* synthetic */ Map a() {
            return f490a;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final boolean b(a.C0012a aVar) {
            return this.f491b.contains(Integer.valueOf(aVar.L()));
        }

        @Override // b.c.b.a.b.b.b.b
        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            for (a.C0012a<?, ?> aVar2 : f490a.values()) {
                if (b(aVar2)) {
                    if (!aVar.b(aVar2) || !a(aVar2).equals(aVar.a(aVar2))) {
                        return false;
                    }
                } else if (aVar.b(aVar2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // b.c.b.a.b.b.b.b
        public final int hashCode() {
            int i = 0;
            for (a.C0012a<?, ?> aVar : f490a.values()) {
                if (b(aVar)) {
                    i = i + aVar.L() + a(aVar).hashCode();
                }
            }
            return i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
            Set<Integer> set = this.f491b;
            if (set.contains(1)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f492c);
            }
            if (set.contains(2)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 2, this.d);
            }
            if (set.contains(3)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 3, this.e);
            }
            com.google.android.gms.common.internal.a.c.a(parcel, a2);
        }
    }

    public static final class b extends b.c.b.a.b.b.b.b implements a.b {
        public static final Parcelable.Creator<b> CREATOR = new k();

        /* renamed from: a  reason: collision with root package name */
        private static final HashMap<String, a.C0012a<?, ?>> f493a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Integer> f494b;

        /* renamed from: c  reason: collision with root package name */
        private final int f495c;
        private a d;
        private C0016b e;
        private int f;

        public static final class a extends b.c.b.a.b.b.b.b implements a.b.AbstractC0018a {
            public static final Parcelable.Creator<a> CREATOR = new l();

            /* renamed from: a  reason: collision with root package name */
            private static final HashMap<String, a.C0012a<?, ?>> f496a;

            /* renamed from: b  reason: collision with root package name */
            private final Set<Integer> f497b;

            /* renamed from: c  reason: collision with root package name */
            private final int f498c;
            private int d;
            private int e;

            static {
                HashMap<String, a.C0012a<?, ?>> hashMap = new HashMap<>();
                f496a = hashMap;
                hashMap.put("leftImageOffset", a.C0012a.b("leftImageOffset", 2));
                f496a.put("topImageOffset", a.C0012a.b("topImageOffset", 3));
            }

            public a() {
                this.f498c = 1;
                this.f497b = new HashSet();
            }

            a(Set<Integer> set, int i, int i2, int i3) {
                this.f497b = set;
                this.f498c = i;
                this.d = i2;
                this.e = i3;
            }

            /* access modifiers changed from: protected */
            @Override // b.c.b.a.b.b.b.a
            public final Object a(a.C0012a aVar) {
                int i;
                int L = aVar.L();
                if (L == 2) {
                    i = this.d;
                } else if (L == 3) {
                    i = this.e;
                } else {
                    int L2 = aVar.L();
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(L2);
                    throw new IllegalStateException(sb.toString());
                }
                return Integer.valueOf(i);
            }

            @Override // b.c.b.a.b.b.b.a
            public final /* synthetic */ Map a() {
                return f496a;
            }

            /* access modifiers changed from: protected */
            @Override // b.c.b.a.b.b.b.a
            public final boolean b(a.C0012a aVar) {
                return this.f497b.contains(Integer.valueOf(aVar.L()));
            }

            @Override // b.c.b.a.b.b.b.b
            public final boolean equals(Object obj) {
                if (!(obj instanceof a)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                a aVar = (a) obj;
                for (a.C0012a<?, ?> aVar2 : f496a.values()) {
                    if (b(aVar2)) {
                        if (!aVar.b(aVar2) || !a(aVar2).equals(aVar.a(aVar2))) {
                            return false;
                        }
                    } else if (aVar.b(aVar2)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // b.c.b.a.b.b.b.b
            public final int hashCode() {
                int i = 0;
                for (a.C0012a<?, ?> aVar : f496a.values()) {
                    if (b(aVar)) {
                        i = i + aVar.L() + a(aVar).hashCode();
                    }
                }
                return i;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
                Set<Integer> set = this.f497b;
                if (set.contains(1)) {
                    com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f498c);
                }
                if (set.contains(2)) {
                    com.google.android.gms.common.internal.a.c.a(parcel, 2, this.d);
                }
                if (set.contains(3)) {
                    com.google.android.gms.common.internal.a.c.a(parcel, 3, this.e);
                }
                com.google.android.gms.common.internal.a.c.a(parcel, a2);
            }
        }

        /* renamed from: b.c.b.a.d.g.h$b$b  reason: collision with other inner class name */
        public static final class C0016b extends b.c.b.a.b.b.b.b implements a.b.AbstractC0019b {
            public static final Parcelable.Creator<C0016b> CREATOR = new m();

            /* renamed from: a  reason: collision with root package name */
            private static final HashMap<String, a.C0012a<?, ?>> f499a;

            /* renamed from: b  reason: collision with root package name */
            private final Set<Integer> f500b;

            /* renamed from: c  reason: collision with root package name */
            private final int f501c;
            private int d;
            private String e;
            private int f;

            static {
                HashMap<String, a.C0012a<?, ?>> hashMap = new HashMap<>();
                f499a = hashMap;
                hashMap.put("height", a.C0012a.b("height", 2));
                f499a.put("url", a.C0012a.c("url", 3));
                f499a.put("width", a.C0012a.b("width", 4));
            }

            public C0016b() {
                this.f501c = 1;
                this.f500b = new HashSet();
            }

            C0016b(Set<Integer> set, int i, int i2, String str, int i3) {
                this.f500b = set;
                this.f501c = i;
                this.d = i2;
                this.e = str;
                this.f = i3;
            }

            /* access modifiers changed from: protected */
            @Override // b.c.b.a.b.b.b.a
            public final Object a(a.C0012a aVar) {
                int i;
                int L = aVar.L();
                if (L == 2) {
                    i = this.d;
                } else if (L == 3) {
                    return this.e;
                } else {
                    if (L == 4) {
                        i = this.f;
                    } else {
                        int L2 = aVar.L();
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unknown safe parcelable id=");
                        sb.append(L2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                return Integer.valueOf(i);
            }

            @Override // b.c.b.a.b.b.b.a
            public final /* synthetic */ Map a() {
                return f499a;
            }

            /* access modifiers changed from: protected */
            @Override // b.c.b.a.b.b.b.a
            public final boolean b(a.C0012a aVar) {
                return this.f500b.contains(Integer.valueOf(aVar.L()));
            }

            @Override // b.c.b.a.b.b.b.b
            public final boolean equals(Object obj) {
                if (!(obj instanceof C0016b)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C0016b bVar = (C0016b) obj;
                for (a.C0012a<?, ?> aVar : f499a.values()) {
                    if (b(aVar)) {
                        if (!bVar.b(aVar) || !a(aVar).equals(bVar.a(aVar))) {
                            return false;
                        }
                    } else if (bVar.b(aVar)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // b.c.b.a.b.b.b.b
            public final int hashCode() {
                int i = 0;
                for (a.C0012a<?, ?> aVar : f499a.values()) {
                    if (b(aVar)) {
                        i = i + aVar.L() + a(aVar).hashCode();
                    }
                }
                return i;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
                Set<Integer> set = this.f500b;
                if (set.contains(1)) {
                    com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f501c);
                }
                if (set.contains(2)) {
                    com.google.android.gms.common.internal.a.c.a(parcel, 2, this.d);
                }
                if (set.contains(3)) {
                    com.google.android.gms.common.internal.a.c.a(parcel, 3, this.e, true);
                }
                if (set.contains(4)) {
                    com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f);
                }
                com.google.android.gms.common.internal.a.c.a(parcel, a2);
            }
        }

        static {
            HashMap<String, a.C0012a<?, ?>> hashMap = new HashMap<>();
            f493a = hashMap;
            hashMap.put("coverInfo", a.C0012a.a("coverInfo", 2, a.class));
            f493a.put("coverPhoto", a.C0012a.a("coverPhoto", 3, C0016b.class));
            HashMap<String, a.C0012a<?, ?>> hashMap2 = f493a;
            b.c.b.a.b.b.a.a aVar = new b.c.b.a.b.b.a.a();
            aVar.a("banner", 0);
            hashMap2.put("layout", a.C0012a.a("layout", 4, aVar, false));
        }

        public b() {
            this.f495c = 1;
            this.f494b = new HashSet();
        }

        b(Set<Integer> set, int i, a aVar, C0016b bVar, int i2) {
            this.f494b = set;
            this.f495c = i;
            this.d = aVar;
            this.e = bVar;
            this.f = i2;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final Object a(a.C0012a aVar) {
            int L = aVar.L();
            if (L == 2) {
                return this.d;
            }
            if (L == 3) {
                return this.e;
            }
            if (L == 4) {
                return Integer.valueOf(this.f);
            }
            int L2 = aVar.L();
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(L2);
            throw new IllegalStateException(sb.toString());
        }

        @Override // b.c.b.a.b.b.b.a
        public final /* synthetic */ Map a() {
            return f493a;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final boolean b(a.C0012a aVar) {
            return this.f494b.contains(Integer.valueOf(aVar.L()));
        }

        @Override // b.c.b.a.b.b.b.b
        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            b bVar = (b) obj;
            for (a.C0012a<?, ?> aVar : f493a.values()) {
                if (b(aVar)) {
                    if (!bVar.b(aVar) || !a(aVar).equals(bVar.a(aVar))) {
                        return false;
                    }
                } else if (bVar.b(aVar)) {
                    return false;
                }
            }
            return true;
        }

        @Override // b.c.b.a.b.b.b.b
        public final int hashCode() {
            int i = 0;
            for (a.C0012a<?, ?> aVar : f493a.values()) {
                if (b(aVar)) {
                    i = i + aVar.L() + a(aVar).hashCode();
                }
            }
            return i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
            Set<Integer> set = this.f494b;
            if (set.contains(1)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f495c);
            }
            if (set.contains(2)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) this.d, i, true);
            }
            if (set.contains(3)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 3, (Parcelable) this.e, i, true);
            }
            if (set.contains(4)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f);
            }
            com.google.android.gms.common.internal.a.c.a(parcel, a2);
        }
    }

    public static final class c extends b.c.b.a.b.b.b.b implements a.c {
        public static final Parcelable.Creator<c> CREATOR = new n();

        /* renamed from: a  reason: collision with root package name */
        private static final HashMap<String, a.C0012a<?, ?>> f502a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Integer> f503b;

        /* renamed from: c  reason: collision with root package name */
        private final int f504c;
        private String d;

        static {
            HashMap<String, a.C0012a<?, ?>> hashMap = new HashMap<>();
            f502a = hashMap;
            hashMap.put("url", a.C0012a.c("url", 2));
        }

        public c() {
            this.f504c = 1;
            this.f503b = new HashSet();
        }

        c(Set<Integer> set, int i, String str) {
            this.f503b = set;
            this.f504c = i;
            this.d = str;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final Object a(a.C0012a aVar) {
            if (aVar.L() == 2) {
                return this.d;
            }
            int L = aVar.L();
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(L);
            throw new IllegalStateException(sb.toString());
        }

        @Override // b.c.b.a.b.b.b.a
        public final /* synthetic */ Map a() {
            return f502a;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final boolean b(a.C0012a aVar) {
            return this.f503b.contains(Integer.valueOf(aVar.L()));
        }

        @Override // b.c.b.a.b.b.b.b
        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            c cVar = (c) obj;
            for (a.C0012a<?, ?> aVar : f502a.values()) {
                if (b(aVar)) {
                    if (!cVar.b(aVar) || !a(aVar).equals(cVar.a(aVar))) {
                        return false;
                    }
                } else if (cVar.b(aVar)) {
                    return false;
                }
            }
            return true;
        }

        @Override // b.c.b.a.b.b.b.b
        public final int hashCode() {
            int i = 0;
            for (a.C0012a<?, ?> aVar : f502a.values()) {
                if (b(aVar)) {
                    i = i + aVar.L() + a(aVar).hashCode();
                }
            }
            return i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
            Set<Integer> set = this.f503b;
            if (set.contains(1)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f504c);
            }
            if (set.contains(2)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 2, this.d, true);
            }
            com.google.android.gms.common.internal.a.c.a(parcel, a2);
        }
    }

    public static final class d extends b.c.b.a.b.b.b.b implements a.d {
        public static final Parcelable.Creator<d> CREATOR = new o();

        /* renamed from: a  reason: collision with root package name */
        private static final HashMap<String, a.C0012a<?, ?>> f505a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Integer> f506b;

        /* renamed from: c  reason: collision with root package name */
        private final int f507c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;

        static {
            HashMap<String, a.C0012a<?, ?>> hashMap = new HashMap<>();
            f505a = hashMap;
            hashMap.put("familyName", a.C0012a.c("familyName", 2));
            f505a.put("formatted", a.C0012a.c("formatted", 3));
            f505a.put("givenName", a.C0012a.c("givenName", 4));
            f505a.put("honorificPrefix", a.C0012a.c("honorificPrefix", 5));
            f505a.put("honorificSuffix", a.C0012a.c("honorificSuffix", 6));
            f505a.put("middleName", a.C0012a.c("middleName", 7));
        }

        public d() {
            this.f507c = 1;
            this.f506b = new HashSet();
        }

        d(Set<Integer> set, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f506b = set;
            this.f507c = i2;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final Object a(a.C0012a aVar) {
            switch (aVar.L()) {
                case 2:
                    return this.d;
                case 3:
                    return this.e;
                case 4:
                    return this.f;
                case 5:
                    return this.g;
                case 6:
                    return this.h;
                case 7:
                    return this.i;
                default:
                    int L = aVar.L();
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(L);
                    throw new IllegalStateException(sb.toString());
            }
        }

        @Override // b.c.b.a.b.b.b.a
        public final /* synthetic */ Map a() {
            return f505a;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final boolean b(a.C0012a aVar) {
            return this.f506b.contains(Integer.valueOf(aVar.L()));
        }

        @Override // b.c.b.a.b.b.b.b
        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            d dVar = (d) obj;
            for (a.C0012a<?, ?> aVar : f505a.values()) {
                if (b(aVar)) {
                    if (!dVar.b(aVar) || !a(aVar).equals(dVar.a(aVar))) {
                        return false;
                    }
                } else if (dVar.b(aVar)) {
                    return false;
                }
            }
            return true;
        }

        @Override // b.c.b.a.b.b.b.b
        public final int hashCode() {
            int i2 = 0;
            for (a.C0012a<?, ?> aVar : f505a.values()) {
                if (b(aVar)) {
                    i2 = i2 + aVar.L() + a(aVar).hashCode();
                }
            }
            return i2;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
            Set<Integer> set = this.f506b;
            if (set.contains(1)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f507c);
            }
            if (set.contains(2)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 2, this.d, true);
            }
            if (set.contains(3)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 3, this.e, true);
            }
            if (set.contains(4)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f, true);
            }
            if (set.contains(5)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 5, this.g, true);
            }
            if (set.contains(6)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 6, this.h, true);
            }
            if (set.contains(7)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 7, this.i, true);
            }
            com.google.android.gms.common.internal.a.c.a(parcel, a2);
        }
    }

    public static final class e extends b.c.b.a.b.b.b.b implements a.e {
        public static final Parcelable.Creator<e> CREATOR = new p();

        /* renamed from: a  reason: collision with root package name */
        private static final HashMap<String, a.C0012a<?, ?>> f508a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Integer> f509b;

        /* renamed from: c  reason: collision with root package name */
        private final int f510c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private boolean i;
        private String j;
        private String k;
        private int l;

        static {
            HashMap<String, a.C0012a<?, ?>> hashMap = new HashMap<>();
            f508a = hashMap;
            hashMap.put("department", a.C0012a.c("department", 2));
            f508a.put("description", a.C0012a.c("description", 3));
            f508a.put("endDate", a.C0012a.c("endDate", 4));
            f508a.put("location", a.C0012a.c("location", 5));
            f508a.put("name", a.C0012a.c("name", 6));
            f508a.put("primary", a.C0012a.a("primary", 7));
            f508a.put("startDate", a.C0012a.c("startDate", 8));
            f508a.put("title", a.C0012a.c("title", 9));
            HashMap<String, a.C0012a<?, ?>> hashMap2 = f508a;
            b.c.b.a.b.b.a.a aVar = new b.c.b.a.b.b.a.a();
            aVar.a("work", 0);
            aVar.a("school", 1);
            hashMap2.put("type", a.C0012a.a("type", 10, aVar, false));
        }

        public e() {
            this.f510c = 1;
            this.f509b = new HashSet();
        }

        e(Set<Integer> set, int i2, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i3) {
            this.f509b = set;
            this.f510c = i2;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = z;
            this.j = str6;
            this.k = str7;
            this.l = i3;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final Object a(a.C0012a aVar) {
            switch (aVar.L()) {
                case 2:
                    return this.d;
                case 3:
                    return this.e;
                case 4:
                    return this.f;
                case 5:
                    return this.g;
                case 6:
                    return this.h;
                case 7:
                    return Boolean.valueOf(this.i);
                case 8:
                    return this.j;
                case 9:
                    return this.k;
                case 10:
                    return Integer.valueOf(this.l);
                default:
                    int L = aVar.L();
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(L);
                    throw new IllegalStateException(sb.toString());
            }
        }

        @Override // b.c.b.a.b.b.b.a
        public final /* synthetic */ Map a() {
            return f508a;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final boolean b(a.C0012a aVar) {
            return this.f509b.contains(Integer.valueOf(aVar.L()));
        }

        @Override // b.c.b.a.b.b.b.b
        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            e eVar = (e) obj;
            for (a.C0012a<?, ?> aVar : f508a.values()) {
                if (b(aVar)) {
                    if (!eVar.b(aVar) || !a(aVar).equals(eVar.a(aVar))) {
                        return false;
                    }
                } else if (eVar.b(aVar)) {
                    return false;
                }
            }
            return true;
        }

        @Override // b.c.b.a.b.b.b.b
        public final int hashCode() {
            int i2 = 0;
            for (a.C0012a<?, ?> aVar : f508a.values()) {
                if (b(aVar)) {
                    i2 = i2 + aVar.L() + a(aVar).hashCode();
                }
            }
            return i2;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
            Set<Integer> set = this.f509b;
            if (set.contains(1)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f510c);
            }
            if (set.contains(2)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 2, this.d, true);
            }
            if (set.contains(3)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 3, this.e, true);
            }
            if (set.contains(4)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f, true);
            }
            if (set.contains(5)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 5, this.g, true);
            }
            if (set.contains(6)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 6, this.h, true);
            }
            if (set.contains(7)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 7, this.i);
            }
            if (set.contains(8)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 8, this.j, true);
            }
            if (set.contains(9)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 9, this.k, true);
            }
            if (set.contains(10)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 10, this.l);
            }
            com.google.android.gms.common.internal.a.c.a(parcel, a2);
        }
    }

    public static final class f extends b.c.b.a.b.b.b.b implements a.f {
        public static final Parcelable.Creator<f> CREATOR = new b();

        /* renamed from: a  reason: collision with root package name */
        private static final HashMap<String, a.C0012a<?, ?>> f511a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Integer> f512b;

        /* renamed from: c  reason: collision with root package name */
        private final int f513c;
        private boolean d;
        private String e;

        static {
            HashMap<String, a.C0012a<?, ?>> hashMap = new HashMap<>();
            f511a = hashMap;
            hashMap.put("primary", a.C0012a.a("primary", 2));
            f511a.put("value", a.C0012a.c("value", 3));
        }

        public f() {
            this.f513c = 1;
            this.f512b = new HashSet();
        }

        f(Set<Integer> set, int i, boolean z, String str) {
            this.f512b = set;
            this.f513c = i;
            this.d = z;
            this.e = str;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final Object a(a.C0012a aVar) {
            int L = aVar.L();
            if (L == 2) {
                return Boolean.valueOf(this.d);
            }
            if (L == 3) {
                return this.e;
            }
            int L2 = aVar.L();
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(L2);
            throw new IllegalStateException(sb.toString());
        }

        @Override // b.c.b.a.b.b.b.a
        public final /* synthetic */ Map a() {
            return f511a;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final boolean b(a.C0012a aVar) {
            return this.f512b.contains(Integer.valueOf(aVar.L()));
        }

        @Override // b.c.b.a.b.b.b.b
        public final boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            f fVar = (f) obj;
            for (a.C0012a<?, ?> aVar : f511a.values()) {
                if (b(aVar)) {
                    if (!fVar.b(aVar) || !a(aVar).equals(fVar.a(aVar))) {
                        return false;
                    }
                } else if (fVar.b(aVar)) {
                    return false;
                }
            }
            return true;
        }

        @Override // b.c.b.a.b.b.b.b
        public final int hashCode() {
            int i = 0;
            for (a.C0012a<?, ?> aVar : f511a.values()) {
                if (b(aVar)) {
                    i = i + aVar.L() + a(aVar).hashCode();
                }
            }
            return i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
            Set<Integer> set = this.f512b;
            if (set.contains(1)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f513c);
            }
            if (set.contains(2)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 2, this.d);
            }
            if (set.contains(3)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 3, this.e, true);
            }
            com.google.android.gms.common.internal.a.c.a(parcel, a2);
        }
    }

    public static final class g extends b.c.b.a.b.b.b.b implements a.g {
        public static final Parcelable.Creator<g> CREATOR = new c();

        /* renamed from: a  reason: collision with root package name */
        private static final HashMap<String, a.C0012a<?, ?>> f514a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Integer> f515b;

        /* renamed from: c  reason: collision with root package name */
        private final int f516c;
        private String d;
        private final int e;
        private int f;
        private String g;

        static {
            HashMap<String, a.C0012a<?, ?>> hashMap = new HashMap<>();
            f514a = hashMap;
            hashMap.put("label", a.C0012a.c("label", 5));
            HashMap<String, a.C0012a<?, ?>> hashMap2 = f514a;
            b.c.b.a.b.b.a.a aVar = new b.c.b.a.b.b.a.a();
            aVar.a("home", 0);
            aVar.a("work", 1);
            aVar.a("blog", 2);
            aVar.a("profile", 3);
            aVar.a("other", 4);
            aVar.a("otherProfile", 5);
            aVar.a("contributor", 6);
            aVar.a("website", 7);
            hashMap2.put("type", a.C0012a.a("type", 6, aVar, false));
            f514a.put("value", a.C0012a.c("value", 4));
        }

        public g() {
            this.e = 4;
            this.f516c = 1;
            this.f515b = new HashSet();
        }

        g(Set<Integer> set, int i, String str, int i2, String str2, int i3) {
            this.e = 4;
            this.f515b = set;
            this.f516c = i;
            this.d = str;
            this.f = i2;
            this.g = str2;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final Object a(a.C0012a aVar) {
            int L = aVar.L();
            if (L == 4) {
                return this.g;
            }
            if (L == 5) {
                return this.d;
            }
            if (L == 6) {
                return Integer.valueOf(this.f);
            }
            int L2 = aVar.L();
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(L2);
            throw new IllegalStateException(sb.toString());
        }

        @Override // b.c.b.a.b.b.b.a
        public final /* synthetic */ Map a() {
            return f514a;
        }

        /* access modifiers changed from: protected */
        @Override // b.c.b.a.b.b.b.a
        public final boolean b(a.C0012a aVar) {
            return this.f515b.contains(Integer.valueOf(aVar.L()));
        }

        @Override // b.c.b.a.b.b.b.b
        public final boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            g gVar = (g) obj;
            for (a.C0012a<?, ?> aVar : f514a.values()) {
                if (b(aVar)) {
                    if (!gVar.b(aVar) || !a(aVar).equals(gVar.a(aVar))) {
                        return false;
                    }
                } else if (gVar.b(aVar)) {
                    return false;
                }
            }
            return true;
        }

        @Override // b.c.b.a.b.b.b.b
        public final int hashCode() {
            int i = 0;
            for (a.C0012a<?, ?> aVar : f514a.values()) {
                if (b(aVar)) {
                    i = i + aVar.L() + a(aVar).hashCode();
                }
            }
            return i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
            Set<Integer> set = this.f515b;
            if (set.contains(1)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f516c);
            }
            if (set.contains(3)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 3, 4);
            }
            if (set.contains(4)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 4, this.g, true);
            }
            if (set.contains(5)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 5, this.d, true);
            }
            if (set.contains(6)) {
                com.google.android.gms.common.internal.a.c.a(parcel, 6, this.f);
            }
            com.google.android.gms.common.internal.a.c.a(parcel, a2);
        }
    }

    static {
        HashMap<String, a.C0012a<?, ?>> hashMap = new HashMap<>();
        f487a = hashMap;
        hashMap.put("aboutMe", a.C0012a.c("aboutMe", 2));
        f487a.put("ageRange", a.C0012a.a("ageRange", 3, a.class));
        f487a.put("birthday", a.C0012a.c("birthday", 4));
        f487a.put("braggingRights", a.C0012a.c("braggingRights", 5));
        f487a.put("circledByCount", a.C0012a.b("circledByCount", 6));
        f487a.put("cover", a.C0012a.a("cover", 7, b.class));
        f487a.put("currentLocation", a.C0012a.c("currentLocation", 8));
        f487a.put("displayName", a.C0012a.c("displayName", 9));
        HashMap<String, a.C0012a<?, ?>> hashMap2 = f487a;
        b.c.b.a.b.b.a.a aVar = new b.c.b.a.b.b.a.a();
        aVar.a("male", 0);
        aVar.a("female", 1);
        aVar.a("other", 2);
        hashMap2.put("gender", a.C0012a.a("gender", 12, aVar, false));
        f487a.put("id", a.C0012a.c("id", 14));
        f487a.put("image", a.C0012a.a("image", 15, c.class));
        f487a.put("isPlusUser", a.C0012a.a("isPlusUser", 16));
        f487a.put("language", a.C0012a.c("language", 18));
        f487a.put("name", a.C0012a.a("name", 19, d.class));
        f487a.put("nickname", a.C0012a.c("nickname", 20));
        HashMap<String, a.C0012a<?, ?>> hashMap3 = f487a;
        b.c.b.a.b.b.a.a aVar2 = new b.c.b.a.b.b.a.a();
        aVar2.a("person", 0);
        aVar2.a("page", 1);
        hashMap3.put("objectType", a.C0012a.a("objectType", 21, aVar2, false));
        f487a.put("organizations", a.C0012a.b("organizations", 22, e.class));
        f487a.put("placesLived", a.C0012a.b("placesLived", 23, f.class));
        f487a.put("plusOneCount", a.C0012a.b("plusOneCount", 24));
        HashMap<String, a.C0012a<?, ?>> hashMap4 = f487a;
        b.c.b.a.b.b.a.a aVar3 = new b.c.b.a.b.b.a.a();
        aVar3.a("single", 0);
        aVar3.a("in_a_relationship", 1);
        aVar3.a("engaged", 2);
        aVar3.a("married", 3);
        aVar3.a("its_complicated", 4);
        aVar3.a("open_relationship", 5);
        aVar3.a("widowed", 6);
        aVar3.a("in_domestic_partnership", 7);
        aVar3.a("in_civil_union", 8);
        hashMap4.put("relationshipStatus", a.C0012a.a("relationshipStatus", 25, aVar3, false));
        f487a.put("tagline", a.C0012a.c("tagline", 26));
        f487a.put("url", a.C0012a.c("url", 27));
        f487a.put("urls", a.C0012a.b("urls", 28, g.class));
        f487a.put("verified", a.C0012a.a("verified", 29));
    }

    public h() {
        this.f489c = 1;
        this.f488b = new HashSet();
    }

    h(Set<Integer> set, int i2, String str, a aVar, String str2, String str3, int i3, b bVar, String str4, String str5, int i4, String str6, c cVar, boolean z2, String str7, d dVar, String str8, int i5, List<e> list, List<f> list2, int i6, int i7, String str9, String str10, List<g> list3, boolean z3) {
        this.f488b = set;
        this.f489c = i2;
        this.d = str;
        this.e = aVar;
        this.f = str2;
        this.g = str3;
        this.h = i3;
        this.i = bVar;
        this.j = str4;
        this.k = str5;
        this.l = i4;
        this.m = str6;
        this.n = cVar;
        this.o = z2;
        this.p = str7;
        this.q = dVar;
        this.r = str8;
        this.s = i5;
        this.t = list;
        this.u = list2;
        this.v = i6;
        this.w = i7;
        this.x = str9;
        this.y = str10;
        this.z = list3;
        this.A = z3;
    }

    public static h a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        h createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.b.b.b.a
    public final Object a(a.C0012a aVar) {
        switch (aVar.L()) {
            case 2:
                return this.d;
            case 3:
                return this.e;
            case 4:
                return this.f;
            case 5:
                return this.g;
            case 6:
                return Integer.valueOf(this.h);
            case 7:
                return this.i;
            case 8:
                return this.j;
            case 9:
                return this.k;
            case 10:
            case 11:
            case 13:
            case 17:
            default:
                int L = aVar.L();
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(L);
                throw new IllegalStateException(sb.toString());
            case 12:
                return Integer.valueOf(this.l);
            case 14:
                return this.m;
            case 15:
                return this.n;
            case 16:
                return Boolean.valueOf(this.o);
            case 18:
                return this.p;
            case 19:
                return this.q;
            case 20:
                return this.r;
            case 21:
                return Integer.valueOf(this.s);
            case 22:
                return this.t;
            case 23:
                return this.u;
            case 24:
                return Integer.valueOf(this.v);
            case 25:
                return Integer.valueOf(this.w);
            case 26:
                return this.x;
            case 27:
                return this.y;
            case 28:
                return this.z;
            case 29:
                return Boolean.valueOf(this.A);
        }
    }

    @Override // b.c.b.a.b.b.b.a
    public final /* synthetic */ Map a() {
        return f487a;
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.b.b.b.a
    public final boolean b(a.C0012a aVar) {
        return this.f488b.contains(Integer.valueOf(aVar.L()));
    }

    @Override // b.c.b.a.b.b.b.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h hVar = (h) obj;
        for (a.C0012a<?, ?> aVar : f487a.values()) {
            if (b(aVar)) {
                if (!hVar.b(aVar) || !a(aVar).equals(hVar.a(aVar))) {
                    return false;
                }
            } else if (hVar.b(aVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // b.c.b.a.b.b.b.b
    public final int hashCode() {
        int i2 = 0;
        for (a.C0012a<?, ?> aVar : f487a.values()) {
            if (b(aVar)) {
                i2 = i2 + aVar.L() + a(aVar).hashCode();
            }
        }
        return i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
        Set<Integer> set = this.f488b;
        if (set.contains(1)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f489c);
        }
        if (set.contains(2)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 2, this.d, true);
        }
        if (set.contains(3)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 3, (Parcelable) this.e, i2, true);
        }
        if (set.contains(4)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f, true);
        }
        if (set.contains(5)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 5, this.g, true);
        }
        if (set.contains(6)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 6, this.h);
        }
        if (set.contains(7)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 7, (Parcelable) this.i, i2, true);
        }
        if (set.contains(8)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 8, this.j, true);
        }
        if (set.contains(9)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 9, this.k, true);
        }
        if (set.contains(12)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 12, this.l);
        }
        if (set.contains(14)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 14, this.m, true);
        }
        if (set.contains(15)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 15, (Parcelable) this.n, i2, true);
        }
        if (set.contains(16)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 16, this.o);
        }
        if (set.contains(18)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 18, this.p, true);
        }
        if (set.contains(19)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 19, (Parcelable) this.q, i2, true);
        }
        if (set.contains(20)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 20, this.r, true);
        }
        if (set.contains(21)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 21, this.s);
        }
        if (set.contains(22)) {
            com.google.android.gms.common.internal.a.c.c(parcel, 22, this.t, true);
        }
        if (set.contains(23)) {
            com.google.android.gms.common.internal.a.c.c(parcel, 23, this.u, true);
        }
        if (set.contains(24)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 24, this.v);
        }
        if (set.contains(25)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 25, this.w);
        }
        if (set.contains(26)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 26, this.x, true);
        }
        if (set.contains(27)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 27, this.y, true);
        }
        if (set.contains(28)) {
            com.google.android.gms.common.internal.a.c.c(parcel, 28, this.z, true);
        }
        if (set.contains(29)) {
            com.google.android.gms.common.internal.a.c.a(parcel, 29, this.A);
        }
        com.google.android.gms.common.internal.a.c.a(parcel, a2);
    }
}
