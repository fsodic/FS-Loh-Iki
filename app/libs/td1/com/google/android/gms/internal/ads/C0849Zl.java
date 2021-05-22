package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.internal.ads.Zl  reason: case insensitive filesystem */
public final class C0849Zl implements AbstractC0485Ll {

    /* renamed from: a  reason: collision with root package name */
    private final String f3674a;

    public C0849Zl() {
        this(null);
    }

    public C0849Zl(String str) {
        this.f3674a = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0485Ll
    public final void a(String str) {
        String sb;
        String message;
        StringBuilder sb2;
        try {
            String valueOf = String.valueOf(str);
            C0745Vl.a(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                C2392voa.a();
                C0459Kl.a(true, httpURLConnection, this.f3674a);
                C0563Ol ol = new C0563Ol();
                ol.a(httpURLConnection, (byte[]) null);
                int responseCode = httpURLConnection.getResponseCode();
                ol.a(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 65);
                    sb3.append("Received non-success response code ");
                    sb3.append(responseCode);
                    sb3.append(" from pinging URL: ");
                    sb3.append(str);
                    C0745Vl.d(sb3.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IndexOutOfBoundsException e) {
            String message2 = e.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb4.append("Error while parsing ping URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message2);
            sb = sb4.toString();
            C0745Vl.d(sb);
        } catch (IOException e2) {
            message = e2.getMessage();
            sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            sb = sb2.toString();
            C0745Vl.d(sb);
        } catch (RuntimeException e3) {
            message = e3.getMessage();
            sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            sb = sb2.toString();
            C0745Vl.d(sb);
        }
    }
}
