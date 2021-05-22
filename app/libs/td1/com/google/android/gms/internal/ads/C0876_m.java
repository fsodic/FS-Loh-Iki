package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads._m  reason: case insensitive filesystem */
public final class C0876_m {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3758a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3759b;

    /* renamed from: c  reason: collision with root package name */
    private final C0823Yl f3760c;
    private final J d;
    private final L e;
    private final C1214el f;
    private final long[] g;
    private final String[] h;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m;
    private AbstractC0382Hm n;
    private boolean o;
    private boolean p;
    private long q = -1;

    public C0876_m(Context context, C0823Yl yl, String str, L l2, J j2) {
        C1283fl flVar = new C1283fl();
        flVar.a("min_1", Double.MIN_VALUE, 1.0d);
        flVar.a("1_5", 1.0d, 5.0d);
        flVar.a("5_10", 5.0d, 10.0d);
        flVar.a("10_20", 10.0d, 20.0d);
        flVar.a("20_30", 20.0d, 30.0d);
        flVar.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f = flVar.a();
        this.f3758a = context;
        this.f3760c = yl;
        this.f3759b = str;
        this.e = l2;
        this.d = j2;
        String str2 = (String) C2392voa.e().a(C2474x.u);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.h = new String[split.length];
        this.g = new long[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                this.g[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException e2) {
                C0745Vl.c("Unable to parse frame hash target time number.", e2);
                this.g[i2] = -1;
            }
        }
    }

    public final void a() {
        if (C0240Ca.f1699a.a().booleanValue() && !this.o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f3759b);
            bundle.putString("player", this.n.e());
            for (C1352gl glVar : this.f.a()) {
                String valueOf = String.valueOf(glVar.f4415a);
                bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(glVar.e));
                String valueOf2 = String.valueOf(glVar.f4415a);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(glVar.d));
            }
            int i2 = 0;
            while (true) {
                long[] jArr = this.g;
                if (i2 < jArr.length) {
                    String str = this.h[i2];
                    if (str != null) {
                        String valueOf3 = String.valueOf(Long.valueOf(jArr[i2]));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                        sb.append("fh_");
                        sb.append(valueOf3);
                        bundle.putString(sb.toString(), str);
                    }
                    i2++;
                } else {
                    q.c().a(this.f3758a, this.f3760c.f3587a, "gmob-apps", bundle, true);
                    this.o = true;
                    return;
                }
            }
        }
    }

    public final void a(AbstractC0382Hm hm) {
        G.a(this.e, this.d, "vpc2");
        this.i = true;
        L l2 = this.e;
        if (l2 != null) {
            l2.a("vpn", hm.e());
        }
        this.n = hm;
    }

    public final void b() {
        if (this.i && !this.j) {
            G.a(this.e, this.d, "vfr2");
            this.j = true;
        }
    }

    public final void b(AbstractC0382Hm hm) {
        if (this.k && !this.l) {
            if (C1763mk.a() && !this.l) {
                C1763mk.f("VideoMetricsMixin first frame");
            }
            G.a(this.e, this.d, "vff2");
            this.l = true;
        }
        long c2 = q.j().c();
        if (this.m && this.p && this.q != -1) {
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d2 = (double) (c2 - this.q);
            Double.isNaN(nanos);
            Double.isNaN(d2);
            this.f.a(nanos / d2);
        }
        this.p = this.m;
        this.q = c2;
        long longValue = ((Long) C2392voa.e().a(C2474x.v)).longValue();
        long currentPosition = (long) hm.getCurrentPosition();
        int i2 = 0;
        while (true) {
            String[] strArr = this.h;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] != null || longValue <= Math.abs(currentPosition - this.g[i2])) {
                i2++;
            } else {
                String[] strArr2 = this.h;
                int i3 = 8;
                Bitmap bitmap = hm.getBitmap(8, 8);
                long j2 = 63;
                int i4 = 0;
                long j3 = 0;
                while (i4 < i3) {
                    long j4 = j2;
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j3 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j4);
                        i5++;
                        j4--;
                        i3 = 8;
                    }
                    i4++;
                    j2 = j4;
                    i3 = 8;
                }
                strArr2[i2] = String.format("%016X", Long.valueOf(j3));
                return;
            }
        }
    }

    public final void c() {
        this.m = true;
        if (this.j && !this.k) {
            G.a(this.e, this.d, "vfp2");
            this.k = true;
        }
    }

    public final void d() {
        this.m = false;
    }
}
