package org.cocos2dx.lib;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import org.cocos2dx.lib.Cocos2dxVideoView;

public class Cocos2dxVideoHelper {
    static final int KeyEventBack = 1000;
    private static final int VideoTaskCreate = 0;
    private static final int VideoTaskFullScreen = 12;
    private static final int VideoTaskKeepRatio = 11;
    private static final int VideoTaskPause = 5;
    private static final int VideoTaskRemove = 1;
    private static final int VideoTaskRestart = 10;
    private static final int VideoTaskResume = 6;
    private static final int VideoTaskSeek = 8;
    private static final int VideoTaskSetRect = 3;
    private static final int VideoTaskSetSource = 2;
    private static final int VideoTaskSetVisible = 9;
    private static final int VideoTaskStart = 4;
    private static final int VideoTaskStop = 7;
    static b mVideoHandler;
    private static int videoTag;
    private Cocos2dxActivity mActivity = null;
    private FrameLayout mLayout = null;
    private SparseArray<Cocos2dxVideoView> sVideoViews = null;
    Cocos2dxVideoView.OnVideoEventListener videoEventListener = new C2702ka(this);

    /* access modifiers changed from: private */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f6264a;

        /* renamed from: b  reason: collision with root package name */
        private int f6265b;

        public a(int i, int i2) {
            this.f6264a = i;
            this.f6265b = i2;
        }

        public void run() {
            Cocos2dxVideoHelper.nativeExecuteVideoCallback(this.f6264a, this.f6265b);
        }
    }

    static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<Cocos2dxVideoHelper> f6267a;

        b(Cocos2dxVideoHelper cocos2dxVideoHelper) {
            this.f6267a = new WeakReference<>(cocos2dxVideoHelper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1000) {
                switch (i) {
                    case 0:
                        this.f6267a.get()._createVideoView(message.arg1);
                        break;
                    case 1:
                        this.f6267a.get()._removeVideoView(message.arg1);
                        break;
                    case 2:
                        this.f6267a.get()._setVideoURL(message.arg1, message.arg2, (String) message.obj);
                        break;
                    case 3:
                        Cocos2dxVideoHelper cocos2dxVideoHelper = this.f6267a.get();
                        Rect rect = (Rect) message.obj;
                        cocos2dxVideoHelper._setVideoRect(message.arg1, rect.left, rect.top, rect.right, rect.bottom);
                        break;
                    case 4:
                        this.f6267a.get()._startVideo(message.arg1);
                        break;
                    case 5:
                        this.f6267a.get()._pauseVideo(message.arg1);
                        break;
                    case 6:
                        this.f6267a.get()._resumeVideo(message.arg1);
                        break;
                    case 7:
                        this.f6267a.get()._stopVideo(message.arg1);
                        break;
                    case Cocos2dxVideoHelper.VideoTaskSeek /*{ENCODED_INT: 8}*/:
                        this.f6267a.get()._seekVideoTo(message.arg1, message.arg2);
                        break;
                    case Cocos2dxVideoHelper.VideoTaskSetVisible /*{ENCODED_INT: 9}*/:
                        Cocos2dxVideoHelper cocos2dxVideoHelper2 = this.f6267a.get();
                        if (message.arg2 != 1) {
                            cocos2dxVideoHelper2._setVideoVisible(message.arg1, false);
                            break;
                        } else {
                            cocos2dxVideoHelper2._setVideoVisible(message.arg1, true);
                            break;
                        }
                    case Cocos2dxVideoHelper.VideoTaskRestart /*{ENCODED_INT: 10}*/:
                        this.f6267a.get()._restartVideo(message.arg1);
                        break;
                    case Cocos2dxVideoHelper.VideoTaskKeepRatio /*{ENCODED_INT: 11}*/:
                        Cocos2dxVideoHelper cocos2dxVideoHelper3 = this.f6267a.get();
                        if (message.arg2 != 1) {
                            cocos2dxVideoHelper3._setVideoKeepRatio(message.arg1, false);
                            break;
                        } else {
                            cocos2dxVideoHelper3._setVideoKeepRatio(message.arg1, true);
                            break;
                        }
                    case Cocos2dxVideoHelper.VideoTaskFullScreen /*{ENCODED_INT: 12}*/:
                        Cocos2dxVideoHelper cocos2dxVideoHelper4 = this.f6267a.get();
                        Rect rect2 = (Rect) message.obj;
                        if (message.arg2 != 1) {
                            cocos2dxVideoHelper4._setFullScreenEnabled(message.arg1, false, rect2.right, rect2.bottom);
                            break;
                        } else {
                            cocos2dxVideoHelper4._setFullScreenEnabled(message.arg1, true, rect2.right, rect2.bottom);
                            break;
                        }
                }
            } else {
                this.f6267a.get().onBackKeyEvent();
            }
            super.handleMessage(message);
        }
    }

    Cocos2dxVideoHelper(Cocos2dxActivity cocos2dxActivity, FrameLayout frameLayout) {
        this.mActivity = cocos2dxActivity;
        this.mLayout = frameLayout;
        mVideoHandler = new b(this);
        this.sVideoViews = new SparseArray<>();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _createVideoView(int i) {
        Cocos2dxVideoView cocos2dxVideoView = new Cocos2dxVideoView(this.mActivity, i);
        this.sVideoViews.put(i, cocos2dxVideoView);
        this.mLayout.addView(cocos2dxVideoView, new FrameLayout.LayoutParams(-2, -2));
        cocos2dxVideoView.setZOrderOnTop(true);
        cocos2dxVideoView.setOnCompletionListener(this.videoEventListener);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _pauseVideo(int i) {
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.pause();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _removeVideoView(int i) {
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.stopPlayback();
            this.sVideoViews.remove(i);
            this.mLayout.removeView(cocos2dxVideoView);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _restartVideo(int i) {
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.restart();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _resumeVideo(int i) {
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.resume();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _seekVideoTo(int i, int i2) {
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.seekTo(i2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _setFullScreenEnabled(int i, boolean z, int i2, int i3) {
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.setFullScreenEnabled(z, i2, i3);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _setVideoKeepRatio(int i, boolean z) {
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.setKeepRatio(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _setVideoRect(int i, int i2, int i3, int i4, int i5) {
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.setVideoRect(i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _setVideoURL(int i, int i2, String str) {
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView == null) {
            return;
        }
        if (i2 == 0) {
            cocos2dxVideoView.setVideoFileName(str);
        } else if (i2 == 1) {
            cocos2dxVideoView.setVideoURL(str);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _setVideoVisible(int i, boolean z) {
        int i2;
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            if (z) {
                cocos2dxVideoView.fixSize();
                i2 = 0;
            } else {
                i2 = 4;
            }
            cocos2dxVideoView.setVisibility(i2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _startVideo(int i) {
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.start();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void _stopVideo(int i) {
        Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.stop();
        }
    }

    public static int createVideoWidget() {
        Message message = new Message();
        message.what = 0;
        message.arg1 = videoTag;
        mVideoHandler.sendMessage(message);
        int i = videoTag;
        videoTag = i + 1;
        return i;
    }

    public static native void nativeExecuteVideoCallback(int i, int i2);

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void onBackKeyEvent() {
        int size = this.sVideoViews.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.sVideoViews.keyAt(i);
            Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(keyAt);
            if (cocos2dxVideoView != null) {
                cocos2dxVideoView.setFullScreenEnabled(false, 0, 0);
                this.mActivity.runOnGLThread(new a(keyAt, 1000));
            }
        }
    }

    public static void pauseVideo(int i) {
        Message message = new Message();
        message.what = 5;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void removeVideoWidget(int i) {
        Message message = new Message();
        message.what = 1;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void restartVideo(int i) {
        Message message = new Message();
        message.what = VideoTaskRestart;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void resumeVideo(int i) {
        Message message = new Message();
        message.what = 6;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void seekVideoTo(int i, int i2) {
        Message message = new Message();
        message.what = VideoTaskSeek;
        message.arg1 = i;
        message.arg2 = i2;
        mVideoHandler.sendMessage(message);
    }

    public static void setFullScreenEnabled(int i, boolean z, int i2, int i3) {
        Message message = new Message();
        message.what = VideoTaskFullScreen;
        message.arg1 = i;
        if (z) {
            message.arg2 = 1;
        } else {
            message.arg2 = 0;
        }
        message.obj = new Rect(0, 0, i2, i3);
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoKeepRatioEnabled(int i, boolean z) {
        Message message = new Message();
        message.what = VideoTaskKeepRatio;
        message.arg1 = i;
        message.arg2 = z ? 1 : 0;
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoRect(int i, int i2, int i3, int i4, int i5) {
        Message message = new Message();
        message.what = 3;
        message.arg1 = i;
        message.obj = new Rect(i2, i3, i4, i5);
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoUrl(int i, int i2, String str) {
        Message message = new Message();
        message.what = 2;
        message.arg1 = i;
        message.arg2 = i2;
        message.obj = str;
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoVisible(int i, boolean z) {
        Message message = new Message();
        message.what = VideoTaskSetVisible;
        message.arg1 = i;
        message.arg2 = z ? 1 : 0;
        mVideoHandler.sendMessage(message);
    }

    public static void startVideo(int i) {
        Message message = new Message();
        message.what = 4;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void stopVideo(int i) {
        Message message = new Message();
        message.what = 7;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }
}
