package org.cocos2dx.lib;

import android.opengl.GLSurfaceView;
import org.cocos2dx.enginedata.IEngineDataManager;

/* access modifiers changed from: package-private */
public class O implements IEngineDataManager.OnSystemCommandListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GLSurfaceView f6313a;

    O(GLSurfaceView gLSurfaceView) {
        this.f6313a = gLSurfaceView;
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager.OnSystemCommandListener
    public void onChangeContinuousFrameLostConfig(int i, int i2) {
        this.f6313a.queueEvent(new J(this, i, i2));
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager.OnSystemCommandListener
    public void onChangeExpectedFps(int i) {
        this.f6313a.queueEvent(new L(this, i));
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager.OnSystemCommandListener
    public void onChangeLowFpsConfig(int i, float f) {
        this.f6313a.queueEvent(new K(this, i, f));
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager.OnSystemCommandListener
    public void onChangeMuteEnabled(boolean z) {
        this.f6313a.queueEvent(new N(this, z));
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager.OnSystemCommandListener
    public void onChangeSpecialEffectLevel(int i) {
        this.f6313a.queueEvent(new M(this, i));
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager.OnSystemCommandListener
    public void onQueryFps(int[] iArr, int[] iArr2) {
        Cocos2dxEngineDataManager.nativeOnQueryFps(iArr, iArr2);
    }
}
