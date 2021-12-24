import java.sql.Time;
import java.util.Scanner;

public class Yolcu implements YurtDisiKontrol{
   int harc;
  boolean yasak;
  boolean vize;
   public Yolcu(){
       Scanner scanner= new Scanner(System.in);
       System.out.println("Harc bedelini girin");
       this.harc=scanner.nextInt();
       scanner.nextLine();
       System.out.println("Siyasi yasağınız var mı ? (evet veya hayır)");
       String cevap= scanner.nextLine();
       if(cevap.equals("evet")){
           this.yasak=true;
       }
       else{
           this.yasak=false;

       }
       System.out.println("Vizeniz var mı? (evet veya hayır)");
       String cevap2=scanner.nextLine();
       if(cevap2.equals("evet")){
           this.vize=true;
       }
       else{
           this.vize=false;
       }

   }
    @Override
    public boolean Yurtdısıharc() {
        if(this.harc<15){
            System.out.println("Harc bedelini tam yatırın");
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public boolean Yurtdısıyasak() {
        if(this.yasak==true){
            System.out.println("yasağınız var");
            return false;
        }
        else{
            System.out.println("yasağnız yok");
            return true;
        }
    }

    @Override
    public boolean Yurtdısıvize() {
        if(this.vize==true){
            System.out.println("vizeniz var");
            return true;
        }
        else{
            System.out.println("vizeniz yok");
            return false;
        }
    }
    
}
