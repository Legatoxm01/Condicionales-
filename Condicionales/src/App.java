import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("ingrese su edad");
        edad = sc.nextInt();
        if (edad > 18){
            System.out.println("eres mayor de edad");
        } else{
            System.out.println("Usted aun esta muy pollo");
        }
        sc.close();
    }
}
