package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface f extends j {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f1141a;

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f1141a);
            return bundle;
        }

        public final a a(int i) {
            this.f1141a = 1;
            return this;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
