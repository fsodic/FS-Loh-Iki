package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.Vm  reason: case insensitive filesystem */
public final class C0746Vm extends AbstractC1757mh {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0773Wn f3368a;

    /* renamed from: b  reason: collision with root package name */
    private final SSLSocketFactory f3369b;

    public C0746Vm() {
        this(null);
    }

    private C0746Vm(AbstractC0773Wn wn) {
        this(null, null);
    }

    private C0746Vm(AbstractC0773Wn wn, SSLSocketFactory sSLSocketFactory) {
        this.f3368a = null;
        this.f3369b = null;
    }

    private static List<C2252tna> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new C2252tna(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    private static void a(HttpURLConnection httpURLConnection, AbstractC0959b<?> bVar) {
        byte[] h = bVar.h();
        if (h != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                httpURLConnection.setRequestProperty("Content-Type", "UTF-8".length() != 0 ? "application/x-www-form-urlencoded; charset=".concat("UTF-8") : new String("application/x-www-form-urlencoded; charset="));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(h);
            dataOutputStream.close();
        }
    }

    /* access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0117  */
    @Override // com.google.android.gms.internal.ads.AbstractC1757mh
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C0719Ul a(com.google.android.gms.internal.ads.AbstractC0959b<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0746Vm.a(com.google.android.gms.internal.ads.b, java.util.Map):com.google.android.gms.internal.ads.Ul");
    }
}
