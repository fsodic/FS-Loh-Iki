package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.tna  reason: case insensitive filesystem */
public final class C2252tna {

    /* renamed from: a  reason: collision with root package name */
    private final String f5655a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5656b;

    public C2252tna(String str, String str2) {
        this.f5655a = str;
        this.f5656b = str2;
    }

    public final String a() {
        return this.f5655a;
    }

    public final String b() {
        return this.f5656b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2252tna.class == obj.getClass()) {
            C2252tna tna = (C2252tna) obj;
            return TextUtils.equals(this.f5655a, tna.f5655a) && TextUtils.equals(this.f5656b, tna.f5656b);
        }
    }

    public final int hashCode() {
        return (this.f5655a.hashCode() * 31) + this.f5656b.hashCode();
    }

    public final String toString() {
        String str = this.f5655a;
        String str2 = this.f5656b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
