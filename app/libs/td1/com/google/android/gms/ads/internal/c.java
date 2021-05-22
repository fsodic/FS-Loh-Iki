package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1761mj;
import com.google.android.gms.internal.ads.C0299Eh;
import com.google.android.gms.internal.ads.C2452wk;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1075a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1076b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC1761mj f1077c;
    private C0299Eh d = null;

    public c(Context context, AbstractC1761mj mjVar, C0299Eh eh) {
        this.f1075a = context;
        this.f1077c = mjVar;
        if (this.d == null) {
            this.d = new C0299Eh();
        }
    }

    private final boolean c() {
        AbstractC1761mj mjVar = this.f1077c;
        return (mjVar != null && mjVar.d().f) || this.d.f1883a;
    }

    public final void a() {
        this.f1076b = true;
    }

    public final void a(String str) {
        List<String> list;
        if (c()) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            AbstractC1761mj mjVar = this.f1077c;
            if (mjVar != null) {
                mjVar.a(str, null, 3);
                return;
            }
            C0299Eh eh = this.d;
            if (eh.f1883a && (list = eh.f1884b) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        q.c();
                        C2452wk.a(this.f1075a, BuildConfig.FLAVOR, replace);
                    }
                }
            }
        }
    }

    public final boolean b() {
        return !c() || this.f1076b;
    }
}
