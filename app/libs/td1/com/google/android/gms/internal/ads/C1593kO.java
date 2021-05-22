package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import b.c.b.a.b.d.c;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.kO  reason: case insensitive filesystem */
public final class C1593kO implements AbstractC1180eO<C1387hO> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f4762a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4763b;

    public C1593kO(VW vw, Context context) {
        this.f4762a = vw;
        this.f4763b = context;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    private static String a(Context context) {
        try {
            PackageInfo b2 = c.a(context).b("com.android.vending", 128);
            if (b2 != null) {
                int i = b2.versionCode;
                String str = b2.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String a(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a2 = a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a2 == null || (activityInfo = a2.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo b2 = c.a(context).b(activityInfo.packageName, 0);
            if (b2 != null) {
                int i = b2.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C1387hO> a() {
        return this.f4762a.a(new CallableC1524jO(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1387hO b() {
        boolean z;
        PackageManager packageManager = this.f4763b.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z2 = a(packageManager, "geo:0,0?q=donuts") != null;
        boolean z3 = a(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        boolean startsWith = Build.DEVICE.startsWith("generic");
        boolean a2 = h.a(this.f4763b);
        boolean b2 = h.b(this.f4763b);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i = 0; i < localeList.size(); i++) {
                arrayList.add(localeList.get(i).getLanguage());
            }
        }
        String a3 = a(this.f4763b, packageManager);
        String a4 = a(this.f4763b);
        String str = Build.FINGERPRINT;
        Context context = this.f4763b;
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (!(queryIntentActivities == null || resolveActivity == null)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= queryIntentActivities.size()) {
                        break;
                    } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                        z = resolveActivity.activityInfo.packageName.equals(C0997bfa.a(context));
                        break;
                    } else {
                        i2++;
                    }
                }
                return new C1387hO(z2, z3, country, startsWith, a2, b2, language, arrayList, a3, a4, str, z, Build.MODEL, q.e().e());
            }
        }
        z = false;
        return new C1387hO(z2, z3, country, startsWith, a2, b2, language, arrayList, a3, a4, str, z, Build.MODEL, q.e().e());
    }
}
