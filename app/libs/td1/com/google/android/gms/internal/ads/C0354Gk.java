package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import b.c.b.a.b.j;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.r;

@TargetApi(17)
/* renamed from: com.google.android.gms.internal.ads.Gk  reason: case insensitive filesystem */
public class C0354Gk extends C0224Bk {
    public C0354Gk() {
        super();
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final int a(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final Drawable a(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final String a(Context context) {
        C0225Bl a2 = C0225Bl.a();
        if (TextUtils.isEmpty(a2.f1649b)) {
            a2.f1649b = (String) (c.a() ? C0251Cl.a(context, new CallableC0303El(a2, context)) : C0251Cl.a(context, new CallableC0277Dl(a2, j.c(context), context)));
        }
        return a2.f1649b;
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final boolean a(Context context, WebSettings webSettings) {
        super.a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final int b(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final void b(Context context) {
        C0225Bl a2 = C0225Bl.a();
        C1763mk.f("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a2.f1649b)) {
            Context c2 = j.c(context);
            if (c.a() || c2 == null) {
                SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (c2 == null) {
                    putString.apply();
                } else {
                    r.a(context, putString, "admob_user_agent");
                }
            }
            a2.f1649b = defaultUserAgent;
        }
        C1763mk.f("User agent is updated.");
    }
}
