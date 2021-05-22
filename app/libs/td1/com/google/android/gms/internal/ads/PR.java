package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

public final class PR {
    public static void a(int i, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i);
        C0745Vl.c(sb.toString());
        C1763mk.e(str, th);
        if (i != 3) {
            q.g().b(th, str);
        }
    }

    public static void a(Context context, boolean z) {
        String sb;
        if (z) {
            sb = "This request is sent from a test device.";
        } else {
            C2392voa.a();
            String a2 = C0459Kl.a(context);
            StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 101);
            sb2.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
            sb2.append(a2);
            sb2.append("\") to get test ads on this device.");
            sb = sb2.toString();
        }
        C0745Vl.c(sb);
    }
}
