package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.b.c;
import java.util.ArrayList;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Sa  reason: case insensitive filesystem */
public final class C0656Sa extends c.a {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0630Ra f3095a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.b> f3096b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private String f3097c;

    public C0656Sa(AbstractC0630Ra ra) {
        AbstractC0812Ya ya;
        IBinder iBinder;
        this.f3095a = ra;
        try {
            this.f3097c = this.f3095a.getText();
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
            this.f3097c = BuildConfig.FLAVOR;
        }
        try {
            for (AbstractC0812Ya ya2 : ra.Hb()) {
                if (!(ya2 instanceof IBinder) || (iBinder = (IBinder) ya2) == null) {
                    ya = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    ya = queryLocalInterface instanceof AbstractC0812Ya ? (AbstractC0812Ya) queryLocalInterface : new C0864_a(iBinder);
                }
                if (ya != null) {
                    this.f3096b.add(new C0838Za(ya));
                }
            }
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
        }
    }
}
