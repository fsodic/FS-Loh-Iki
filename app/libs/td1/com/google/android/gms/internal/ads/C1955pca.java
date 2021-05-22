package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.pca  reason: case insensitive filesystem */
public final class C1955pca {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f5245a = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: b  reason: collision with root package name */
    private String f5246b = "googleads.g.doubleclick.net";

    /* renamed from: c  reason: collision with root package name */
    private String f5247c = "/pagead/ads";
    private String d = "ad.doubleclick.net";
    private String[] e = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private AbstractC1740mX f;

    public C1955pca(AbstractC1740mX mXVar) {
        this.f = mXVar;
    }

    private final Uri a(Uri uri, String str) {
        try {
            boolean c2 = c(uri);
            if (c2) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new Rba("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new Rba("Query parameter already exists: ms");
            }
            if (c2) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + str + ";" + uri2.substring(i));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str + "&" + uri3.substring(i2));
        } catch (UnsupportedOperationException unused) {
            throw new Rba("Provided Uri is not in a valid state");
        }
    }

    private final boolean c(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.d);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    public final Uri a(Uri uri, Context context) {
        return a(uri, this.f.a(context));
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return a(uri, this.f.a(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new Rba("Provided Uri is not in a valid state");
        }
    }

    public final AbstractC1740mX a() {
        return this.f;
    }

    public final void a(MotionEvent motionEvent) {
        this.f.a(motionEvent);
    }

    public final boolean a(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String str : this.e) {
                    if (host.endsWith(str)) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw new NullPointerException();
    }

    public final boolean b(Uri uri) {
        if (a(uri)) {
            for (String str : f5245a) {
                if (uri.getPath().endsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
