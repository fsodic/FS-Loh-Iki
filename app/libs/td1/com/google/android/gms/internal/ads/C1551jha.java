package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.jha  reason: case insensitive filesystem */
public class C1551jha {

    /* renamed from: a  reason: collision with root package name */
    protected AudioTrack f4703a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4704b;

    /* renamed from: c  reason: collision with root package name */
    private int f4705c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;

    private C1551jha() {
    }

    /* synthetic */ C1551jha(C1345gha gha) {
        this();
    }

    public final void a() {
        if (this.g == -9223372036854775807L) {
            this.f4703a.pause();
        }
    }

    public final void a(long j) {
        this.h = e();
        this.g = SystemClock.elapsedRealtime() * 1000;
        this.i = j;
        this.f4703a.stop();
    }

    public void a(AudioTrack audioTrack, boolean z) {
        this.f4703a = audioTrack;
        this.f4704b = z;
        this.g = -9223372036854775807L;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        if (audioTrack != null) {
            this.f4705c = audioTrack.getSampleRate();
        }
    }

    public boolean b() {
        return false;
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public long d() {
        throw new UnsupportedOperationException();
    }

    public final long e() {
        if (this.g != -9223372036854775807L) {
            return Math.min(this.i, this.h + ((((SystemClock.elapsedRealtime() * 1000) - this.g) * ((long) this.f4705c)) / 1000000));
        }
        int playState = this.f4703a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f4703a.getPlaybackHeadPosition());
        if (this.f4704b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f = this.d;
            }
            playbackHeadPosition += this.f;
        }
        if (this.d > playbackHeadPosition) {
            this.e++;
        }
        this.d = playbackHeadPosition;
        return playbackHeadPosition + (this.e << 32);
    }

    public final long f() {
        return (e() * 1000000) / ((long) this.f4705c);
    }
}
