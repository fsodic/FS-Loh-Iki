package org.cocos2dx.cpp;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.FrameLayout;
import com.RoyalGame.tools.GameHelper;
import com.RoyalGame.tools.config;
import com.RoyalGame.tools.utils;
import com.google.android.gms.ads.a.e;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.m;
import org.cocos2dx.lib.Cocos2dxActivity;
import org.cocos2dx.lib.Cocos2dxGLSurfaceView;

public class AppActivity extends Cocos2dxActivity {
    public static AppActivity instance;
    private static e interstitial;
    private h adView;
    private Cocos2dxGLSurfaceView glSurfaceView;
    private final int lp = -2;
    public GameHelper mHelper;
    private boolean mIsRewardedVideoLoading;
    private final Object mLock = new Object();

    private class a extends c {
        private a() {
        }

        /* synthetic */ a(AppActivity appActivity, a aVar) {
            this();
        }

        @Override // com.google.android.gms.ads.c
        public void d() {
            utils.onReceiveAd();
        }
    }

    private f getAdSize() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return f.a(this, (int) (((float) displayMetrics.widthPixels) / displayMetrics.density));
    }

    /* access modifiers changed from: protected */
    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.mHelper.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void onCreate(Bundle bundle) {
        super.setEnableVirtualButton(false);
        super.onCreate(bundle);
        this.mHelper = new GameHelper(this, 1);
        instance = this;
        this.mHelper.setup(new a(this));
        m.a(this, config.ads_app_id);
        this.adView = new h(this);
        this.adView.setAdSize(getAdSize());
        this.adView.setAdUnitId(config.banner_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        addContentView(this.adView, layoutParams);
        e.a aVar = new e.a();
        aVar.b("B3EEABB8EE11C2BE770B684D95219ECB");
        aVar.b("0123456789ABCDEF0123456789ABCDEF");
        this.adView.a(aVar.a());
        this.adView.setAdListener(new a(this, null));
        this.adView.setVisibility(8);
        utils.setActivity(this);
        utils.setGameHelper(this.mHelper);
        utils.setAdView(this.adView);
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public Cocos2dxGLSurfaceView onCreateView() {
        this.glSurfaceView = new Cocos2dxGLSurfaceView(this);
        this.glSurfaceView.setEGLConfigChooser(5, 6, 5, 0, 16, 8);
        return this.glSurfaceView;
    }

    /* access modifiers changed from: protected */
    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void onDestroy() {
        this.adView.a();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void onPause() {
        this.adView.b();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void onResume() {
        super.onResume();
        this.adView.c();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.mHelper.onStart(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mHelper.onStop();
    }
}
