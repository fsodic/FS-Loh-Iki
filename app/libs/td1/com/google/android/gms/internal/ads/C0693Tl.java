package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Tl  reason: case insensitive filesystem */
public final class C0693Tl {
    public static Context a(Context context) {
        return b(context).a();
    }

    public static <T> T a(Context context, String str, AbstractC0797Xl<IBinder, T> xl) {
        try {
            return xl.apply(b(context).a(str));
        } catch (Exception e) {
            throw new C0771Wl(e);
        }
    }

    private static DynamiteModule b(Context context) {
        try {
            return DynamiteModule.a(context, DynamiteModule.h, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new C0771Wl(e);
        }
    }
}
