import Odemeler.KrediKartiAdapter;
import Odemeler.OdemeYontemi;
import Sınıflar.SiparisYoneticisi;

public class Main {

    public static void main(String[] args) {
        SiparisYoneticisi siparisYoneticisi = new SiparisYoneticisi();
        siparisYoneticisi.siparisisle("102",2, "İstanbul");

        OdemeYontemi odemeYontemi = new KrediKartiAdapter();
        odemeYontemi.odemeYap(312.58);
        }

    }
