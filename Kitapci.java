package kitapciProje;


import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Kitapci {

    String kitapAdi="";
    String yazarAdi="";
    int kitapFiyatı=0;
    static int kitapSayac=1000;
    int kitapNo=kitapSayac;
    static Scanner scan=new Scanner(System.in);
    static List<Kitapci> kitaplarListesi=new ArrayList<>();

    public Kitapci(String kitapAdi, String yazarAdi, int kitapFiyatı,int kitapNo) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyatı = kitapFiyatı;
        this.kitapNo = kitapNo;

    }

    static void kitapEkle(){

        System.out.println("Lütfen eklemek istediğiniz kitabın adını giriniz");
        String kitapAdi=scan.next().toLowerCase();
        System.out.println("Lütfen eklemek istediğiniz kitabın yazar adını giriniz");
        scan.nextLine();//Dummy
        String yazarAdi=scan.nextLine().toLowerCase();
        System.out.println("Lütfen eklemek istediğiniz kitabın fiyatını giriniz");
        int kitapFiyati=0;
        kitapFiyati = scan.nextInt();
        int kitapNo=kitapSayac;

        Kitapci kitaplar=new Kitapci(kitapAdi, yazarAdi, kitapFiyati, kitapNo);

        kitaplarListesi.add(kitaplar);

        kitapSayac++;



    }

    protected static void kitapGoruntule(){

        System.out.println("Lütfen görüntülemek istediğiniz kitabın nosunu giriniz.");

        int tercih3=scan.nextInt();

        for (int i = 0; i <kitaplarListesi.size() ; i++) {

            if(kitaplarListesi.get(i).kitapNo==tercih3){

                System.out.println("Kitap adı: "+kitaplarListesi.get(i).kitapAdi);
                System.out.println("Kitap Yazarı: " +kitaplarListesi.get(i).yazarAdi);
                System.out.println("Kitap fiyatı: " +kitaplarListesi.get(i).kitapFiyatı);
            }
    }}

    protected static void bilgiIleKitapGoruntule(){




        System.out.println("Lütfen kitap bulmak için kullanmak istediğiniz kriteri belirtiniz\n1.Kitap adı\n2.Kitap yazarı\n3.Kitap fiyatı");

        int tercih4= scan.nextInt();

        switch (tercih4){

            case 2:
                System.out.println("Kitaplarına ulaşmak istediğiniz yazar adını giriniz.");

scan.next();
                String yazar= scan.nextLine();




                for (int i = 0; i <kitaplarListesi.size() ; i++) {

                    if(kitaplarListesi.get(i).yazarAdi.contains(yazar)){

                        System.out.println(yazar+" yazarına ait kitaplar:");
                        System.out.println(kitaplarListesi.get(i).kitapAdi);}else {
                        System.out.println(yazar+" yazarına ait kitap bulunamadı.");



                    }

                } break;

            case 1:
                System.out.println("Aradığınız kitabın adını giriniz.");
                scan.next();

                String kitap= scan.nextLine();

                boolean kitapMevcutMu=false;

                for (int k = 0; k <kitaplarListesi.size() ; k++) {

                    if(kitaplarListesi.get(k).kitapAdi.contains(kitap)){ kitapMevcutMu=true;} }

                if(kitapMevcutMu){
                    System.out.println("Kitapçımızda adını girdiğiniz kitap mevcut");
                }else{System.out.println("Kitapçımızda adını girdiğiniz kitap mevcut değil");}
                break;

            case 3:
                System.out.println("Lütfen kitap fiyatlarımız için üst limit giriniz.");

                int limit= scan.nextInt();
                for (int j = 0; j <kitaplarListesi.size() ; j++) {

                    if(kitaplarListesi.get(j).kitapFiyatı<limit){

                        System.out.println("Aramıza uygun kitaplar:");

                        System.out.println("Kitap:"+kitaplarListesi.get(j).kitapAdi+" Kitap fiyatı: "+kitaplarListesi.get(j).kitapFiyatı);
                    }

                } break;

            default:
                System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyin.");
                bilgiIleKitapGoruntule();





        }

    }

    protected static void kitapSilme(){

        System.out.println("Lütfen silmek istediğiniz kitabın nosunu giriniz.");

        int no=scan.nextInt();

        boolean silinecekKitapMevcutMu=false;
        int index=0;

        for (int i = 0; i <kitaplarListesi.size() ; i++) {
            if(kitaplarListesi.get(i).kitapNo==no){silinecekKitapMevcutMu=true;
                index=i;


        }
            if(silinecekKitapMevcutMu){
                System.out.println("Nosunu girdiğiniz kitap listeden kaldırıldı. Üst menuye yonlendirileceksiniz.");

                kitaplarListesi.remove(index);
                main.mainMenu();
            }else {
                System.out.println("Silmeye çalıştığınız kitap numarası bulunmuyor ya da hatalı giriş yaptınız. Ana menuye yönlendirileceksiniz.");
                main.mainMenu();
            }



        }
    }


}
