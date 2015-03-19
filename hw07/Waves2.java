import java.util.Scanner;

public class Waves2{
   
    public static void main (String [ ] args){
        Scanner myScanner = new Scanner ( System.in );
        
        int counter1 = 1;
        int counter2 = 1;
        int counter3 = 1;
        
        System.out.print("Enter a number between 1 and 30: ");
        int inputNumber = myScanner.nextInt();
        
       
        
        System.out.println("");
        System.out.println("FOR LOOPS:");
        
        for (counter1= 1; counter1 <= inputNumber; counter1 += 2){
            for (counter2 = counter1; counter2 >= 1; counter2--){
                for (counter3 = 1; counter3 <= counter2; counter3++){
                    System.out.print(counter1);
                }
                System.out.println("");
            }
            if ((counter1 + 1) <= inputNumber){
                for (counter2 = 1; counter2 <= (counter1 + 1); counter2++){
                    for (counter3 = 1; counter3 <= counter2; counter3++){
                        System.out.print((counter1+ 1));
                    }
                    System.out.println("");
                 }
             }
         }
        
       
        
        System.out.println("");
       
        System.out.println("WHILE LOOPS:");
        
        counter1 = 1;
        counter2= 1;
        counter3 = 1;
        
        while (counter1 <= inputNumber){
            counter2 = counter1;
            while (counter2 >= 1){
                counter3 = 1;
                while (counter3<= counter2){
                    System.out.print(counter1);
                    counter3 = counter3+ 1;
                }
                System.out.println("");
                counter2 = counter2 - 1;
            }
            if ((counter1 + 1) <= inputNumber){
                counter2 = 1;
                while (counter2 <= (counter1 + 1)){
                    counter3= 1;
                    while (counter3 <= counter2){
                        System.out.print((counter1 + 1));
                        counter3= counter3 + 1;
                    }
                    System.out.println("");
                    counter2 = counter2 + 1;
                }
            }
            counter1 = counter1 + 2;
        }
        
        counter1 = 1;
        counter2 = 1;
        counter3 = 1;
        
        System.out.println("");
        System.out.println("DO-WHILE LOOP:");
        
        do {
            counter2 = counter1;
           
            do {
                counter3 = 1;
              
                do{
                  
                    System.out.print(counter1);
                    counter3 = counter3 + 1;
                } while (counter3 <= counter2);
                System.out.println("");
                counter2 = counter2- 1;
            } while (counter2 >= 1);
            if ((counter1 + 1) <= inputNumber){
                counter2 = 1;
                do {
                    counter3 = 1;
                    do {
                        System.out.print((counter1 + 1));
                        counter3 = counter3 + 1;
                    } while (counter3 <= counter2);
                    System.out.println("");
                    counter2 = counter2 + 1;
                } while (counter2 <= (counter1 + 1));
            }
            counter1 = counter1 + 2;
        } while (counter1 <= inputNumber);
    }
}