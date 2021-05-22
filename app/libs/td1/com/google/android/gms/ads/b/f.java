package com.google.android.gms.ads.b;

import android.os.RemoteException;
import android.view.View;
import b.c.b.a.c.a;
import com.google.android.gms.internal.ads.AbstractC1194eb;
import com.google.android.gms.internal.ads.C0745Vl;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, f> f1034a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private AbstractC1194eb f1035b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f1036c;

    private final void a(a aVar) {
        WeakReference<View> weakReference = this.f1036c;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            C0745Vl.d("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!f1034a.containsKey(view)) {
            f1034a.put(view, this);
        }
        AbstractC1194eb ebVar = this.f1035b;
        if (ebVar != null) {
            try {
                ebVar.e(aVar);
            } catch (RemoteException e) {
                C0745Vl.b("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void a(c cVar) {
        a((a) cVar.a());
    }

    public final void a(k kVar) {
        a((a) kVar.k());
    }
}
