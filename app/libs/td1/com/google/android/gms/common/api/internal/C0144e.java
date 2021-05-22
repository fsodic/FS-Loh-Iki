package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.common.api.internal.e  reason: case insensitive filesystem */
public class C0144e implements h, i {

    /* renamed from: a  reason: collision with root package name */
    protected final Status f1252a;

    /* renamed from: b  reason: collision with root package name */
    protected final DataHolder f1253b;

    protected C0144e(DataHolder dataHolder, Status status) {
        this.f1252a = status;
        this.f1253b = dataHolder;
    }

    @Override // com.google.android.gms.common.api.i
    public Status E() {
        return this.f1252a;
    }

    @Override // com.google.android.gms.common.api.h
    public void a() {
        DataHolder dataHolder = this.f1253b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
