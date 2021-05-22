package b.c.b.a.f;

import android.content.Context;
import android.os.Looper;
import b.c.b.a.f.c;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C0177c;
import com.google.android.gms.common.util.q;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.c;
import com.google.android.gms.plus.internal.e;

final class f extends a.AbstractC0025a<c, c.a> {
    f() {
    }

    @Override // com.google.android.gms.common.api.a.e
    public final int a() {
        return 2;
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.c, java.lang.Object, com.google.android.gms.common.api.f$b, com.google.android.gms.common.api.f$c] */
    @Override // com.google.android.gms.common.api.a.AbstractC0025a
    public final /* synthetic */ com.google.android.gms.plus.internal.c a(Context context, Looper looper, C0177c cVar, c.a aVar, f.b bVar, f.c cVar2) {
        c.a aVar2 = aVar;
        if (aVar2 == null) {
            aVar2 = new c.a(null);
        }
        return new com.google.android.gms.plus.internal.c(context, looper, cVar, new e(cVar.b().name, q.a(cVar.c()), (String[]) aVar2.f522b.toArray(new String[0]), new String[0], context.getPackageName(), context.getPackageName(), null, new PlusCommonExtras()), bVar, cVar2);
    }
}
