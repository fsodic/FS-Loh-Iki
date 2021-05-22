package com.google.android.gms.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f1153a = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: b  reason: collision with root package name */
    private final int f1154b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1155c;
    private final String d;
    private final List<String> e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f1156a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f1157b = -1;

        /* renamed from: c  reason: collision with root package name */
        private String f1158c = null;
        private final List<String> d = new ArrayList();

        public q a() {
            return new q(this.f1156a, this.f1157b, this.f1158c, this.d);
        }
    }

    private q(int i, int i2, String str, List<String> list) {
        this.f1154b = i;
        this.f1155c = i2;
        this.d = str;
        this.e = list;
    }

    public String a() {
        String str = this.d;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int b() {
        return this.f1154b;
    }

    public int c() {
        return this.f1155c;
    }

    public List<String> d() {
        return new ArrayList(this.e);
    }
}
