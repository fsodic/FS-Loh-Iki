package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.p  reason: case insensitive filesystem */
public final class C1923p extends AbstractC1441i<String> {
    C1923p(int i, String str, String str2) {
        super(i, str, str2, null);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC1441i
    public final /* synthetic */ String a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(a(), (String) c());
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC1441i
    public final /* synthetic */ String a(Bundle bundle) {
        String valueOf = String.valueOf(a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (String) c();
        }
        String valueOf2 = String.valueOf(a());
        return bundle.getString(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag."));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC1441i
    public final /* synthetic */ String a(JSONObject jSONObject) {
        return jSONObject.optString(a(), (String) c());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC1441i
    public final /* synthetic */ void a(SharedPreferences.Editor editor, String str) {
        editor.putString(a(), str);
    }
}
