package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import b.c.b.a.c.a;
import b.c.b.a.c.b;

/* renamed from: com.google.android.gms.internal.ads.Ug  reason: case insensitive filesystem */
public final class C0714Ug {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f3263a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3264b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f3265c = false;
    private QT d;

    private final void c(Context context) {
        synchronized (f3263a) {
            if (((Boolean) C2392voa.e().a(C2474x.bd)).booleanValue() && !f3265c) {
                try {
                    f3265c = true;
                    this.d = (QT) C0693Tl.a(context, "com.google.android.gms.ads.omid.DynamiteOmid", C0688Tg.f3196a);
                } catch (C0771Wl e) {
                    C0745Vl.d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final a a(String str, WebView webView, String str2, String str3, String str4) {
        return a(str, webView, str2, str3, str4, "Google");
    }

    public final a a(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (f3263a) {
            try {
                if (((Boolean) C2392voa.e().a(C2474x.bd)).booleanValue()) {
                    if (f3264b) {
                        try {
                            return this.d.a(str, b.a(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e) {
                            C0745Vl.d("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final String a(Context context) {
        if (!((Boolean) C2392voa.e().a(C2474x.bd)).booleanValue()) {
            return null;
        }
        try {
            c(context);
            String valueOf = String.valueOf(this.d.getVersion());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void a(a aVar) {
        synchronized (f3263a) {
            if (((Boolean) C2392voa.e().a(C2474x.bd)).booleanValue()) {
                if (f3264b) {
                    try {
                        this.d.P(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        C0745Vl.d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void a(a aVar, View view) {
        synchronized (f3263a) {
            if (((Boolean) C2392voa.e().a(C2474x.bd)).booleanValue()) {
                if (f3264b) {
                    try {
                        this.d.b(aVar, b.a(view));
                    } catch (RemoteException | NullPointerException e) {
                        C0745Vl.d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void b(a aVar) {
        synchronized (f3263a) {
            if (((Boolean) C2392voa.e().a(C2474x.bd)).booleanValue()) {
                if (f3264b) {
                    try {
                        this.d.A(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        C0745Vl.d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void b(a aVar, View view) {
        synchronized (f3263a) {
            if (((Boolean) C2392voa.e().a(C2474x.bd)).booleanValue()) {
                if (f3264b) {
                    try {
                        this.d.a(aVar, b.a(view));
                    } catch (RemoteException | NullPointerException e) {
                        C0745Vl.d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final boolean b(Context context) {
        synchronized (f3263a) {
            if (!((Boolean) C2392voa.e().a(C2474x.bd)).booleanValue()) {
                return false;
            }
            if (f3264b) {
                return true;
            }
            try {
                c(context);
                boolean F = this.d.F(b.a(context));
                f3264b = F;
                return F;
            } catch (RemoteException | NullPointerException e) {
                C0745Vl.d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }
}
