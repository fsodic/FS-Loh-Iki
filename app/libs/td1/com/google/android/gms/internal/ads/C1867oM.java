package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.oM  reason: case insensitive filesystem */
public final class C1867oM implements AbstractC1180eO<C1660lM> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f5114a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5115b;

    public C1867oM(VW vw, Context context) {
        this.f5114a = vw;
        this.f5115b = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C1660lM> a() {
        return this.f5114a.a(new CallableC1798nM(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1660lM b() {
        AudioManager audioManager = (AudioManager) this.f5115b.getSystemService("audio");
        return new C1660lM(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), q.h().a(), q.h().b());
    }
}
