import java.util.Scanner;

public class KullanıcıGirişi {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String username, password, newPassword, cevap;

        System.out.println("Kullanıcı Adı : ");
        username = input.nextLine();

        System.out.println("Şifre : ");
        password = input.nextLine();

        if (username.equals("hso") && password.equals("1234")){
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Kullanıcı adı veya şifre hatalı !");
            System.out.println("Şifreyi sıfırlamak ister misiniz ?(e/h)");
            cevap = input.nextLine();
            if (cevap.equals("e")){
                System.out.println("Yeni şifre girin : ");
                newPassword = input.nextLine();
                if (newPassword.equals("1234")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu !");
                    System.out.println("Şifre : " + newPassword);
                }
            }
        }
    }
}
