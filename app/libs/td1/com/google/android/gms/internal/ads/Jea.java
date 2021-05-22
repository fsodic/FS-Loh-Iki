package com.google.android.gms.internal.ads;

public abstract class Jea {
    public static Jea a(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new Cea(cls.getSimpleName()) : new Eea(cls.getSimpleName());
    }

    public abstract void a(String str);
}
