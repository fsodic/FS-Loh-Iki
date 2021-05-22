package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.ads.Xo  reason: case insensitive filesystem */
public class C0800Xo extends AbstractC0959b<String> {
    private final Object p = new Object();
    private AbstractC2440we<String> q;

    public C0800Xo(int i, String str, AbstractC2440we<String> weVar, AbstractC0923ad adVar) {
        super(i, str, adVar);
        this.q = weVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC0959b
    public final C0191Ad<String> a(C1912opa opa) {
        String str;
        try {
            byte[] bArr = opa.f5178b;
            String str2 = "ISO-8859-1";
            String str3 = opa.f5179c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(opa.f5178b);
        }
        return C0191Ad.a(str, C2318um.a(opa));
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        AbstractC2440we<String> weVar;
        synchronized (this.p) {
            weVar = this.q;
        }
        if (weVar != null) {
            weVar.a(str);
        }
    }
}
