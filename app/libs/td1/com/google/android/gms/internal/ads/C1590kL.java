package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Oma;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.kL  reason: case insensitive filesystem */
public class C1590kL {

    /* renamed from: a  reason: collision with root package name */
    private String f4758a;

    /* renamed from: com.google.android.gms.internal.ads.kL$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f4759a;

        public final a a(String str) {
            this.f4759a = str;
            return this;
        }
    }

    private C1590kL(a aVar) {
        this.f4758a = aVar.f4759a;
    }

    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f4758a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String b() {
        return this.f4758a.toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final Oma.a c() {
        char c2;
        String str = this.f4758a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        return c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? Oma.a.AD_INITIATER_UNSPECIFIED : Oma.a.REWARD_BASED_VIDEO_AD : Oma.a.AD_LOADER : Oma.a.INTERSTITIAL : Oma.a.BANNER;
    }
}
