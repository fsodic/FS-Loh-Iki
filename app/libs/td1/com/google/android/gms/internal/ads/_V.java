package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public final class _V implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f3726a;

    public _V(Pattern pattern) {
        C1945pV.a(pattern);
        this.f3726a = pattern;
    }

    public final boolean accept(File file, String str) {
        return this.f3726a.matcher(str).matches();
    }
}
