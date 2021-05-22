package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0030b a(Context context, String str, DynamiteModule.b.a aVar) {
        int i;
        DynamiteModule.b.C0030b bVar = new DynamiteModule.b.C0030b();
        bVar.f1421a = aVar.a(context, str);
        bVar.f1422b = aVar.a(context, str, true);
        if (bVar.f1421a == 0 && bVar.f1422b == 0) {
            i = 0;
        } else if (bVar.f1422b >= bVar.f1421a) {
            bVar.f1423c = 1;
            return bVar;
        } else {
            i = -1;
        }
        bVar.f1423c = i;
        return bVar;
    }
}
