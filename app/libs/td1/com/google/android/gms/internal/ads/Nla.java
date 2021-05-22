package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import org.cocos2dx.lib.BuildConfig;

public final class Nla {

    /* renamed from: a  reason: collision with root package name */
    private final int f2695a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2696b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2697c;
    private final Kla d = new Rla();

    public Nla(int i) {
        this.f2696b = i;
        this.f2695a = 6;
        this.f2697c = 0;
    }

    private final String a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return BuildConfig.FLAVOR;
        }
        Pla pla = new Pla();
        PriorityQueue priorityQueue = new PriorityQueue(this.f2696b, new Mla(this));
        for (String str2 : split) {
            String[] a2 = Ola.a(str2, false);
            if (a2.length != 0) {
                Tla.a(a2, this.f2696b, this.f2695a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                pla.a(this.d.a(((Sla) it.next()).f3123b));
            } catch (IOException e) {
                C0745Vl.b("Error while writing hash to byteStream", e);
            }
        }
        return pla.toString();
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return a(sb.toString());
    }
}
