package b.c.b.a.d.e;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.games.a.a;
import com.google.android.gms.games.b;

/* access modifiers changed from: package-private */
public abstract class w extends b.AbstractC0033b<a.AbstractC0031a> {
    private final String s;

    public w(String str, f fVar) {
        super(fVar);
        this.s = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ i b(Status status) {
        return new x(this, status);
    }
}
