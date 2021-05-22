package org.cocos2dx.lib;

import b.d.a.a.d;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import javax.net.ssl.SSLException;

public class Cocos2dxDownloader {
    private static HashMap<String, Boolean> _resumingSupport = new HashMap<>();
    private int _countOfMaxProcessingTasks;
    private d _httpClient = new d();
    private int _id;
    private int _runningTaskCount = 0;
    private HashMap _taskMap = new HashMap();
    private Queue<Runnable> _taskQueue = new LinkedList();
    private String _tempFileNameSufix;

    public static void cancelAllRequests(Cocos2dxDownloader cocos2dxDownloader) {
        Cocos2dxHelper.getActivity().runOnUiThread(new RunnableC2703l(cocos2dxDownloader));
    }

    public static Cocos2dxDownloader createDownloader(int i, int i2, String str, int i3) {
        Cocos2dxDownloader cocos2dxDownloader = new Cocos2dxDownloader();
        cocos2dxDownloader._id = i;
        cocos2dxDownloader._httpClient.a(true);
        if (i2 > 0) {
            cocos2dxDownloader._httpClient.c(i2 * 1000);
        }
        d dVar = cocos2dxDownloader._httpClient;
        d.a(SSLException.class);
        cocos2dxDownloader._httpClient.b(false);
        cocos2dxDownloader._tempFileNameSufix = str;
        cocos2dxDownloader._countOfMaxProcessingTasks = i3;
        return cocos2dxDownloader;
    }

    public static void createTask(Cocos2dxDownloader cocos2dxDownloader, int i, String str, String str2) {
        cocos2dxDownloader.enqueueTask(new RunnableC2701k(str2, cocos2dxDownloader, i, str));
    }

    public static void setResumingSupport(String str, Boolean bool) {
        _resumingSupport.put(str, bool);
    }

    public void enqueueTask(Runnable runnable) {
        synchronized (this._taskQueue) {
            if (this._runningTaskCount < this._countOfMaxProcessingTasks) {
                Cocos2dxHelper.getActivity().runOnUiThread(runnable);
                this._runningTaskCount++;
            } else {
                this._taskQueue.add(runnable);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public native void nativeOnFinish(int i, int i2, int i3, String str, byte[] bArr);

    /* access modifiers changed from: package-private */
    public native void nativeOnProgress(int i, int i2, long j, long j2, long j3);

    public void onFinish(int i, int i2, String str, byte[] bArr) {
        if (((Qa) this._taskMap.get(Integer.valueOf(i))) != null) {
            this._taskMap.remove(Integer.valueOf(i));
            Cocos2dxHelper.runOnGLThread(new RunnableC2697i(this, i, i2, str, bArr));
        }
    }

    /* access modifiers changed from: package-private */
    public void onProgress(int i, long j, long j2, long j3) {
        Qa qa = (Qa) this._taskMap.get(Integer.valueOf(i));
        if (qa != null) {
            qa.f6325c = j;
            qa.d = j2;
            qa.e = j3;
        }
        Cocos2dxHelper.runOnGLThread(new RunnableC2695h(this, i, j, j2, j3));
    }

    public void onStart(int i) {
        Qa qa = (Qa) this._taskMap.get(Integer.valueOf(i));
        if (qa != null) {
            qa.a();
        }
    }

    public void runNextTaskIfExists() {
        synchronized (this._taskQueue) {
            Runnable poll = this._taskQueue.poll();
            if (poll != null) {
                Cocos2dxHelper.getActivity().runOnUiThread(poll);
            } else {
                this._runningTaskCount--;
            }
        }
    }
}
