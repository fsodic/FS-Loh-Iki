package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nc  reason: case insensitive filesystem */
public final class C1816nc implements AbstractC0268Dc<AbstractC1564jo> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        AbstractC1564jo joVar2 = joVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                C0745Vl.d("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                C0745Vl.d("No timestamp given for CSI tick.");
            } else {
                try {
                    long b2 = q.j().b() + (Long.parseLong(str4) - q.j().a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    joVar2.m().a(str2, str3, b2);
                } catch (NumberFormatException e) {
                    C0745Vl.c("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                C0745Vl.d("No value given for CSI experiment.");
                return;
            }
            L a2 = joVar2.m().a();
            if (a2 == null) {
                C0745Vl.d("No ticker for WebView, dropping experiment ID.");
            } else {
                a2.a("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                C0745Vl.d("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                C0745Vl.d("No name given for CSI extra.");
            } else {
                L a3 = joVar2.m().a();
                if (a3 == null) {
                    C0745Vl.d("No ticker for WebView, dropping extra parameter.");
                } else {
                    a3.a(str6, str7);
                }
            }
        }
    }
}
