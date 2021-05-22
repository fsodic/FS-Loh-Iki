package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.util.i;

public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel {
    /* access modifiers changed from: protected */
    public static boolean a(Integer num) {
        if (num == null) {
            return false;
        }
        return i.a(num.intValue());
    }
}
