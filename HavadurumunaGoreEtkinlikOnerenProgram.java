import java.util.Scanner;

public class HavadurumunaGoreEtkinlikOnerenProgram {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz: ");
        heat = input.nextInt();

        if ( heat < 5  ){
            System.out.println("Hava Kayak Yapmak İçin Uygun! ");

        }else if (heat  >= 5 && heat <= 15){
            System.out.println("Hava Sinemaya Gitmek İçin Uygun!");

        }else if (heat  >= 15 && heat <= 25){
            System.out.println("Hava Piknik Yapmak İçin Uygun!");

        }else if (heat >26){
            System.out.println("Hava Yüzmek için Uygun!");
        }
    }
}
