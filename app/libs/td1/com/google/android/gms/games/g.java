package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.a;

public interface g extends Parcelable, a<g> {
    String H();

    long e();

    long f();

    Uri g();

    @KeepName
    @Deprecated
    String getBannerImageLandscapeUrl();

    @KeepName
    @Deprecated
    String getBannerImagePortraitUrl();

    String getDisplayName();

    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    String getName();

    String getTitle();

    Uri h();

    Uri i();

    boolean isMuted();

    String j();

    long m();

    Uri n();

    boolean o();

    i r();

    int z();
}
