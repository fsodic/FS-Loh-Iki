package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

public interface a extends Parcelable, com.google.android.gms.common.data.a<a> {
    boolean A();

    String B();

    boolean D();

    boolean F();

    Uri I();

    boolean c();

    boolean d();

    Uri g();

    String getDescription();

    String getDisplayName();

    @KeepName
    @Deprecated
    String getFeaturedImageUrl();

    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    Uri h();

    boolean isMuted();

    String k();

    String l();

    String p();

    int q();

    String s();

    boolean u();

    int w();

    String x();

    boolean y();
}
