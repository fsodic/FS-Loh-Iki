package com.google.android.gms.games;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import b.c.b.a.d.e.f;
import b.c.b.a.d.e.g;
import b.c.b.a.d.e.h;
import b.c.b.a.d.e.i;
import b.c.b.a.d.e.j;
import b.c.b.a.d.e.k;
import b.c.b.a.d.e.m;
import b.c.b.a.d.e.n;
import b.c.b.a.d.e.o;
import b.c.b.a.d.e.p;
import b.c.b.a.d.e.q;
import b.c.b.a.d.e.y;
import b.c.b.a.d.e.z;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC0140c;
import com.google.android.gms.common.internal.C0177c;
import com.google.android.gms.games.internal.r;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final a.g<r> f1433a = new a.g<>();

    /* renamed from: b  reason: collision with root package name */
    private static final a.AbstractC0025a<r, a> f1434b = new o();

    /* renamed from: c  reason: collision with root package name */
    private static final a.AbstractC0025a<r, a> f1435c = new p();
    public static final Scope d = new Scope("https://www.googleapis.com/auth/games");
    public static final Scope e = new Scope("https://www.googleapis.com/auth/games_lite");
    @Deprecated
    public static final com.google.android.gms.common.api.a<a> f = new com.google.android.gms.common.api.a<>("Games.API", f1434b, f1433a);
    public static final Scope g = new Scope("https://www.googleapis.com/auth/games.firstparty");
    private static final com.google.android.gms.common.api.a<a> h = new com.google.android.gms.common.api.a<>("Games.API_1P", f1435c, f1433a);
    @Deprecated
    public static final d i = new b.c.b.a.d.e.b();
    @Deprecated
    public static final com.google.android.gms.games.a.a j = new q();
    private static final com.google.android.gms.games.b.a k = new y();
    @Deprecated
    public static final com.google.android.gms.games.c.a l = new z();
    @Deprecated
    public static final com.google.android.gms.games.d.a m = new b.c.b.a.d.e.d();
    @Deprecated
    public static final com.google.android.gms.games.e.b n = new b.c.b.a.d.e.c();
    @Deprecated
    public static final com.google.android.gms.games.e.b.b o = new o();
    @Deprecated
    public static final com.google.android.gms.games.e.a.b p = new j();
    private static final com.google.android.gms.games.e.c q = new f();
    @Deprecated
    public static final j r = new h();
    @Deprecated
    public static final f s = new g();
    @Deprecated
    public static final com.google.android.gms.games.f.a t = new i();
    @Deprecated
    public static final com.google.android.gms.games.g.b u = new k();
    @Deprecated
    public static final com.google.android.gms.games.h.a v = new m();
    @Deprecated
    public static final com.google.android.gms.games.i.a w = new n();
    @Deprecated
    public static final com.google.android.gms.games.j.b x = new p();

    public static final class a implements com.google.android.gms.auth.api.signin.a, a.d.b, a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f1436a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f1437b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1438c;
        public final boolean d;
        public final int e;
        public final String f;
        public final ArrayList<String> g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final GoogleSignInAccount k;
        public final String l;

        /* renamed from: com.google.android.gms.games.b$a$a  reason: collision with other inner class name */
        public static final class C0032a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f1439a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f1440b;

            /* renamed from: c  reason: collision with root package name */
            private int f1441c;
            private boolean d;
            private int e;
            private String f;
            private ArrayList<String> g;
            private boolean h;
            private boolean i;
            private boolean j;
            GoogleSignInAccount k;
            private String l;

            private C0032a() {
                this.f1439a = false;
                this.f1440b = true;
                this.f1441c = 17;
                this.d = false;
                this.e = 4368;
                this.f = null;
                this.g = new ArrayList<>();
                this.h = false;
                this.i = false;
                this.j = false;
                this.k = null;
                this.l = null;
            }

            /* synthetic */ C0032a(o oVar) {
                this();
            }

            public final a a() {
                return new a(this.f1439a, this.f1440b, this.f1441c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
            }
        }

        private a(boolean z, boolean z2, int i2, boolean z3, int i3, String str, ArrayList<String> arrayList, boolean z4, boolean z5, boolean z6, GoogleSignInAccount googleSignInAccount, String str2) {
            this.f1436a = z;
            this.f1437b = z2;
            this.f1438c = i2;
            this.d = z3;
            this.e = i3;
            this.f = str;
            this.g = arrayList;
            this.h = z4;
            this.i = z5;
            this.j = z6;
            this.k = googleSignInAccount;
            this.l = str2;
        }

        /* synthetic */ a(boolean z, boolean z2, int i2, boolean z3, int i3, String str, ArrayList arrayList, boolean z4, boolean z5, boolean z6, GoogleSignInAccount googleSignInAccount, String str2, o oVar) {
            this(z, z2, i2, z3, i3, str, arrayList, z4, z5, z6, googleSignInAccount, str2);
        }

        public static C0032a b() {
            return new C0032a(null);
        }

        @Override // com.google.android.gms.common.api.a.d.b
        public final GoogleSignInAccount a() {
            return this.k;
        }

        public final Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.f1436a);
            bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", this.f1437b);
            bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", this.f1438c);
            bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", this.d);
            bundle.putInt("com.google.android.gms.games.key.sdkVariant", this.e);
            bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", this.f);
            bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.g);
            bundle.putBoolean("com.google.android.gms.games.key.requireGooglePlus", this.h);
            bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", this.i);
            bundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", this.j);
            bundle.putParcelable("com.google.android.gms.games.key.googleSignInAccount", this.k);
            bundle.putString("com.google.android.gms.games.key.realClientPackageName", this.l);
            return bundle;
        }

        public final boolean equals(Object obj) {
            String str;
            GoogleSignInAccount googleSignInAccount;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1436a == aVar.f1436a && this.f1437b == aVar.f1437b && this.f1438c == aVar.f1438c && this.d == aVar.d && this.e == aVar.e && ((str = this.f) != null ? str.equals(aVar.f) : aVar.f == null) && this.g.equals(aVar.g) && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && ((googleSignInAccount = this.k) != null ? googleSignInAccount.equals(aVar.k) : aVar.k == null) && TextUtils.equals(this.l, aVar.l);
        }

        public final int hashCode() {
            int i2 = ((((((((((this.f1436a ? 1 : 0) + 527) * 31) + (this.f1437b ? 1 : 0)) * 31) + this.f1438c) * 31) + (this.d ? 1 : 0)) * 31) + this.e) * 31;
            String str = this.f;
            int i3 = 0;
            int hashCode = (((((((((i2 + (str == null ? 0 : str.hashCode())) * 31) + this.g.hashCode()) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
            GoogleSignInAccount googleSignInAccount = this.k;
            int hashCode2 = (hashCode + (googleSignInAccount == null ? 0 : googleSignInAccount.hashCode())) * 31;
            String str2 = this.l;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            return hashCode2 + i3;
        }
    }

    /* renamed from: com.google.android.gms.games.b$b  reason: collision with other inner class name */
    public static abstract class AbstractC0033b<T extends com.google.android.gms.common.api.i> extends AbstractC0140c<T, r> {
        public AbstractC0033b(com.google.android.gms.common.api.f fVar) {
            super(b.f1433a, fVar);
        }
    }

    /* access modifiers changed from: private */
    public static abstract class c extends a.AbstractC0025a<r, a> {
        private c() {
        }

        /* synthetic */ c(o oVar) {
            this();
        }

        @Override // com.google.android.gms.common.api.a.e
        public int a() {
            return 1;
        }

        /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.c, java.lang.Object, com.google.android.gms.common.api.f$b, com.google.android.gms.common.api.f$c] */
        @Override // com.google.android.gms.common.api.a.AbstractC0025a
        public /* synthetic */ r a(Context context, Looper looper, C0177c cVar, a aVar, f.b bVar, f.c cVar2) {
            a aVar2 = aVar;
            if (aVar2 == null) {
                aVar2 = new a.C0032a(null).a();
            }
            return new r(context, looper, cVar, aVar2, bVar, cVar2);
        }
    }

    /* access modifiers changed from: private */
    public static abstract class d extends AbstractC0033b<Status> {
        private d(com.google.android.gms.common.api.f fVar) {
            super(fVar);
        }

        /* synthetic */ d(com.google.android.gms.common.api.f fVar, o oVar) {
            this(fVar);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public /* synthetic */ com.google.android.gms.common.api.i b(Status status) {
            return status;
        }
    }

    @Deprecated
    public static com.google.android.gms.common.api.g<Status> a(com.google.android.gms.common.api.f fVar) {
        return fVar.a(new q(fVar));
    }

    public static r a(com.google.android.gms.common.api.f fVar, boolean z) {
        com.google.android.gms.common.internal.r.a(fVar != null, "GoogleApiClient parameter is required.");
        com.google.android.gms.common.internal.r.b(fVar.d(), "GoogleApiClient must be connected.");
        return b(fVar, z);
    }

    public static r b(com.google.android.gms.common.api.f fVar) {
        return a(fVar, true);
    }

    public static r b(com.google.android.gms.common.api.f fVar, boolean z) {
        com.google.android.gms.common.internal.r.b(fVar.a(f), "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean b2 = fVar.b(f);
        if (z && !b2) {
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        } else if (b2) {
            return (r) fVar.a(f1433a);
        } else {
            return null;
        }
    }
}
