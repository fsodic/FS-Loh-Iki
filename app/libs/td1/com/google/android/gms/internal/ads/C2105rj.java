package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.common.util.o;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.rj  reason: case insensitive filesystem */
public final class C2105rj {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f5447a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5448b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f5449c;
    private final C1142dj d;

    static {
        HashMap hashMap = new HashMap();
        if (o.h()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        f5447a = hashMap;
    }

    C2105rj(Context context, List<String> list, C1142dj djVar) {
        this.f5448b = context;
        this.f5449c = list;
        this.d = djVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r5 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> a(java.lang.String[] r11) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2105rj.a(java.lang.String[]):java.util.List");
    }
}
