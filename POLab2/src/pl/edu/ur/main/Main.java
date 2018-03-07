package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        double a = 3,b = 4,c = 2;
        
        double delta=b*b-4*a*c;
        if(delta>0)
        {
          double pierw=Math.sqrt(delta);
          double x1=(-b-pierw)/2*a;
          double x2=(-b-pierw)/2*a;
        
          System.out.println("X1"+x1);
          System.out.println("X1"+x2);
        }
        // TODO zad 3, 4, 6, 7
        /*for(int i=0;i!=0;i--)
        {
            if(i==2||i==6||i==2||i==9||i==15||i==19)
            {
                continue;
            }
            System.out.println("\n"+i);
        }
        
        int suma=0;
        
        do 
        {
          suma+=1;
          System.out.println("Skok"+1);
          System.out.println("Suma"+suma);
        }while(suma<100);
        
        */
        /*Scanner odczyt;
        odczyt = new Scanner(System.in);
        
        boolean warunek=true;
        while(warunek)
        {      
         int miesiac=odczyt.nextInt();
         switch(miesiac)
         {
            case 0:
            {
               warunek=false;
            }
            case 1:
            {
                System.out.println("Styczen");
            }
            break;
            case 2:
            {
                System.out.println("Luty");
            }
            break;
            case 3:
            {
                System.out.println("Marzec");
            }
            break;
            case 4:
            {
                System.out.println("Kwiecien");
            }
            break;
            case 5:
            {
                System.out.println("Maj");
            }
            break;
            case 6:
            {
                System.out.println("Czerwiec");
            }
            break;
            case 7:
            {
                System.out.println("Lipiec");
            }
            break;
            case 8:
            {
                System.out.println("Sierpien");
            }
            break;
            case 9:
            {
                System.out.println("Wrzesien");
            }
            break;
            case 10:
            {
                System.out.println("pazdziernik");
            }
            break;
            case 11:
            {
                System.out.println("listopad");
            }
            break;
            case 12:
            {
                System.out.println("grudzien");
            }
            break;
         }
        }
      */
    }
    
}
