package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.C1219ena;
import com.google.android.gms.internal.ads.C1357gna;
import com.google.android.gms.internal.ads.Vma;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.cH  reason: case insensitive filesystem */
public final class C1036cH {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<C1357gna.c> f3977a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3978b;

    /* renamed from: c  reason: collision with root package name */
    private final C2055qu f3979c;
    private final TelephonyManager d;
    private final _G e;
    private final TG f;
    private Cna g;

    static {
        SparseArray<C1357gna.c> sparseArray = new SparseArray<>();
        f3977a = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), C1357gna.c.CONNECTED);
        f3977a.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), C1357gna.c.CONNECTING);
        f3977a.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), C1357gna.c.CONNECTING);
        f3977a.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), C1357gna.c.CONNECTING);
        f3977a.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), C1357gna.c.DISCONNECTING);
        f3977a.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), C1357gna.c.DISCONNECTED);
        f3977a.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), C1357gna.c.DISCONNECTED);
        f3977a.put(NetworkInfo.DetailedState.FAILED.ordinal(), C1357gna.c.DISCONNECTED);
        f3977a.put(NetworkInfo.DetailedState.IDLE.ordinal(), C1357gna.c.DISCONNECTED);
        f3977a.put(NetworkInfo.DetailedState.SCANNING.ordinal(), C1357gna.c.DISCONNECTED);
        f3977a.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), C1357gna.c.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            f3977a.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), C1357gna.c.CONNECTING);
        }
        f3977a.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), C1357gna.c.CONNECTING);
    }

    C1036cH(Context context, C2055qu quVar, _G _g, TG tg) {
        this.f3978b = context;
        this.f3979c = quVar;
        this.e = _g;
        this.f = tg;
        this.d = (TelephonyManager) context.getSystemService("phone");
    }

    /* access modifiers changed from: private */
    public final C1219ena a(Bundle bundle) {
        C1219ena.a aVar;
        C1219ena.b n = C1219ena.n();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.g = Cna.ENUM_TRUE;
        } else {
            this.g = Cna.ENUM_FALSE;
            n.a(i != 0 ? i != 1 ? C1219ena.c.NETWORKTYPE_UNSPECIFIED : C1219ena.c.WIFI : C1219ena.c.CELL);
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    aVar = C1219ena.a.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    aVar = C1219ena.a.THREE_G;
                    break;
                case 13:
                    aVar = C1219ena.a.LTE;
                    break;
                default:
                    aVar = C1219ena.a.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            n.a(aVar);
        }
        return (C1219ena) n.j();
    }

    /* access modifiers changed from: private */
    public final byte[] a(boolean z, ArrayList<Vma.a> arrayList, C1219ena ena, C1357gna.c cVar) {
        C1357gna.a.C0037a p = C1357gna.a.p();
        p.a(arrayList);
        boolean z2 = true;
        p.c(b(q.e().b(this.f3978b.getContentResolver()) != 0));
        p.d(q.e().a(this.f3978b, this.d));
        p.b(this.e.b());
        p.c(this.e.d());
        p.a(this.e.a());
        p.a(cVar);
        p.a(ena);
        p.e(this.g);
        p.a(b(z));
        p.a(q.j().a());
        if (q.e().a(this.f3978b.getContentResolver()) == 0) {
            z2 = false;
        }
        p.b(b(z2));
        return ((C1357gna.a) p.j()).f();
    }

    private static Cna b(boolean z) {
        return z ? Cna.ENUM_TRUE : Cna.ENUM_FALSE;
    }

    /* access modifiers changed from: private */
    public static C1357gna.c b(Bundle bundle) {
        return f3977a.get(LR.a(LR.a(bundle, "device"), "network").getInt("active_network_state", -1), C1357gna.c.UNSPECIFIED);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.Vma.a> c(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1036cH.c(android.os.Bundle):java.util.ArrayList");
    }

    public final void a(boolean z) {
        JW.a(this.f3979c.a(), new C1242fH(this, z), C0875_l.f);
    }
}
