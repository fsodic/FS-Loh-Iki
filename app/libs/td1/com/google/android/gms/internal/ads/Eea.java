package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class Eea extends Jea {

    /* renamed from: a  reason: collision with root package name */
    private Logger f1877a;

    public Eea(String str) {
        this.f1877a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.Jea
    public final void a(String str) {
        this.f1877a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
