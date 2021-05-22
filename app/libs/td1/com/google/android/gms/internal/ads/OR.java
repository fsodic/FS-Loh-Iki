package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class OR {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f2744a;

    public OR() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) C2392voa.e().a(C2474x.Je));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f2744a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.f2744a;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
