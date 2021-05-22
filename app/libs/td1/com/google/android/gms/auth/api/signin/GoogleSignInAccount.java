package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private static d f1166a = g.d();

    /* renamed from: b  reason: collision with root package name */
    private final int f1167b;

    /* renamed from: c  reason: collision with root package name */
    private String f1168c;
    private String d;
    private String e;
    private String f;
    private Uri g;
    private String h;
    private long i;
    private String j;
    private List<Scope> k;
    private String l;
    private String m;
    private Set<Scope> n = new HashSet();

    GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f1167b = i2;
        this.f1168c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = uri;
        this.h = str5;
        this.i = j2;
        this.j = str6;
        this.k = list;
        this.l = str7;
        this.m = str8;
    }

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount a2 = a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a2.h = jSONObject.optString("serverAuthCode", null);
        return a2;
    }

    private static GoogleSignInAccount a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set<Scope> set) {
        long longValue = (l2 == null ? Long.valueOf(f1166a.a() / 1000) : l2).longValue();
        r.b(str7);
        r.a(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
    }

    public Account L() {
        String str = this.e;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String M() {
        return this.e;
    }

    public String N() {
        return this.m;
    }

    public String O() {
        return this.l;
    }

    public String P() {
        return this.f1168c;
    }

    public String Q() {
        return this.d;
    }

    public Uri R() {
        return this.g;
    }

    public Set<Scope> S() {
        HashSet hashSet = new HashSet(this.k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    public String T() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.j.equals(this.j) && googleSignInAccount.S().equals(S());
    }

    public String getDisplayName() {
        return this.f;
    }

    public int hashCode() {
        return ((this.j.hashCode() + 527) * 31) + S().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1167b);
        c.a(parcel, 2, P(), false);
        c.a(parcel, 3, Q(), false);
        c.a(parcel, 4, M(), false);
        c.a(parcel, 5, getDisplayName(), false);
        c.a(parcel, 6, (Parcelable) R(), i2, false);
        c.a(parcel, 7, T(), false);
        c.a(parcel, 8, this.i);
        c.a(parcel, 9, this.j, false);
        c.c(parcel, 10, this.k, false);
        c.a(parcel, 11, O(), false);
        c.a(parcel, 12, N(), false);
        c.a(parcel, a2);
    }
}
