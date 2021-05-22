package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.Pd  reason: case insensitive filesystem */
public class C0581Pd<ReferenceT> implements AbstractC0503Md {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, CopyOnWriteArrayList<AbstractC0268Dc<? super ReferenceT>>> f2852a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private ReferenceT f2853b;

    private final synchronized void b(String str, Map<String, String> map) {
        if (C0745Vl.a(2)) {
            String valueOf = String.valueOf(str);
            C1763mk.f(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                C1763mk.f(sb.toString());
            }
        }
        CopyOnWriteArrayList<AbstractC0268Dc<? super ReferenceT>> copyOnWriteArrayList = this.f2852a.get(str);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            if (((Boolean) C2392voa.e().a(C2474x.Fe)).booleanValue() && q.g().c() != null) {
                C0875_l.f3755a.execute(new RunnableC0633Rd(str));
                return;
            }
            return;
        }
        Iterator<AbstractC0268Dc<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0875_l.e.execute(new RunnableC0555Od(this, it.next(), map));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AbstractC0268Dc dc, Map map) {
        dc.a(this.f2853b, map);
    }

    public final void a(ReferenceT referencet) {
        this.f2853b = referencet;
    }

    public final synchronized void a(String str, p<AbstractC0268Dc<? super ReferenceT>> pVar) {
        CopyOnWriteArrayList<AbstractC0268Dc<? super ReferenceT>> copyOnWriteArrayList = this.f2852a.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC0268Dc<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                AbstractC0268Dc<? super ReferenceT> next = it.next();
                if (pVar.apply(next)) {
                    arrayList.add(next);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    public final synchronized void a(String str, AbstractC0268Dc<? super ReferenceT> dc) {
        CopyOnWriteArrayList<AbstractC0268Dc<? super ReferenceT>> copyOnWriteArrayList = this.f2852a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f2852a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(dc);
    }

    public final boolean a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        b(uri);
        return true;
    }

    public final synchronized void b() {
        this.f2852a.clear();
    }

    public final void b(Uri uri) {
        String path = uri.getPath();
        q.c();
        b(path, C2452wk.b(uri));
    }

    public final synchronized void b(String str, AbstractC0268Dc<? super ReferenceT> dc) {
        CopyOnWriteArrayList<AbstractC0268Dc<? super ReferenceT>> copyOnWriteArrayList = this.f2852a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(dc);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0503Md
    public final boolean b(String str) {
        return str != null && a(Uri.parse(str));
    }
}
