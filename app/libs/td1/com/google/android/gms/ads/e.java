package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.internal.ads.Epa;
import com.google.android.gms.internal.ads.Fpa;
import java.util.Date;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Fpa f1059a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Epa f1060a = new Epa();

        public a() {
            this.f1060a.b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @Deprecated
        public final a a(int i) {
            this.f1060a.a(i);
            return this;
        }

        public final a a(Location location) {
            this.f1060a.a(location);
            return this;
        }

        public final a a(Class<? extends j> cls, Bundle bundle) {
            this.f1060a.a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f1060a.c("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public final a a(String str) {
            this.f1060a.a(str);
            return this;
        }

        @Deprecated
        public final a a(Date date) {
            this.f1060a.a(date);
            return this;
        }

        @Deprecated
        public final a a(boolean z) {
            this.f1060a.a(z);
            return this;
        }

        public final e a() {
            return new e(this);
        }

        @Deprecated
        public final a b(String str) {
            this.f1060a.b(str);
            return this;
        }

        @Deprecated
        public final a b(boolean z) {
            this.f1060a.b(z);
            return this;
        }
    }

    private e(a aVar) {
        this.f1059a = new Fpa(aVar.f1060a);
    }

    public final Fpa a() {
        return this.f1059a;
    }
}
