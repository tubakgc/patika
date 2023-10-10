import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {

        //değerleri alalım
        int a, b;
        double c ;

        //kullanıcıdan verileri alalım
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.dik kenarı girin:" );
        a= girdi.nextInt();

        System.out.print("2. dik kenarı girin:" );
        b=girdi.nextInt();

        c= Math.sqrt ((a*a) + (b*b) );
        System.out.print("hipotenüs:" + c);



    }
}
