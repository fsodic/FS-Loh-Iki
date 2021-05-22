package b.c.b.a.d.e;

import android.content.Intent;
import com.google.android.gms.common.api.f;
import com.google.android.gms.games.a.a;
import com.google.android.gms.games.b;

public final class q implements a {
    @Override // com.google.android.gms.games.a.a
    public final Intent a(f fVar) {
        return b.b(fVar).C();
    }

    @Override // com.google.android.gms.games.a.a
    public final void a(f fVar, String str) {
        fVar.a(new u(this, str, fVar, str));
    }

    @Override // com.google.android.gms.games.a.a
    public final void a(f fVar, String str, int i) {
        fVar.a(new v(this, str, fVar, str, i));
    }
}
