package b.c.b.a.f;

import b.c.b.a.d.g.d;
import b.c.b.a.d.g.e;
import b.c.b.a.d.g.f;
import b.c.b.a.d.g.g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.r;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a.g<com.google.android.gms.plus.internal.c> f518a = new a.g<>();

    /* renamed from: b  reason: collision with root package name */
    private static final a.AbstractC0025a<com.google.android.gms.plus.internal.c, a> f519b = new f();
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<a> f520c = new com.google.android.gms.common.api.a<>("Plus.API", f519b, f518a);
    @Deprecated
    public static final Scope d = new Scope("https://www.googleapis.com/auth/plus.login");
    @Deprecated
    public static final Scope e = new Scope("https://www.googleapis.com/auth/plus.me");
    @Deprecated
    public static final b f = new g();
    @Deprecated
    public static final a g = new d();
    @Deprecated
    private static final e h = new f();
    private static final d i = new e();

    @Deprecated
    public static final class a implements a.d.f {

        /* renamed from: a  reason: collision with root package name */
        private final String f521a;

        /* renamed from: b  reason: collision with root package name */
        final Set<String> f522b;

        private a() {
            this.f521a = null;
            this.f522b = new HashSet();
        }

        /* synthetic */ a(f fVar) {
            this();
        }
    }

    public static com.google.android.gms.plus.internal.c a(com.google.android.gms.common.api.f fVar, boolean z) {
        r.a(fVar != null, "GoogleApiClient parameter is required.");
        r.b(fVar.d(), "GoogleApiClient must be connected.");
        r.b(fVar.a(f520c), "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean b2 = fVar.b(f520c);
        if (z && !b2) {
            throw new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
        } else if (b2) {
            return (com.google.android.gms.plus.internal.c) fVar.a(f518a);
        } else {
            return null;
        }
    }
}
