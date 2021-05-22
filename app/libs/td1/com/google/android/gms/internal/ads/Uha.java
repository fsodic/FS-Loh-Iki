package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Yia;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Uha {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC1005bja f3272a = new Tha();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f3273b = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: c  reason: collision with root package name */
    public int f3274c = -1;
    public int d = -1;

    private final boolean a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f3273b.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f3274c = parseInt;
                    this.d = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean a() {
        return (this.f3274c == -1 || this.d == -1) ? false : true;
    }

    public final boolean a(Yia yia) {
        for (int i = 0; i < yia.J(); i++) {
            Yia.a a2 = yia.a(i);
            if (a2 instanceof _ia) {
                _ia _ia = (_ia) a2;
                if (a(_ia.f3744b, _ia.f3745c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
