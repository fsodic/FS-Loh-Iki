package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.rha  reason: case insensitive filesystem */
class C2102rha extends X509Certificate {

    /* renamed from: a  reason: collision with root package name */
    private final X509Certificate f5443a;

    public C2102rha(X509Certificate x509Certificate) {
        this.f5443a = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() {
        this.f5443a.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        this.f5443a.checkValidity(date);
    }

    public int getBasicConstraints() {
        return this.f5443a.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
        return this.f5443a.getCriticalExtensionOIDs();
    }

    public byte[] getExtensionValue(String str) {
        return this.f5443a.getExtensionValue(str);
    }

    public Principal getIssuerDN() {
        return this.f5443a.getIssuerDN();
    }

    public boolean[] getIssuerUniqueID() {
        return this.f5443a.getIssuerUniqueID();
    }

    public boolean[] getKeyUsage() {
        return this.f5443a.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
        return this.f5443a.getNonCriticalExtensionOIDs();
    }

    public Date getNotAfter() {
        return this.f5443a.getNotAfter();
    }

    public Date getNotBefore() {
        return this.f5443a.getNotBefore();
    }

    public PublicKey getPublicKey() {
        return this.f5443a.getPublicKey();
    }

    public BigInteger getSerialNumber() {
        return this.f5443a.getSerialNumber();
    }

    public String getSigAlgName() {
        return this.f5443a.getSigAlgName();
    }

    public String getSigAlgOID() {
        return this.f5443a.getSigAlgOID();
    }

    public byte[] getSigAlgParams() {
        return this.f5443a.getSigAlgParams();
    }

    public byte[] getSignature() {
        return this.f5443a.getSignature();
    }

    public Principal getSubjectDN() {
        return this.f5443a.getSubjectDN();
    }

    public boolean[] getSubjectUniqueID() {
        return this.f5443a.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
        return this.f5443a.getTBSCertificate();
    }

    public int getVersion() {
        return this.f5443a.getVersion();
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.f5443a.hasUnsupportedCriticalExtension();
    }

    public String toString() {
        return this.f5443a.toString();
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) {
        this.f5443a.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) {
        this.f5443a.verify(publicKey, str);
    }
}
