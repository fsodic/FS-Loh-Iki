package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Fc  reason: case insensitive filesystem */
public final class C0320Fc implements AbstractC0268Dc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1970a;

    public C0320Fc(Context context) {
        this.f1970a = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        if (q.A().a(this.f1970a)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        c2 = 1;
                    }
                } else if (str.equals("_ac")) {
                    c2 = 0;
                }
            } else if (str.equals("_aa")) {
                c2 = 2;
            }
            if (c2 == 0) {
                q.A().d(this.f1970a, str2);
            } else if (c2 == 1) {
                q.A().e(this.f1970a, str2);
            } else if (c2 != 2) {
                C0745Vl.b("logScionEvent gmsg contained unsupported eventName");
            } else {
                q.A().g(this.f1970a, str2);
            }
        }
    }
}
