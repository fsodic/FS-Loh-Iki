package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class b implements DynamiteModule.b {
    b() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0030b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0030b bVar = new DynamiteModule.b.C0030b();
        bVar.f1422b = aVar.a(context, str, true);
        if (bVar.f1422b != 0) {
            bVar.f1423c = 1;
        } else {
            bVar.f1421a = aVar.a(context, str);
            if (bVar.f1421a != 0) {
                bVar.f1423c = -1;
            }
        }
        return bVar;
    }
}
