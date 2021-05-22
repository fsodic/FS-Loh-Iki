package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import b.c.b.a.c.a;
import java.lang.ref.WeakReference;
import java.util.Map;

public interface OA extends View.OnClickListener, View.OnTouchListener {
    View E(String str);

    FrameLayout Jb();

    View$OnAttachStateChangeListenerC1559jla Kb();

    a Lb();

    Map<String, WeakReference<View>> Mb();

    View Nb();

    Map<String, WeakReference<View>> Ob();

    String Pb();

    Map<String, WeakReference<View>> Qb();

    void a(String str, View view, boolean z);
}
