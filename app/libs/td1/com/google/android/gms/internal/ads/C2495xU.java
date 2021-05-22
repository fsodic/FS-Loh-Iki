package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.xU  reason: case insensitive filesystem */
public final class C2495xU {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5989a;

    /* renamed from: b  reason: collision with root package name */
    private final UT f5990b;

    public C2495xU(Context context, UT ut) {
        this.f5989a = context;
        this.f5990b = ut;
    }

    private final void a(byte[] bArr) {
        if (this.f5990b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("os.arch:");
            sb.append(EnumC2082rV.OS_ARCH.a());
            sb.append(";");
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null) {
                    sb.append("supported_abis:");
                    sb.append(Arrays.toString(strArr));
                    sb.append(";");
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            sb.append("CPU_ABI:");
            sb.append(Build.CPU_ABI);
            sb.append(";");
            sb.append("CPU_ABI2:");
            sb.append(Build.CPU_ABI2);
            sb.append(";");
            if (bArr != null) {
                sb.append("ELF:");
                sb.append(Arrays.toString(bArr));
                sb.append(";");
            }
            this.f5990b.a(4007, sb.toString());
        }
    }

    private final String b() {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String a2 = EnumC2082rV.OS_ARCH.a();
        if (!TextUtils.isEmpty(a2) && hashSet.contains(a2)) {
            return a2;
        }
        String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
        if (strArr != null && strArr.length > 0) {
            return strArr[0];
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    private final EnumC1274fga c() {
        File file = new File(new File(this.f5989a.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            return EnumC1274fga.UNSUPPORTED;
        }
        File[] listFiles = file.listFiles(new _V(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            return EnumC1274fga.UNSUPPORTED;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(listFiles[0]);
            try {
                byte[] bArr = new byte[20];
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        a(bArr);
                        EnumC1274fga fga = EnumC1274fga.UNSUPPORTED;
                        fileInputStream.close();
                        return fga;
                    }
                    bArr2[0] = bArr[19];
                    bArr2[1] = bArr[18];
                    short s = ByteBuffer.wrap(bArr2).getShort();
                    if (s == 3) {
                        EnumC1274fga fga2 = EnumC1274fga.X86;
                        fileInputStream.close();
                        return fga2;
                    } else if (s == 40) {
                        EnumC1274fga fga3 = EnumC1274fga.ARM7;
                        fileInputStream.close();
                        return fga3;
                    } else if (s == 62) {
                        EnumC1274fga fga4 = EnumC1274fga.X86_64;
                        fileInputStream.close();
                        return fga4;
                    } else if (s != 183) {
                        EnumC1274fga fga5 = EnumC1274fga.UNSUPPORTED;
                        fileInputStream.close();
                        return fga5;
                    } else {
                        EnumC1274fga fga6 = EnumC1274fga.ARM64;
                        fileInputStream.close();
                        return fga6;
                    }
                } else {
                    fileInputStream.close();
                    return EnumC1274fga.UNSUPPORTED;
                }
            } catch (Throwable th) {
                C2159sba.a(th, th);
            }
        } catch (IOException unused) {
        }
        throw th;
    }

    public final EnumC1274fga a() {
        EnumC1274fga c2 = c();
        if (c2 != EnumC1274fga.UNSUPPORTED) {
            return c2;
        }
        String b2 = b();
        if (!TextUtils.isEmpty(b2)) {
            if (b2.equalsIgnoreCase("i686") || b2.equalsIgnoreCase("x86")) {
                return EnumC1274fga.X86;
            }
            if (b2.equalsIgnoreCase("x86_64")) {
                return EnumC1274fga.X86_64;
            }
            if (b2.equalsIgnoreCase("arm64-v8a")) {
                return EnumC1274fga.ARM64;
            }
            if (b2.equalsIgnoreCase("armeabi-v7a") || b2.equalsIgnoreCase("armv71")) {
                return EnumC1274fga.ARM7;
            }
        }
        a(null);
        return EnumC1274fga.UNSUPPORTED;
    }
}
