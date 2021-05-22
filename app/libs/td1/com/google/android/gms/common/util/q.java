package com.google.android.gms.common.util;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.r;
import java.util.Set;

public final class q {
    public static String[] a(Set<Scope> set) {
        r.a(set, "scopes can't be null.");
        return a((Scope[]) set.toArray(new Scope[set.size()]));
    }

    public static String[] a(Scope[] scopeArr) {
        r.a(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].L();
        }
        return strArr;
    }
}
