package Odemeler;

import Odemeler.OdemeYontemi;

public class KrediKartiAdapter implements OdemeYontemi {
    private KrediKartiServisi krediKartiServisi = new KrediKartiServisi();
    @Override
    public void odemeYap(double tutar) {
     krediKartiServisi.krediKartiylaOde(tutar);
    }
}
