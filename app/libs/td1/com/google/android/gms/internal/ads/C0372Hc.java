package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.AbstractC0514Mo;
import com.google.android.gms.internal.ads.AbstractC0540No;
import com.google.android.gms.internal.ads.AbstractC0618Qo;
import com.google.android.gms.internal.ads.AbstractC0748Vo;
import com.google.android.gms.internal.ads.AbstractC0826Yo;
import java.net.URISyntaxException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Hc  reason: case insensitive filesystem */
public final class C0372Hc<T extends AbstractC0540No & AbstractC0514Mo & AbstractC0618Qo & AbstractC0748Vo & AbstractC0826Yo> implements AbstractC0268Dc<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c f2148a;

    /* renamed from: b  reason: collision with root package name */
    private final C0376Hg f2149b;

    public C0372Hc(c cVar, C0376Hg hg) {
        this.f2148a = cVar;
        this.f2149b = hg;
    }

    static Uri a(Context context, C1955pca pca, Uri uri, View view, Activity activity) {
        if (pca == null) {
            return uri;
        }
        try {
            return pca.b(uri) ? pca.a(uri, context, view, activity) : uri;
        } catch (Rba unused) {
            return uri;
        } catch (Exception e) {
            q.g().a(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri a(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            C0745Vl.b(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    private final void a(boolean z) {
        C0376Hg hg = this.f2149b;
        if (hg != null) {
            hg.a(z);
        }
    }

    private static boolean a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            q.e();
            return 7;
        } else if ("l".equalsIgnoreCase(str)) {
            q.e();
            return 6;
        } else if ("c".equalsIgnoreCase(str)) {
            return q.e().a();
        } else {
            return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(Object obj, Map map) {
        AbstractC0540No no = (AbstractC0540No) obj;
        String a2 = C0431Jj.a((String) map.get("u"), no.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            C0745Vl.d("Action missing from an open GMSG.");
            return;
        }
        c cVar = this.f2148a;
        if (cVar != null && !cVar.b()) {
            this.f2148a.a(a2);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((AbstractC0514Mo) no).k()) {
                C0745Vl.d("Cannot expand WebView that is already expanded.");
                return;
            }
            a(false);
            ((AbstractC0618Qo) no).b(a(map), b(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            a(false);
            if (a2 != null) {
                ((AbstractC0618Qo) no).a(a(map), b(map), a2);
            } else {
                ((AbstractC0618Qo) no).a(a(map), b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            a(true);
            if (TextUtils.isEmpty(a2)) {
                C0745Vl.d("Destination url cannot be empty.");
                return;
            }
            try {
                ((AbstractC0618Qo) no).a(new d(new C0450Kc(no.getContext(), ((AbstractC0748Vo) no).f(), ((AbstractC0826Yo) no).getView()).a(map)));
            } catch (ActivityNotFoundException e) {
                C0745Vl.d(e.getMessage());
            }
        } else if ("open_app".equalsIgnoreCase(str)) {
            if (((Boolean) C2392voa.e().a(C2474x.ff)).booleanValue()) {
                a(true);
                String str2 = (String) map.get("p");
                if (str2 == null) {
                    C0745Vl.d("Package name missing from open app action.");
                    return;
                }
                PackageManager packageManager = no.getContext().getPackageManager();
                if (packageManager == null) {
                    C0745Vl.d("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str2);
                if (launchIntentForPackage != null) {
                    ((AbstractC0618Qo) no).a(new d(launchIntentForPackage));
                }
            }
        } else {
            a(true);
            String str3 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str3)) {
                try {
                    intent = Intent.parseUri(str3, 0);
                } catch (URISyntaxException e2) {
                    String valueOf = String.valueOf(str3);
                    C0745Vl.b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                if (!Uri.EMPTY.equals(data)) {
                    intent.setData(a(a(no.getContext(), ((AbstractC0748Vo) no).f(), data, ((AbstractC0826Yo) no).getView(), no.v())));
                }
            }
            if (intent != null) {
                ((AbstractC0618Qo) no).a(new d(intent));
                return;
            }
            if (!TextUtils.isEmpty(a2)) {
                a2 = a(a(no.getContext(), ((AbstractC0748Vo) no).f(), Uri.parse(a2), ((AbstractC0826Yo) no).getView(), no.v())).toString();
            }
            ((AbstractC0618Qo) no).a(new d((String) map.get("i"), a2, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        }
    }
}
