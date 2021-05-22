package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public class e {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f180a;

        /* renamed from: b  reason: collision with root package name */
        private final h[] f181b;

        /* renamed from: c  reason: collision with root package name */
        private final h[] f182c;
        private boolean d;
        boolean e;
        private final int f;
        public int g;
        public CharSequence h;
        public PendingIntent i;

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        a(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, h[] hVarArr, h[] hVarArr2, boolean z, int i3, boolean z2) {
            this.e = true;
            this.g = i2;
            this.h = c.a(charSequence);
            this.i = pendingIntent;
            this.f180a = bundle == null ? new Bundle() : bundle;
            this.f181b = hVarArr;
            this.f182c = hVarArr2;
            this.d = z;
            this.f = i3;
            this.e = z2;
        }

        public PendingIntent a() {
            return this.i;
        }

        public boolean b() {
            return this.d;
        }

        public h[] c() {
            return this.f182c;
        }

        public Bundle d() {
            return this.f180a;
        }

        public int e() {
            return this.g;
        }

        public h[] f() {
            return this.f181b;
        }

        public int g() {
            return this.f;
        }

        public boolean h() {
            return this.e;
        }

        public CharSequence i() {
            return this.h;
        }
    }

    public static class b extends d {
        private CharSequence e;

        public b a(CharSequence charSequence) {
            this.e = c.a(charSequence);
            return this;
        }

        @Override // androidx.core.app.e.d
        public void a(d dVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(dVar.a()).setBigContentTitle(this.f187b).bigText(this.e);
                if (this.d) {
                    bigText.setSummaryText(this.f188c);
                }
            }
        }
    }

    public static class c {
        String A;
        Bundle B;
        int C;
        int D;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        int J;
        String K;
        long L;
        int M;
        Notification N;
        @Deprecated
        public ArrayList<String> O;

        /* renamed from: a  reason: collision with root package name */
        public Context f183a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f184b;

        /* renamed from: c  reason: collision with root package name */
        ArrayList<a> f185c;
        CharSequence d;
        CharSequence e;
        PendingIntent f;
        PendingIntent g;
        RemoteViews h;
        Bitmap i;
        CharSequence j;
        int k;
        int l;
        boolean m;
        boolean n;
        d o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean x;
        boolean y;
        boolean z;

        @Deprecated
        public c(Context context) {
            this(context, null);
        }

        public c(Context context, String str) {
            this.f184b = new ArrayList<>();
            this.f185c = new ArrayList<>();
            this.m = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.M = 0;
            this.N = new Notification();
            this.f183a = context;
            this.I = str;
            this.N.when = System.currentTimeMillis();
            this.N.audioStreamType = -1;
            this.l = 0;
            this.O = new ArrayList<>();
        }

        protected static CharSequence a(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void a(int i2, boolean z2) {
            Notification notification;
            int i3;
            if (z2) {
                notification = this.N;
                i3 = i2 | notification.flags;
            } else {
                notification = this.N;
                i3 = (i2 ^ -1) & notification.flags;
            }
            notification.flags = i3;
        }

        public Notification a() {
            return new f(this).b();
        }

        public c a(int i2) {
            this.l = i2;
            return this;
        }

        public c a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f184b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public c a(long j2) {
            this.N.when = j2;
            return this;
        }

        public c a(PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        public c a(d dVar) {
            if (this.o != dVar) {
                this.o = dVar;
                d dVar2 = this.o;
                if (dVar2 != null) {
                    dVar2.a(this);
                }
            }
            return this;
        }

        public c a(String str) {
            this.I = str;
            return this;
        }

        public c a(boolean z2) {
            a(16, z2);
            return this;
        }

        public Bundle b() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public c b(int i2) {
            this.N.icon = i2;
            return this;
        }

        public c b(CharSequence charSequence) {
            this.e = a(charSequence);
            return this;
        }

        public c b(boolean z2) {
            this.x = z2;
            return this;
        }

        public c c(CharSequence charSequence) {
            this.d = a(charSequence);
            return this;
        }

        public c d(CharSequence charSequence) {
            this.N.tickerText = a(charSequence);
            return this;
        }
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        protected c f186a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f187b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f188c;
        boolean d = false;

        public void a(Bundle bundle) {
        }

        public abstract void a(d dVar);

        public void a(c cVar) {
            if (this.f186a != cVar) {
                this.f186a = cVar;
                c cVar2 = this.f186a;
                if (cVar2 != null) {
                    cVar2.a(this);
                }
            }
        }

        public RemoteViews b(d dVar) {
            return null;
        }

        public RemoteViews c(d dVar) {
            return null;
        }

        public RemoteViews d(d dVar) {
            return null;
        }
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return g.a(notification);
        }
        return null;
    }
}
