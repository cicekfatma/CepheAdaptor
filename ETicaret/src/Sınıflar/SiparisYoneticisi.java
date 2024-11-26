package Sınıflar;

public class SiparisYoneticisi {

    private StokSistemi stokSistemi = new StokSistemi();
    private KargoSistemi kargoSistemi = new KargoSistemi();

    public void siparisisle(String urunKodu, int miktar, String adres){
        boolean stoktaVarmi = stokSistemi.stokKontrolEt(urunKodu);
        if(stoktaVarmi){
            stokSistemi.stokGuncelle(urunKodu,miktar);
            kargoSsitemi.kargoAyarla(Adres);
        }
        else{
            System.out.println("Sipariş iptal edildi,ürün stokta yok");
        }
    }
}
