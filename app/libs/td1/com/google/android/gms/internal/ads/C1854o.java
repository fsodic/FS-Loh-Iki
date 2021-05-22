package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.o  reason: case insensitive filesystem */
public final class C1854o {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<AbstractC1441i<?>> f5094a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Collection<AbstractC1441i<String>> f5095b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Collection<AbstractC1441i<String>> f5096c = new ArrayList();

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC1441i<String> iVar : this.f5095b) {
            String str = (String) C2392voa.e().a(iVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(C2543y.a());
        return arrayList;
    }

    public final void a(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (AbstractC1441i<?> iVar : this.f5094a) {
            if (iVar.b() == 1) {
                iVar.a(editor, iVar.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            C0745Vl.b("Flag Json is null.");
        }
    }

    public final void a(AbstractC1441i iVar) {
        this.f5094a.add(iVar);
    }

    public final List<String> b() {
        List<String> a2 = a();
        for (AbstractC1441i<String> iVar : this.f5096c) {
            String str = (String) C2392voa.e().a(iVar);
            if (!TextUtils.isEmpty(str)) {
                a2.add(str);
            }
        }
        a2.addAll(C2543y.b());
        return a2;
    }

    public final void b(AbstractC1441i<String> iVar) {
        this.f5095b.add(iVar);
    }

    public final void c(AbstractC1441i<String> iVar) {
        this.f5096c.add(iVar);
    }
}
