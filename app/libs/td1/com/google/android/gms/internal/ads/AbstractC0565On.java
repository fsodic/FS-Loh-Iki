package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.api.h;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.On  reason: case insensitive filesystem */
public abstract class AbstractC0565On implements h {

    /* renamed from: a  reason: collision with root package name */
    protected Context f2788a;

    /* renamed from: b  reason: collision with root package name */
    protected String f2789b;

    /* renamed from: c  reason: collision with root package name */
    protected WeakReference<AbstractC0798Xm> f2790c;

    public AbstractC0565On(AbstractC0798Xm xm) {
        this.f2788a = xm.getContext();
        this.f2789b = q.c().b(this.f2788a, xm.q().f3587a);
        this.f2790c = new WeakReference<>(xm);
    }

    /* access modifiers changed from: private */
    public final void a(String str, Map<String, String> map) {
        AbstractC0798Xm xm = this.f2790c.get();
        if (xm != null) {
            xm.a(str, map);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: private */
    public static String c(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return "internal";
            case 6:
            case 7:
                return "io";
            case '\b':
            case '\t':
                return "network";
            case '\n':
            case 11:
                return "policy";
        }
    }

    @Override // com.google.android.gms.common.api.h
    public void a() {
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, int i) {
        C0459Kl.f2428a.post(new RunnableC0669Sn(this, str, str2, i));
    }

    public final void a(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        C0459Kl.f2428a.post(new RunnableC0591Pn(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void a(String str, String str2, long j) {
        C0459Kl.f2428a.post(new RunnableC0643Rn(this, str, str2, j));
    }

    public final void a(String str, String str2, long j, long j2, boolean z, int i, int i2) {
        C0459Kl.f2428a.post(new RunnableC0617Qn(this, str, str2, j, j2, z, i, i2));
    }

    public final void a(String str, String str2, String str3, String str4) {
        C0459Kl.f2428a.post(new RunnableC0721Un(this, str, str2, str3, str4));
    }

    public abstract boolean a(String str);

    public boolean a(String str, String[] strArr) {
        return a(str);
    }

    /* access modifiers changed from: protected */
    public String b(String str) {
        C2392voa.a();
        return C0459Kl.a(str);
    }

    public abstract void b();

    /* access modifiers changed from: protected */
    public void b(int i) {
    }

    /* access modifiers changed from: protected */
    public void c(int i) {
    }

    /* access modifiers changed from: protected */
    public void d(int i) {
    }

    /* access modifiers changed from: protected */
    public void e(int i) {
    }
}
