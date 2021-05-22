package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import b.c.b.a.b.l;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1388a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1389b = this.f1388a.getResourcePackageName(l.common_google_play_services_unknown_issue);

    public v(Context context) {
        r.a(context);
        this.f1388a = context.getResources();
    }

    public String a(String str) {
        int identifier = this.f1388a.getIdentifier(str, "string", this.f1389b);
        if (identifier == 0) {
            return null;
        }
        return this.f1388a.getString(identifier);
    }
}
