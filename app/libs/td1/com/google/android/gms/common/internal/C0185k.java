package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import b.c.b.a.b.f;
import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.common.internal.k  reason: case insensitive filesystem */
public class C0185k {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f1377a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private f f1378b;

    public C0185k(f fVar) {
        r.a(fVar);
        this.f1378b = fVar;
    }

    public int a(Context context, a.f fVar) {
        r.a(context);
        r.a(fVar);
        if (!fVar.f()) {
            return 0;
        }
        int g = fVar.g();
        int i = this.f1377a.get(g, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 < this.f1377a.size()) {
                int keyAt = this.f1377a.keyAt(i2);
                if (keyAt > g && this.f1377a.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i == -1) {
            i = this.f1378b.a(context, g);
        }
        this.f1377a.put(g, i);
        return i;
    }

    public void a() {
        this.f1377a.clear();
    }
}
