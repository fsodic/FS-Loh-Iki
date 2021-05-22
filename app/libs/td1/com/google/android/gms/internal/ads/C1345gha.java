package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.gha  reason: case insensitive filesystem */
public final class C1345gha extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AudioTrack f4408a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1414hha f4409b;

    C1345gha(C1414hha hha, AudioTrack audioTrack) {
        this.f4409b = hha;
        this.f4408a = audioTrack;
    }

    public final void run() {
        try {
            this.f4408a.flush();
            this.f4408a.release();
        } finally {
            this.f4409b.f.open();
        }
    }
}
