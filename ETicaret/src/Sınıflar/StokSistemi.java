package Sınıflar;

public class StokSistemi {
    protected boolean stokKontrolEt(String urunKodu){
        System.out.println(urunKodu+"kodlu ürün stokta var");
        return true;

    }
    protected void stokGuncelle(String urunKodu,int miktar,String Adres){
        System.out.println(urunKodu+"kodlu ürün"+miktar+"kadar miktarı artırıldı");

    }
}
