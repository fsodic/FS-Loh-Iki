package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.oja  reason: case insensitive filesystem */
public final class C1900oja {

    /* renamed from: a  reason: collision with root package name */
    private final Pha[] f5157a;

    /* renamed from: b  reason: collision with root package name */
    private final Rha f5158b;

    /* renamed from: c  reason: collision with root package name */
    private Pha f5159c;

    public C1900oja(Pha[] phaArr, Rha rha) {
        this.f5157a = phaArr;
        this.f5158b = rha;
    }

    public final Pha a(Oha oha, Uri uri) {
        Pha pha = this.f5159c;
        if (pha != null) {
            return pha;
        }
        Pha[] phaArr = this.f5157a;
        int length = phaArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Pha pha2 = phaArr[i];
            try {
                if (pha2.a(oha)) {
                    this.f5159c = pha2;
                    oha.a();
                    break;
                }
                oha.a();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                oha.a();
                throw th;
            }
        }
        Pha pha3 = this.f5159c;
        if (pha3 != null) {
            pha3.a(this.f5158b);
            return this.f5159c;
        }
        String a2 = Jka.a(this.f5157a);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(a2);
        sb.append(") could read the stream.");
        throw new Kja(sb.toString(), uri);
    }

    public final void a() {
        Pha pha = this.f5159c;
        if (pha != null) {
            pha.a();
            this.f5159c = null;
        }
    }
}
