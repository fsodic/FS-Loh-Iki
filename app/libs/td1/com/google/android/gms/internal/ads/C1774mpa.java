package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.n;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.mpa  reason: case insensitive filesystem */
public final class C1774mpa implements n {

    /* renamed from: a  reason: collision with root package name */
    private final String f4996a;

    /* renamed from: b  reason: collision with root package name */
    private AbstractC1498ipa f4997b;

    public C1774mpa(AbstractC1498ipa ipa) {
        String str;
        this.f4997b = ipa;
        try {
            str = ipa.getDescription();
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
            str = null;
        }
        this.f4996a = str;
    }

    public final String toString() {
        return this.f4996a;
    }
}
