package b.c.b.a.g.a;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import b.c.b.a.b.j;
import b.c.b.a.g.e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0176b;
import com.google.android.gms.common.internal.AbstractC0181g;
import com.google.android.gms.common.internal.AbstractC0186l;
import com.google.android.gms.common.internal.C0177c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s;

public class a extends AbstractC0181g<g> implements e {
    private final boolean G;
    private final C0177c H;
    private final Bundle I;
    private Integer J;

    private a(Context context, Looper looper, boolean z, C0177c cVar, Bundle bundle, f.b bVar, f.c cVar2) {
        super(context, looper, 44, cVar, bVar, cVar2);
        this.G = true;
        this.H = cVar;
        this.I = bundle;
        this.J = cVar.d();
    }

    public a(Context context, Looper looper, boolean z, C0177c cVar, b.c.b.a.g.a aVar, f.b bVar, f.c cVar2) {
        this(context, looper, true, cVar, a(cVar), bVar, cVar2);
    }

    public static Bundle a(C0177c cVar) {
        b.c.b.a.g.a j = cVar.j();
        Integer d = cVar.d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.a());
        if (d != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", d.intValue());
        }
        if (j != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", j.g());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", j.f());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", j.d());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", j.e());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", j.b());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", j.h());
            if (j.a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", j.a().longValue());
            }
            if (j.c() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", j.c().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new h(iBinder);
    }

    @Override // b.c.b.a.g.e
    public final void a(e eVar) {
        r.a(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b2 = this.H.b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b2.name)) {
                googleSignInAccount = com.google.android.gms.auth.api.signin.a.a.a(q()).a();
            }
            ((g) u()).a(new i(new s(b2, this.J.intValue(), googleSignInAccount)), eVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.a(new k(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // b.c.b.a.g.e
    public final void a(AbstractC0186l lVar, boolean z) {
        try {
            ((g) u()).a(lVar, this.J.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // b.c.b.a.g.e
    public final void connect() {
        a(new AbstractC0176b.d());
    }

    @Override // b.c.b.a.g.e
    public final void e() {
        try {
            ((g) u()).k(this.J.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0181g, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.AbstractC0176b
    public int g() {
        return j.f305a;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.AbstractC0176b
    public boolean j() {
        return this.G;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public Bundle r() {
        if (!q().getPackageName().equals(this.H.h())) {
            this.I.putString("com.google.android.gms.signin.internal.realClientPackageName", this.H.h());
        }
        return this.I;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public String v() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public String w() {
        return "com.google.android.gms.signin.service.START";
    }
}
