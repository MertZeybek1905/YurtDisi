public class Main {
     public static void main(String[] args) throws InterruptedException {
         Yolcu yolcu =new Yolcu();
         System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz....");
        
         String sartlar = "Yurtdışı Çıkış Kuralları...\n"
                          +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"
                          +"15 Tl harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                          +"Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";
         String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor";
         while(true){
             System.out.println("harc bedeli kontrol ediliyor");
             Thread.sleep(3000);
             if(yolcu.Yurtdısıharc()==true){
                 System.out.println("iyi yolculuklar");
             }
             else{
                 System.out.println(message + "\n" + sartlar);
                 return;
             }
             System.out.println("Siyasi yasak kontrol ediliyor");
             Thread.sleep(3000);
             if(yolcu.Yurtdısıyasak()==true){
                 System.out.println("yasağınız bulunuyor");
                 System.out.println(message + "\n" + sartlar);
                 return;
             }
             else{
                System.out.println("iyi yolculuklar");
                
            }

             System.out.println("vize kontrol ediliyor");
             Thread.sleep(3000);
             if(yolcu.Yurtdısıvize()==true){
                System.out.println("iyi yolculuklar");
             }
             else{
                System.out.println(message + "\n" + sartlar);
                return;
             }
            
             
         }
         
    }
}
