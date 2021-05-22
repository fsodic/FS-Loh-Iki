package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.va  reason: case insensitive filesystem */
public final class C2363va {

    /* renamed from: a  reason: collision with root package name */
    public static C0986ba<Long> f5813a = C0986ba.a("gads:dynamite_load:fail:sample_rate", 10000L);

    /* renamed from: b  reason: collision with root package name */
    public static C0986ba<Boolean> f5814b = C0986ba.a("gads:report_dynamite_crash_in_background_thread", false);

    /* renamed from: c  reason: collision with root package name */
    public static C0986ba<String> f5815c = C0986ba.a("gads:public_beta:traffic_multiplier", BuildConfig.VERSION_NAME);
    public static C0986ba<String> d = C0986ba.a("gads:sdk_crash_report_class_prefix", "com.google.");
    public static C0986ba<Boolean> e = C0986ba.a("gads:sdk_crash_report_enabled", false);
    public static C0986ba<Boolean> f = C0986ba.a("gads:sdk_crash_report_full_stacktrace", false);
    public static C0986ba<Double> g = C0986ba.a("gads:trapped_exception_sample_rate", 0.01d);
}
