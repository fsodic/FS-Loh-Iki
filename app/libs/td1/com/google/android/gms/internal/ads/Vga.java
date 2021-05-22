package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
public final class Vga {

    /* renamed from: a  reason: collision with root package name */
    private static final Vga f3358a = new Vga(new int[]{2}, 2);

    /* renamed from: b  reason: collision with root package name */
    private final int[] f3359b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3360c = 2;

    private Vga(int[] iArr, int i) {
        this.f3359b = Arrays.copyOf(iArr, iArr.length);
        Arrays.sort(this.f3359b);
    }

    public final boolean a(int i) {
        return Arrays.binarySearch(this.f3359b, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vga)) {
            return false;
        }
        Vga vga = (Vga) obj;
        return Arrays.equals(this.f3359b, vga.f3359b) && this.f3360c == vga.f3360c;
    }

    public final int hashCode() {
        return this.f3360c + (Arrays.hashCode(this.f3359b) * 31);
    }

    public final String toString() {
        int i = this.f3360c;
        String arrays = Arrays.toString(this.f3359b);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
