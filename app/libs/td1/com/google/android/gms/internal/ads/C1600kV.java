package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.kV  reason: case insensitive filesystem */
public final class C1600kV {

    /* renamed from: a  reason: collision with root package name */
    private final String f4776a;

    /* renamed from: b  reason: collision with root package name */
    private final C1531jV f4777b;

    /* renamed from: c  reason: collision with root package name */
    private C1531jV f4778c;
    private boolean d;

    private C1600kV(String str) {
        this.f4777b = new C1531jV();
        this.f4778c = this.f4777b;
        this.d = false;
        C1945pV.a(str);
        this.f4776a = str;
    }

    public final C1600kV a(Object obj) {
        C1531jV jVVar = new C1531jV();
        this.f4778c.f4680b = jVVar;
        this.f4778c = jVVar;
        jVVar.f4679a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f4776a);
        sb.append('{');
        C1531jV jVVar = this.f4777b.f4680b;
        String str = BuildConfig.FLAVOR;
        while (jVVar != null) {
            Object obj = jVVar.f4679a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            jVVar = jVVar.f4680b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
