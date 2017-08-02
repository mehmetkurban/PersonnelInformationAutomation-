package com.ulviyehocamizsençokyaþa;

public class Dto {
	private int No,yerelNo;
	private String ad,soyAd,disGorunus,adres,aciklama,sucKat;
	
	
	public Dto(int no, int yerelNo, String ad, String soyAd, String disGorunus,
			String adres, String aciklama, String sucKat) {
		super();
		No = no;
		this.yerelNo = yerelNo;
		this.ad = ad;
		this.soyAd = soyAd;
		this.disGorunus = disGorunus;
		this.adres = adres;
		this.aciklama = aciklama;
		this.sucKat = sucKat;
	}
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public int getYerelNo() {
		return yerelNo;
	}
	public void setYerelNo(int yerelNo) {
		this.yerelNo = yerelNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyAd() {
		return soyAd;
	}
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	public String getDisGorunus() {
		return disGorunus;
	}
	public void setDisGorunus(String disGorunus) {
		this.disGorunus = disGorunus;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public String getSucKat() {
		return sucKat;
	}
	public void setSucKat(String sucKat) {
		this.sucKat = sucKat;
	}
				
}