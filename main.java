package kitapciProje;

public class main extends Kitapci {

    public main(String kitapAdi, String yazarAdi, int kitapFiyatı, int kitapNo) {
        super(kitapAdi, yazarAdi, kitapFiyatı, kitapNo);
    }



    public static void main(String[] args) {



        mainMenu();


    }



    public static void mainMenu() {

        System.out.println("Lütfen yapmak istediğiniz işlemi belirtiniz.\n1.Kitap ekle\n2.No ile kitap görüntüle\n3.Bilgi ile kitap görüntüle\n4.No ile kitap sil\n5.Tüm kitapları listele\n6.Çıkış");
    int tercih=scan.nextInt();

    switch (tercih){

        case 1: kitapEkle();
            devamMenusu();break;

        case 2:kitapGoruntule();
            devamMenusu();break;
        case 3:bilgiIleKitapGoruntule();
            devamMenusu();break;
        case 4:kitapSilme();break;
        case 5:
            System.out.println("Kitaplığımızdaki kitapların listesi: ");

            if(kitaplarListesi.isEmpty()){
                System.out.println("Kitapçıda hiçbir kitap bulunmamakta.");
            }else {for (int i = 0; i <kitaplarListesi.size() ; i++) {System.out.println(kitaplarListesi.get(i).kitapAdi);}} devamMenusu();break;

        case 6:
            System.out.println("Hoşçakalın");

        default:
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyin." );

            mainMenu();


            }


            }



    private static void devamMenusu() {

        System.out.println("İşleminiz tamamlandı. Ana menuye donmek için 1'e, çıkmak için 2'e basınız.");

        int tercih2= scan.nextInt();

        switch (tercih2){

            case 1:mainMenu(); break;
            case 2:
                System.out.println("Hoşçakalın."); break;
            default:
                System.out.println("hatalı giriş yaptınız. lütfen yeniden deneyiniz.");
                devamMenusu(); break;

        }
    }
    }

