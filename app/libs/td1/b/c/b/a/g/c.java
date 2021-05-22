package b.c.b.a.g;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C0177c;

final class c extends a.AbstractC0025a<b.c.b.a.g.a.a, a> {
    c() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.c, java.lang.Object, com.google.android.gms.common.api.f$b, com.google.android.gms.common.api.f$c] */
    @Override // com.google.android.gms.common.api.a.AbstractC0025a
    public final /* synthetic */ b.c.b.a.g.a.a a(Context context, Looper looper, C0177c cVar, a aVar, f.b bVar, f.c cVar2) {
        a aVar2 = aVar;
        if (aVar2 == null) {
            aVar2 = a.f523a;
        }
        return new b.c.b.a.g.a.a(context, looper, true, cVar, aVar2, bVar, cVar2);
    }
}
