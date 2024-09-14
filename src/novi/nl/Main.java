package novi.nl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] numeric = {1,2,3,4,5,6,7,8,9,0};
        String [] alphabetic = {"een", "twee", "drie", "vier", "vijf","zes","zeven","acht","negen","tien"};

        Translator un = new Translator(alphabetic, numeric);
        Scanner scanner = new Scanner(System.in);
        boolean action = true;
        String ongeldig = "ongeldige invoer";

        while(action){
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();

            if(input.equals("x")){
                action = false;
            }
            else if(input.equals("v")){
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();
                if(number < 10){
                    String result = un.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                }
                else{
                    System.out.println("ongeldig");
                }

            }

        }

    }
}
