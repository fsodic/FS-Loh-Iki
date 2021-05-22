package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class IL implements AbstractC1180eO<JL> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1180eO<C1387hO> f2215a;

    /* renamed from: b  reason: collision with root package name */
    private final GR f2216b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2217c;
    private final C0847Zj d;

    public IL(C2556yM<C1387hO> yMVar, GR gr, Context context, C0847Zj zj) {
        this.f2215a = yMVar;
        this.f2216b = gr;
        this.f2217c = context;
        this.d = zj;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ JL a(C1387hO hOVar) {
        boolean z;
        String str;
        int i;
        int i2;
        float f;
        String str2;
        int i3;
        int i4;
        DisplayMetrics displayMetrics;
        C1015boa boa = this.f2216b.e;
        C1015boa[] boaArr = boa.g;
        if (boaArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (C1015boa boa2 : boaArr) {
                if (!boa2.i && !z2) {
                    str = boa2.f3940a;
                    z2 = true;
                }
                if (boa2.i && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = boa.f3940a;
            z = boa.i;
        }
        Resources resources = this.f2217c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f2 = displayMetrics.density;
            int i5 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.d.i().i();
            i2 = i5;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        C1015boa[] boaArr2 = boa.g;
        if (boaArr2 != null) {
            boolean z4 = false;
            for (C1015boa boa3 : boaArr2) {
                if (boa3.i) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    sb.append((boa3.e != -1 || f == 0.0f) ? boa3.e : (int) (((float) boa3.f) / f));
                    sb.append("x");
                    if (boa3.f3941b == -2) {
                        if (f != 0.0f) {
                            i4 = (int) (((float) boa3.f3942c) / f);
                            sb.append(i4);
                        }
                    }
                    i4 = boa3.f3941b;
                    sb.append(i4);
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new JL(boa, str, z, sb.toString(), f, i2, i, str2, this.f2216b.o);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<JL> a() {
        return JW.a(this.f2215a.a(), new LL(this), C0875_l.f);
    }
}
