package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.f;
import java.util.ArrayList;
import java.util.List;

public final class JR {
    public static C1015boa a(Context context, List<C1872oR> list) {
        ArrayList arrayList = new ArrayList();
        for (C1872oR oRVar : list) {
            if (oRVar.f5125c) {
                arrayList.add(f.h);
            } else {
                arrayList.add(new f(oRVar.f5123a, oRVar.f5124b));
            }
        }
        return new C1015boa(context, (f[]) arrayList.toArray(new f[arrayList.size()]));
    }

    public static C1872oR a(C1015boa boa) {
        return boa.i ? new C1872oR(-3, 0, true) : new C1872oR(boa.e, boa.f3941b, false);
    }

    public static C1872oR a(List<C1872oR> list, C1872oR oRVar) {
        return list.get(0);
    }
}
