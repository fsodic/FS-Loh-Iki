package com.google.android.gms.internal.ads;

public final class WR {
    public static Sna a(int i, String str) {
        while (str == null) {
            int i2 = VR.f3339a[i - 1];
            str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Internal error." : "App ID missing." : "No fill." : "Network error." : "Invalid request.";
        }
        int i3 = VR.f3339a[i - 1];
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Sna(0, str, "com.google.android.gms.ads") : new Sna(8, str, "com.google.android.gms.ads") : new Sna(3, str, "com.google.android.gms.ads") : new Sna(2, str, "com.google.android.gms.ads") : new Sna(1, str, "com.google.android.gms.ads");
    }
}
