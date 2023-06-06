import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        task1();
    }

    public static void task1() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите Ваше имя: ");
    
        String name = scan.nextLine();
    
        System.out.println("Hello, " + name);
    }
    
}


