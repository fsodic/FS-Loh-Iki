package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.C0944ana;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Dma {

    /* renamed from: a  reason: collision with root package name */
    private final Hma f1816a;

    /* renamed from: b  reason: collision with root package name */
    private final C0944ana.a f1817b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1818c;

    private Dma() {
        this.f1817b = C0944ana.q();
        this.f1818c = false;
        this.f1816a = new Hma();
    }

    public Dma(Hma hma) {
        this.f1817b = C0944ana.q();
        this.f1816a = hma;
        this.f1818c = ((Boolean) C2392voa.e().a(C2474x.Wc)).booleanValue();
    }

    public static Dma a() {
        return new Dma();
    }

    private static List<Long> b() {
        List<String> b2 = C2474x.b();
        ArrayList arrayList = new ArrayList();
        for (String str : b2) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    C1763mk.f("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    private final synchronized void b(Fma fma) {
        C0944ana.a aVar = this.f1817b;
        aVar.n();
        aVar.a(b());
        Lma a2 = this.f1816a.a(((C0944ana) ((AbstractC2092rca) this.f1817b.j())).f());
        a2.b(fma.a());
        a2.a();
        String valueOf = String.valueOf(Integer.toString(fma.a(), 10));
        C1763mk.f(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void c(Fma fma) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(d(fma).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        C1763mk.f("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    C1763mk.f("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        C1763mk.f("Could not close Clearcut output stream.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                        C1763mk.f("Could not close Clearcut output stream.");
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused5) {
                C1763mk.f("Could not find file for Clearcut");
            }
        }
    }

    private final synchronized String d(Fma fma) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f1817b.k(), Long.valueOf(q.j().b()), Integer.valueOf(fma.a()), Base64.encodeToString(((C0944ana) ((AbstractC2092rca) this.f1817b.j())).f(), 3));
    }

    public final synchronized void a(Fma fma) {
        if (this.f1818c) {
            if (((Boolean) C2392voa.e().a(C2474x.Xc)).booleanValue()) {
                c(fma);
            } else {
                b(fma);
            }
        }
    }

    public final synchronized void a(Gma gma) {
        if (this.f1818c) {
            try {
                gma.a(this.f1817b);
            } catch (NullPointerException e) {
                q.g().a(e, "AdMobClearcutLogger.modify");
            }
        }
    }
}
