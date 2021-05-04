package ornek18;

public class Islem {
    private Tahmin tahmin;
    private int tahminAdedi;

    public void birSayiTut() {
	tahmin = new Tahmin();
	tahminAdedi = 0;
    }

    public TahminSonuclar� tahmindeBulun(int tahminEdilen) {
	tahminAdedi++;

	int tutulan = tahmin.getTutulanSayi();
	if (tahminEdilen > tutulan) {
	    return TahminSonuclar�.TAHMIN_BUYUK;
	} else if (tahminEdilen < tutulan) {
	    return TahminSonuclar�.TAHMIN_KUCUK;
	} else {
	    return TahminSonuclar�.DOGRU_TAHMIN;
	}
    }

    public int getTahminAdedi() {
	return tahminAdedi;
    }

}
