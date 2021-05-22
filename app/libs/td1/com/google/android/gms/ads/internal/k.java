package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.C0745Vl;

/* access modifiers changed from: package-private */
public final class k extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ l f1087a;

    k(l lVar) {
        this.f1087a = lVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f1087a.g != null) {
            try {
                this.f1087a.g.c(0);
            } catch (RemoteException e) {
                C0745Vl.d("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f1087a.Xb())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (this.f1087a.g != null) {
                try {
                    this.f1087a.g.c(3);
                } catch (RemoteException e) {
                    C0745Vl.d("#007 Could not call remote method.", e);
                }
            }
            this.f1087a.x(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (this.f1087a.g != null) {
                try {
                    this.f1087a.g.c(0);
                } catch (RemoteException e2) {
                    C0745Vl.d("#007 Could not call remote method.", e2);
                }
            }
            this.f1087a.x(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            if (this.f1087a.g != null) {
                try {
                    this.f1087a.g.a();
                } catch (RemoteException e3) {
                    C0745Vl.d("#007 Could not call remote method.", e3);
                }
            }
            this.f1087a.x(this.f1087a.F(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f1087a.g != null) {
                try {
                    this.f1087a.g.i();
                } catch (RemoteException e4) {
                    C0745Vl.d("#007 Could not call remote method.", e4);
                }
            }
            this.f1087a.H(this.f1087a.G(str));
            return true;
        }
    }
}
