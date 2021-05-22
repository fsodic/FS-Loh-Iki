package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.aA  reason: case insensitive filesystem */
public interface AbstractC0891aA {
    boolean G();

    void a();

    void a(Bundle bundle);

    void a(View view);

    void a(View view, MotionEvent motionEvent, View view2);

    void a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    void a(View view, Map<String, WeakReference<View>> map);

    void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    void a(AbstractC0657Sb sb);

    void a(AbstractC1223epa epa);

    void a(AbstractC1498ipa ipa);

    void a(String str);

    void b();

    void b(Bundle bundle);

    void c();

    boolean c(Bundle bundle);

    void destroy();

    void v();

    void x();
}
