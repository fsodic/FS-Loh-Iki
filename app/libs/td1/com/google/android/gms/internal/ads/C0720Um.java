package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.Um  reason: case insensitive filesystem */
public final class C0720Um extends Thread implements SurfaceTexture.OnFrameAvailableListener, AbstractC0772Wm {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f3284a = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean A;
    private volatile boolean B;

    /* renamed from: b  reason: collision with root package name */
    private final C0694Tm f3285b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f3286c;
    private final float[] d;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private final float[] h;
    private final float[] i;
    private float j;
    private float k;
    private float l;
    private int m;
    private int n;
    private SurfaceTexture o;
    private SurfaceTexture p;
    private int q;
    private int r;
    private int s;
    private FloatBuffer t = ByteBuffer.allocateDirect(f3284a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    private final CountDownLatch u;
    private final Object v;
    private EGL10 w;
    private EGLDisplay x;
    private EGLContext y;
    private EGLSurface z;

    public C0720Um(Context context) {
        super("SphericalVideoProcessor");
        this.t.put(f3284a).position(0);
        this.f3286c = new float[9];
        this.d = new float[9];
        this.e = new float[9];
        this.f = new float[9];
        this.g = new float[9];
        this.h = new float[9];
        this.i = new float[9];
        this.j = Float.NaN;
        this.f3285b = new C0694Tm(context);
        this.f3285b.a(this);
        this.u = new CountDownLatch(1);
        this.v = new Object();
    }

    private static int a(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        a("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        a("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        a("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        a("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i2);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        a("deleteShader");
        return 0;
    }

    private static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    private static void a(float[] fArr, float f2) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d2 = (double) f2;
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = (float) (-Math.sin(d2));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d2);
        fArr[8] = (float) Math.cos(d2);
    }

    private static void a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static void b(float[] fArr, float f2) {
        double d2 = (double) f2;
        fArr[0] = (float) Math.cos(d2);
        fArr[1] = (float) (-Math.sin(d2));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d2);
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private final boolean d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.z;
        boolean z2 = false;
        if (!(eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE))) {
            z2 = this.w.eglDestroySurface(this.x, this.z) | this.w.eglMakeCurrent(this.x, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.z = null;
        }
        EGLContext eGLContext = this.y;
        if (eGLContext != null) {
            z2 |= this.w.eglDestroyContext(this.x, eGLContext);
            this.y = null;
        }
        EGLDisplay eGLDisplay = this.x;
        if (eGLDisplay == null) {
            return z2;
        }
        boolean eglTerminate = z2 | this.w.eglTerminate(eGLDisplay);
        this.x = null;
        return eglTerminate;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0772Wm
    public final void a() {
        synchronized (this.v) {
            this.v.notifyAll();
        }
    }

    public final void a(float f2, float f3) {
        float f4;
        float f5;
        float f6;
        int i2 = this.n;
        int i3 = this.m;
        if (i2 > i3) {
            f5 = (f2 * 1.7453293f) / ((float) i2);
            f4 = f3 * 1.7453293f;
            f6 = (float) i2;
        } else {
            f5 = (f2 * 1.7453293f) / ((float) i3);
            f4 = f3 * 1.7453293f;
            f6 = (float) i3;
        }
        this.k -= f5;
        this.l -= f4 / f6;
        if (this.l < -1.5707964f) {
            this.l = -1.5707964f;
        }
        if (this.l > 1.5707964f) {
            this.l = 1.5707964f;
        }
    }

    public final void a(int i2, int i3) {
        synchronized (this.v) {
            this.n = i2;
            this.m = i3;
            this.A = true;
            this.v.notifyAll();
        }
    }

    public final void a(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.n = i2;
        this.m = i3;
        this.p = surfaceTexture;
    }

    public final void b() {
        synchronized (this.v) {
            this.B = true;
            this.p = null;
            this.v.notifyAll();
        }
    }

    public final SurfaceTexture c() {
        if (this.p == null) {
            return null;
        }
        try {
            this.u.await();
        } catch (InterruptedException unused) {
        }
        return this.o;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.s++;
        synchronized (this.v) {
            this.v.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01db A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 1040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0720Um.run():void");
    }
}
