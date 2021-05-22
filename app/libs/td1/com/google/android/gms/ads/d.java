package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.b.g;
import com.google.android.gms.ads.b.h;
import com.google.android.gms.ads.b.i;
import com.google.android.gms.ads.b.k;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.BinderC1265fc;
import com.google.android.gms.internal.ads.BinderC1334gc;
import com.google.android.gms.internal.ads.BinderC1403hc;
import com.google.android.gms.internal.ads.BinderC1684lf;
import com.google.android.gms.internal.ads.C0578Pa;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C0990bc;
import com.google.android.gms.internal.ads.C2392voa;
import com.google.android.gms.internal.ads.Doa;
import com.google.android.gms.internal.ads.Eoa;
import com.google.android.gms.internal.ads.Fpa;
import com.google.android.gms.internal.ads.Vna;
import com.google.android.gms.internal.ads._na;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final _na f1054a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1055b;

    /* renamed from: c  reason: collision with root package name */
    private final Doa f1056c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f1057a;

        /* renamed from: b  reason: collision with root package name */
        private final Eoa f1058b;

        private a(Context context, Eoa eoa) {
            this.f1057a = context;
            this.f1058b = eoa;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Context context, String str) {
            this(context, C2392voa.b().a(context, str, new BinderC1684lf()));
            r.a(context, "context cannot be null");
        }

        public a a(com.google.android.gms.ads.b.d dVar) {
            try {
                this.f1058b.a(new C0578Pa(dVar));
            } catch (RemoteException e) {
                C0745Vl.c("Failed to specify native ad options", e);
            }
            return this;
        }

        @Deprecated
        public a a(g.a aVar) {
            try {
                this.f1058b.a(new BinderC1334gc(aVar));
            } catch (RemoteException e) {
                C0745Vl.c("Failed to add app install ad listener", e);
            }
            return this;
        }

        @Deprecated
        public a a(h.a aVar) {
            try {
                this.f1058b.a(new BinderC1265fc(aVar));
            } catch (RemoteException e) {
                C0745Vl.c("Failed to add content ad listener", e);
            }
            return this;
        }

        public a a(k.a aVar) {
            try {
                this.f1058b.a(new BinderC1403hc(aVar));
            } catch (RemoteException e) {
                C0745Vl.c("Failed to add google native ad listener", e);
            }
            return this;
        }

        public a a(c cVar) {
            try {
                this.f1058b.a(new Vna(cVar));
            } catch (RemoteException e) {
                C0745Vl.c("Failed to set AdListener.", e);
            }
            return this;
        }

        public a a(String str, i.b bVar, i.a aVar) {
            C0990bc bcVar = new C0990bc(bVar, aVar);
            try {
                this.f1058b.a(str, bcVar.a(), bcVar.b());
            } catch (RemoteException e) {
                C0745Vl.c("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public d a() {
            try {
                return new d(this.f1057a, this.f1058b.sb());
            } catch (RemoteException e) {
                C0745Vl.b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    d(Context context, Doa doa) {
        this(context, doa, _na.f3764a);
    }

    private d(Context context, Doa doa, _na _na) {
        this.f1055b = context;
        this.f1056c = doa;
        this.f1054a = _na;
    }

    private final void a(Fpa fpa) {
        try {
            this.f1056c.b(_na.a(this.f1055b, fpa));
        } catch (RemoteException e) {
            C0745Vl.b("Failed to load ad.", e);
        }
    }

    public void a(e eVar) {
        a(eVar.a());
    }
}
