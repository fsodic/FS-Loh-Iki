package com.google.android.gms.common.api;

import a.c.b;
import android.text.TextUtils;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.za;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;

public class c extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final b<za<?>, b.c.b.a.b.b> f1182a;

    public c(b<za<?>, b.c.b.a.b.b> bVar) {
        this.f1182a = bVar;
    }

    public final b<za<?>, b.c.b.a.b.b> a() {
        return this.f1182a;
    }

    public b.c.b.a.b.b a(e<? extends a.d> eVar) {
        za<? extends a.d> e = eVar.e();
        r.a(this.f1182a.get(e) != null, "The given API was not part of the availability request.");
        return this.f1182a.get(e);
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (za<?> zaVar : this.f1182a.keySet()) {
            b.c.b.a.b.b bVar = this.f1182a.get(zaVar);
            if (bVar.P()) {
                z = false;
            }
            String a2 = zaVar.a();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a2);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
