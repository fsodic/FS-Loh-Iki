package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.Yia;

/* access modifiers changed from: package-private */
public final class Bia {
    private static final int A = Jka.d("sosn");
    private static final int B = Jka.d("tvsh");
    private static final int C = Jka.d("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a  reason: collision with root package name */
    private static final int f1638a = Jka.d("nam");

    /* renamed from: b  reason: collision with root package name */
    private static final int f1639b = Jka.d("trk");

    /* renamed from: c  reason: collision with root package name */
    private static final int f1640c = Jka.d("cmt");
    private static final int d = Jka.d("day");
    private static final int e = Jka.d("ART");
    private static final int f = Jka.d("too");
    private static final int g = Jka.d("alb");
    private static final int h = Jka.d("com");
    private static final int i = Jka.d("wrt");
    private static final int j = Jka.d("lyr");
    private static final int k = Jka.d("gen");
    private static final int l = Jka.d("covr");
    private static final int m = Jka.d("gnre");
    private static final int n = Jka.d("grp");
    private static final int o = Jka.d("disk");
    private static final int p = Jka.d("trkn");
    private static final int q = Jka.d("tmpo");
    private static final int r = Jka.d("cpil");
    private static final int s = Jka.d("aART");
    private static final int t = Jka.d("sonm");
    private static final int u = Jka.d("soal");
    private static final int v = Jka.d("soar");
    private static final int w = Jka.d("soaa");
    private static final int x = Jka.d("soco");
    private static final int y = Jka.d("rtng");
    private static final int z = Jka.d("pgap");

    public static Yia.a a(Dka dka) {
        String str;
        C1143dja dja;
        int b2 = dka.b() + dka.d();
        int d2 = dka.d();
        int i2 = d2 >>> 24;
        Yia.a aVar = null;
        if (i2 == 169 || i2 == 65533) {
            int i3 = 16777215 & d2;
            if (i3 == f1640c) {
                int d3 = dka.d();
                if (dka.d() == C1691lia.Fa) {
                    dka.d(8);
                    String e2 = dka.e(d3 - 16);
                    aVar = new _ia("und", e2, e2);
                } else {
                    String valueOf = String.valueOf(C1691lia.c(d2));
                    Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                }
                dka.c(b2);
                return aVar;
            } else if (i3 == f1638a || i3 == f1639b) {
                C1143dja a2 = a(d2, "TIT2", dka);
                dka.c(b2);
                return a2;
            } else if (i3 == h || i3 == i) {
                C1143dja a3 = a(d2, "TCOM", dka);
                dka.c(b2);
                return a3;
            } else if (i3 == d) {
                C1143dja a4 = a(d2, "TDRC", dka);
                dka.c(b2);
                return a4;
            } else if (i3 == e) {
                C1143dja a5 = a(d2, "TPE1", dka);
                dka.c(b2);
                return a5;
            } else if (i3 == f) {
                C1143dja a6 = a(d2, "TSSE", dka);
                dka.c(b2);
                return a6;
            } else if (i3 == g) {
                C1143dja a7 = a(d2, "TALB", dka);
                dka.c(b2);
                return a7;
            } else if (i3 == j) {
                C1143dja a8 = a(d2, "USLT", dka);
                dka.c(b2);
                return a8;
            } else if (i3 == k) {
                C1143dja a9 = a(d2, "TCON", dka);
                dka.c(b2);
                return a9;
            } else if (i3 == n) {
                C1143dja a10 = a(d2, "TIT1", dka);
                dka.c(b2);
                return a10;
            }
        } else {
            try {
                if (d2 == m) {
                    int b3 = b(dka);
                    String str2 = (b3 <= 0 || b3 > D.length) ? null : D[b3 - 1];
                    if (str2 != null) {
                        dja = new C1143dja("TCON", null, str2);
                    } else {
                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                        dja = null;
                    }
                    return dja;
                } else if (d2 == o) {
                    C1143dja b4 = b(d2, "TPOS", dka);
                    dka.c(b2);
                    return b4;
                } else if (d2 == p) {
                    C1143dja b5 = b(d2, "TRCK", dka);
                    dka.c(b2);
                    return b5;
                } else if (d2 == q) {
                    AbstractC1211eja a11 = a(d2, "TBPM", dka, true, false);
                    dka.c(b2);
                    return a11;
                } else if (d2 == r) {
                    AbstractC1211eja a12 = a(d2, "TCMP", dka, true, true);
                    dka.c(b2);
                    return a12;
                } else if (d2 == l) {
                    int d4 = dka.d();
                    if (dka.d() == C1691lia.Fa) {
                        int b6 = C1691lia.b(dka.d());
                        String str3 = b6 == 13 ? "image/jpeg" : b6 == 14 ? "image/png" : null;
                        if (str3 == null) {
                            StringBuilder sb = new StringBuilder(41);
                            sb.append("Unrecognized cover art flags: ");
                            sb.append(b6);
                            str = sb.toString();
                        } else {
                            dka.d(4);
                            byte[] bArr = new byte[(d4 - 16)];
                            dka.a(bArr, 0, bArr.length);
                            aVar = new Zia(str3, null, 3, bArr);
                            dka.c(b2);
                            return aVar;
                        }
                    } else {
                        str = "Failed to parse cover art attribute";
                    }
                    Log.w("MetadataUtil", str);
                    dka.c(b2);
                    return aVar;
                } else if (d2 == s) {
                    C1143dja a13 = a(d2, "TPE2", dka);
                    dka.c(b2);
                    return a13;
                } else if (d2 == t) {
                    C1143dja a14 = a(d2, "TSOT", dka);
                    dka.c(b2);
                    return a14;
                } else if (d2 == u) {
                    C1143dja a15 = a(d2, "TSO2", dka);
                    dka.c(b2);
                    return a15;
                } else if (d2 == v) {
                    C1143dja a16 = a(d2, "TSOA", dka);
                    dka.c(b2);
                    return a16;
                } else if (d2 == w) {
                    C1143dja a17 = a(d2, "TSOP", dka);
                    dka.c(b2);
                    return a17;
                } else if (d2 == x) {
                    C1143dja a18 = a(d2, "TSOC", dka);
                    dka.c(b2);
                    return a18;
                } else if (d2 == y) {
                    AbstractC1211eja a19 = a(d2, "ITUNESADVISORY", dka, false, false);
                    dka.c(b2);
                    return a19;
                } else if (d2 == z) {
                    AbstractC1211eja a20 = a(d2, "ITUNESGAPLESS", dka, false, true);
                    dka.c(b2);
                    return a20;
                } else if (d2 == A) {
                    C1143dja a21 = a(d2, "TVSHOWSORT", dka);
                    dka.c(b2);
                    return a21;
                } else if (d2 == B) {
                    C1143dja a22 = a(d2, "TVSHOW", dka);
                    dka.c(b2);
                    return a22;
                } else if (d2 == C) {
                    String str4 = null;
                    String str5 = null;
                    int i4 = -1;
                    int i5 = -1;
                    while (dka.b() < b2) {
                        int b7 = dka.b();
                        int d5 = dka.d();
                        int d6 = dka.d();
                        dka.d(4);
                        if (d6 == C1691lia.Da) {
                            str4 = dka.e(d5 - 12);
                        } else if (d6 == C1691lia.Ea) {
                            str5 = dka.e(d5 - 12);
                        } else {
                            if (d6 == C1691lia.Fa) {
                                i4 = b7;
                                i5 = d5;
                            }
                            dka.d(d5 - 12);
                        }
                    }
                    if ("com.apple.iTunes".equals(str4) && "iTunSMPB".equals(str5) && i4 != -1) {
                        dka.c(i4);
                        dka.d(16);
                        aVar = new _ia("und", str5, dka.e(i5 - 16));
                    }
                    dka.c(b2);
                    return aVar;
                }
            } finally {
                dka.c(b2);
            }
        }
        String valueOf2 = String.valueOf(C1691lia.c(d2));
        Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
        dka.c(b2);
        return null;
    }

    private static C1143dja a(int i2, String str, Dka dka) {
        int d2 = dka.d();
        if (dka.d() == C1691lia.Fa) {
            dka.d(8);
            return new C1143dja(str, null, dka.e(d2 - 16));
        }
        String valueOf = String.valueOf(C1691lia.c(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static AbstractC1211eja a(int i2, String str, Dka dka, boolean z2, boolean z3) {
        int b2 = b(dka);
        if (z3) {
            b2 = Math.min(1, b2);
        }
        if (b2 >= 0) {
            return z2 ? new C1143dja(str, null, Integer.toString(b2)) : new _ia("und", str, Integer.toString(b2));
        }
        String valueOf = String.valueOf(C1691lia.c(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static int b(Dka dka) {
        dka.d(4);
        if (dka.d() == C1691lia.Fa) {
            dka.d(8);
            return dka.g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static C1143dja b(int i2, String str, Dka dka) {
        int d2 = dka.d();
        if (dka.d() == C1691lia.Fa && d2 >= 22) {
            dka.d(10);
            int h2 = dka.h();
            if (h2 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(h2);
                String sb2 = sb.toString();
                int h3 = dka.h();
                if (h3 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(h3);
                    sb2 = sb3.toString();
                }
                return new C1143dja(str, null, sb2);
            }
        }
        String valueOf2 = String.valueOf(C1691lia.c(i2));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }
}
