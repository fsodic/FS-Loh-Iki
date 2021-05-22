package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.cocos2dx.lib.GameControllerDelegate;

/* renamed from: com.google.android.gms.internal.ads.tga  reason: case insensitive filesystem */
public final class C2238tga {

    /* renamed from: a  reason: collision with root package name */
    public static final int f5633a = (Jka.f2347a < 23 ? GameControllerDelegate.BUTTON_RIGHT_THUMBSTICK : 6396);

    /* renamed from: b  reason: collision with root package name */
    public static final UUID f5634b = new UUID(0, 0);

    /* renamed from: c  reason: collision with root package name */
    private static final UUID f5635c = new UUID(1186680826959645954L, -5988876978535335093L);
    private static final UUID d = new UUID(-1301668207276963122L, -6645017420763422227L);
    private static final UUID e = new UUID(-7348484286925749626L, -6083546864340672619L);

    public static long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }

    public static long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j * 1000;
    }
}
