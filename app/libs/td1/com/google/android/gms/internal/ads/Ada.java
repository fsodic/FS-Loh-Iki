package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class Ada extends Bda<FieldDescriptorType, Object> {
    Ada(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.Bda
    public final void b() {
        if (!a()) {
            if (c() <= 0) {
                Iterator it = d().iterator();
                if (it.hasNext()) {
                    ((AbstractC1679lca) ((Map.Entry) it.next()).getKey()).N();
                    throw null;
                }
            } else {
                ((AbstractC1679lca) b(0).getKey()).N();
                throw null;
            }
        }
        super.b();
    }
}
