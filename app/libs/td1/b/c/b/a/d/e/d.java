package b.c.b.a.d.e;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC0142d;
import com.google.android.gms.games.b;
import com.google.android.gms.games.d.a;
import com.google.android.gms.games.internal.e;
import com.google.android.gms.games.internal.r;

public final class d implements a {
    @Override // com.google.android.gms.games.d.a
    public final Intent a(f fVar) {
        return b.b(fVar).B();
    }

    @Override // com.google.android.gms.games.d.a
    public final void a(f fVar, String str, long j) {
        a(fVar, str, j, null);
    }

    public final void a(f fVar, String str, long j, String str2) {
        r a2 = b.a(fVar, false);
        if (a2 != null) {
            try {
                a2.a((AbstractC0142d<a.AbstractC0034a>) null, str, j, str2);
            } catch (RemoteException unused) {
                e.b("LeaderboardsImpl", "service died");
            }
        }
    }
}
