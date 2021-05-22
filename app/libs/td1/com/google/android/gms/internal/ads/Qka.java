package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
public final class Qka extends Surface {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f2960a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2961b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2962c;
    private final Ska d;
    private boolean e;

    private Qka(Ska ska, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = ska;
        this.f2962c = z;
    }

    public static Qka a(Context context, boolean z) {
        if (Jka.f2347a >= 17) {
            C2453wka.b(!z || a(context));
            return new Ska().a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (Qka.class) {
            if (!f2961b) {
                if (Jka.f2347a >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(Jka.f2347a == 24 && (Jka.d.startsWith("SM-G950") || Jka.d.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    f2960a = z2;
                }
                f2961b = true;
            }
            z = f2960a;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.d) {
            if (!this.e) {
                this.d.a();
                this.e = true;
            }
        }
    }
}
