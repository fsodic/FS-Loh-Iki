package org.cocos2dx.enginedata.magic;

import com.huawei.android.hwgamesdk.HwGameSDK;

/* access modifiers changed from: package-private */
public class b implements HwGameSDK.GameEngineCallBack {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f6246a;

    b(a aVar) {
        this.f6246a = aVar;
    }

    @Override // com.huawei.android.hwgamesdk.HwGameSDK.GameEngineCallBack
    public void changeContinuousFpsMissedRate(int i, int i2) {
        if (this.f6246a.f6244b != null) {
            this.f6246a.f6244b.onChangeContinuousFrameLostConfig(i, i2);
        }
    }

    @Override // com.huawei.android.hwgamesdk.HwGameSDK.GameEngineCallBack
    public void changeDxFpsRate(int i, float f) {
        if (this.f6246a.f6244b != null) {
            this.f6246a.f6244b.onChangeLowFpsConfig(i, f);
        }
    }

    @Override // com.huawei.android.hwgamesdk.HwGameSDK.GameEngineCallBack
    public void changeFpsRate(int i) {
        if ((this.f6246a.f6245c) && this.f6246a.f6244b != null) {
            this.f6246a.f6244b.onChangeExpectedFps(i);
        }
    }

    @Override // com.huawei.android.hwgamesdk.HwGameSDK.GameEngineCallBack
    public void changeMuteEnabled(boolean z) {
        if (this.f6246a.f6244b != null) {
            this.f6246a.f6244b.onChangeMuteEnabled(z);
        }
    }

    @Override // com.huawei.android.hwgamesdk.HwGameSDK.GameEngineCallBack
    public void changeSpecialEffects(int i) {
        if (this.f6246a.f6244b != null) {
            this.f6246a.f6244b.onChangeSpecialEffectLevel(i);
        }
    }

    @Override // com.huawei.android.hwgamesdk.HwGameSDK.GameEngineCallBack
    public void queryExpectedFps(int[] iArr, int[] iArr2) {
        if (this.f6246a.f6244b != null) {
            this.f6246a.f6244b.onQueryFps(iArr, iArr2);
        }
    }
}
