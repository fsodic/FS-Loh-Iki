package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* access modifiers changed from: package-private */
@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.iha  reason: case insensitive filesystem */
public final class C1482iha extends C1551jha {
    private final AudioTimestamp j = new AudioTimestamp();
    private long k;
    private long l;
    private long m;

    public C1482iha() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.C1551jha
    public final void a(AudioTrack audioTrack, boolean z) {
        super.a(audioTrack, z);
        this.k = 0;
        this.l = 0;
        this.m = 0;
    }

    @Override // com.google.android.gms.internal.ads.C1551jha
    public final boolean b() {
        boolean timestamp = this.f4703a.getTimestamp(this.j);
        if (timestamp) {
            long j2 = this.j.framePosition;
            if (this.l > j2) {
                this.k++;
            }
            this.l = j2;
            this.m = j2 + (this.k << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.C1551jha
    public final long c() {
        return this.j.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.C1551jha
    public final long d() {
        return this.m;
    }
}
