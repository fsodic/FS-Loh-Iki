package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.ads.internal.q;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ig  reason: case insensitive filesystem */
public final class C0402Ig extends C0662Sg {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f2250c;
    private final Context d;

    public C0402Ig(AbstractC1564jo joVar, Map<String, String> map) {
        super(joVar, "storePicture");
        this.f2250c = map;
        this.d = joVar.v();
    }

    public final void a() {
        if (this.d == null) {
            a("Activity context is not available");
            return;
        }
        q.c();
        if (!C2452wk.f(this.d).c()) {
            a("Feature is not supported by the device.");
            return;
        }
        String str = this.f2250c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            a("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            a(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            q.c();
            if (!C2452wk.b(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                a(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources b2 = q.g().b();
            q.c();
            AlertDialog.Builder e = C2452wk.e(this.d);
            e.setTitle(b2 != null ? b2.getString(a.s1) : "Save image");
            e.setMessage(b2 != null ? b2.getString(a.s2) : "Allow Ad to store image in Picture gallery?");
            e.setPositiveButton(b2 != null ? b2.getString(a.s3) : "Accept", new DialogInterface$OnClickListenerC0480Lg(this, str, lastPathSegment));
            e.setNegativeButton(b2 != null ? b2.getString(a.s4) : "Decline", new DialogInterface$OnClickListenerC0454Kg(this));
            e.create().show();
        }
    }
}
