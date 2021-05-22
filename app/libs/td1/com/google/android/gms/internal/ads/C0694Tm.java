package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.Tm  reason: case insensitive filesystem */
final class C0694Tm implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final SensorManager f3205a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f3206b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Display f3207c;
    private final float[] d = new float[9];
    private final float[] e = new float[9];
    private float[] f;
    private Handler g;
    private AbstractC0772Wm h;

    C0694Tm(Context context) {
        this.f3205a = (SensorManager) context.getSystemService("sensor");
        this.f3207c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void a(int i, int i2) {
        float[] fArr = this.e;
        float f2 = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.g == null) {
            Sensor defaultSensor = this.f3205a.getDefaultSensor(11);
            if (defaultSensor == null) {
                C0745Vl.b("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.g = new _U(handlerThread.getLooper());
            if (!this.f3205a.registerListener(this, defaultSensor, 0, this.g)) {
                C0745Vl.b("SensorManager.registerListener failed.");
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(AbstractC0772Wm wm) {
        this.h = wm;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(float[] fArr) {
        synchronized (this.f3206b) {
            if (this.f == null) {
                return false;
            }
            System.arraycopy(this.f, 0, fArr, 0, this.f.length);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.g != null) {
            this.f3205a.unregisterListener(this);
            this.g.post(new RunnableC0668Sm(this));
            this.g = null;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f3206b) {
                if (this.f == null) {
                    this.f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.d, fArr);
            int rotation = this.f3207c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
            } else if (rotation != 3) {
                System.arraycopy(this.d, 0, this.e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
            }
            a(1, 3);
            a(2, 6);
            a(5, 7);
            synchronized (this.f3206b) {
                System.arraycopy(this.e, 0, this.f, 0, 9);
            }
            AbstractC0772Wm wm = this.h;
            if (wm != null) {
                wm.a();
            }
        }
    }
}
