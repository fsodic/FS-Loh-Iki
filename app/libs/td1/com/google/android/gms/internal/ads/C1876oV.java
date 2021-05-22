package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.oV  reason: case insensitive filesystem */
public final class C1876oV {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f5131a = Logger.getLogger(C1876oV.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final AbstractC1669lV f5132b = new a();

    /* renamed from: com.google.android.gms.internal.ads.oV$a */
    static final class a {
        private a() {
        }
    }

    private C1876oV() {
    }

    static String a(String str) {
        if (b(str)) {
            return null;
        }
        return str;
    }

    static boolean b(String str) {
        return str == null || str.isEmpty();
    }

    static String c(String str) {
        return str == null ? BuildConfig.FLAVOR : str;
    }
}
