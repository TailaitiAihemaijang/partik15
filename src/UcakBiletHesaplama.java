import java.util.Scanner;

/**
 * ClassName: UcakBiletHesaplama
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/3/2023 8:56 PM
 * @Version 1.0
 */
//Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
// Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
// Mesafe başına ücret 0,10 TL / km olarak alın.
// İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
//
//Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
// Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
public class UcakBiletHesaplama {
    public static void main(String[] args) {
        double mesafe,age,fiyat = 0.10,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Mesafe (Km olarak) Giriniz : ");
        mesafe = input.nextDouble();
        System.out.print("Lutfen Yasinizi Giriniz : ");
        age = input.nextDouble();
        total = mesafe * fiyat;
        System.out.println("Lutfen Seciniz 1.TekYon 2.Gidis-Donus");
        int tip = input.nextInt();
        if ((tip == 1 || tip == 2) && mesafe > 0 && age >0){
           System.out.println("Bilet Fiyati : " + total + "Tl");
           if (age < 12){
               total = total *0.5;
               System.out.println("indirimli Bilet Fiyati : " + total + "Tl");
           }else if (age>=12 || age<=14){
               total = total*0.1;
                System.out.println("indirimli Bilet Fiyati : " + total + "Tl");
            }else if (age >65){
               total = total *0.3;
                System.out.println("indirimli Bilet Fiyati : " + total + "Tl");
            }else if(tip == 2){
               total = total*0.2;
                System.out.println("indirimli Bilet Fiyati : " + total + "Tl");
            }
        }else {
            System.out.println("Hatali veri Girdiniz");
        }
    }
}
