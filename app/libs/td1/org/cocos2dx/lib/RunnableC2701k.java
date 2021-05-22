package org.cocos2dx.lib;

import b.d.a.a.q;
import c.a.a.a.AbstractC0121e;
import c.a.a.a.k.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

/* renamed from: org.cocos2dx.lib.k  reason: case insensitive filesystem */
class RunnableC2701k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6387a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Cocos2dxDownloader f6388b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6389c;
    final /* synthetic */ String d;

    RunnableC2701k(String str, Cocos2dxDownloader cocos2dxDownloader, int i, String str2) {
        this.f6387a = str;
        this.f6388b = cocos2dxDownloader;
        this.f6389c = i;
        this.d = str2;
    }

    public void run() {
        q a2;
        Qa qa = new Qa();
        if (this.f6387a.length() == 0) {
            qa.f6324b = new Pa(this.f6388b, this.f6389c);
            qa.f6323a = Cocos2dxDownloader.access$100(this.f6388b).a(Cocos2dxHelper.getActivity(), this.d, qa.f6324b);
        }
        if (this.f6387a.length() != 0) {
            try {
                String host = new URI(this.d).getHost();
                if (host.startsWith("www.")) {
                    host = host.substring(4);
                }
                Boolean bool = false;
                Boolean bool2 = true;
                if (Cocos2dxDownloader.access$200().containsKey(host)) {
                    bool = (Boolean) Cocos2dxDownloader.access$200().get(host);
                    bool2 = false;
                }
                if (bool2.booleanValue()) {
                    qa.f6324b = new Wa(this.f6388b, this.f6389c, host, this.d, this.f6387a);
                    a2 = Cocos2dxDownloader.access$100(this.f6388b).b(Cocos2dxHelper.getActivity(), this.d, null, null, qa.f6324b);
                } else {
                    File file = new File(this.f6387a + Cocos2dxDownloader.access$300(this.f6388b));
                    if (!file.isDirectory()) {
                        File parentFile = file.getParentFile();
                        if (parentFile.isDirectory() || parentFile.mkdirs()) {
                            File file2 = new File(this.f6387a);
                            if (!file2.isDirectory()) {
                                qa.f6324b = new Ra(this.f6388b, this.f6389c, file, file2);
                                AbstractC0121e[] eVarArr = null;
                                long length = file.length();
                                if (bool.booleanValue() && length > 0) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(new b("Range", "bytes=" + length + "-"));
                                    eVarArr = (AbstractC0121e[]) arrayList.toArray(new AbstractC0121e[arrayList.size()]);
                                } else if (length > 0) {
                                    try {
                                        PrintWriter printWriter = new PrintWriter(file);
                                        printWriter.print(BuildConfig.FLAVOR);
                                        printWriter.close();
                                    } catch (FileNotFoundException unused) {
                                    }
                                }
                                a2 = Cocos2dxDownloader.access$100(this.f6388b).a(Cocos2dxHelper.getActivity(), this.d, eVarArr, null, qa.f6324b);
                            }
                        }
                    }
                }
                qa.f6323a = a2;
            } catch (URISyntaxException unused2) {
            }
        }
        if (qa.f6323a == null) {
            Cocos2dxHelper.runOnGLThread(new RunnableC2699j(this, "Can't create DownloadTask for " + this.d));
            return;
        }
        Cocos2dxDownloader.access$400(this.f6388b).put(Integer.valueOf(this.f6389c), qa);
    }
}
