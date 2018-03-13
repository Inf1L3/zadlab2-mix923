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
        
        //Zadanie Domowe
        // TODO zad 3, 4, 6, 7
        7
        Zadanie_domowe_z_dnia_14_03(); 
        
        /*double a = 3,b = 4,c = 2;
        
        double delta=b*b-4*a*c;
        if(delta>0)
        {
          double pierw=Math.sqrt(delta);
          double x1=(-b-pierw)/2*a;
          double x2=(-b-pierw)/2*a;
        
          System.out.println("X1"+x1);
          System.out.println("X1"+x2);
        }
        */
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

    private static void Zadanie_domowe_z_dnia_14_03() {
        while(true)
        {
         Scanner odczyt;   
         System.out.println("Podaj numer zadania");
         odczyt =new Scanner(System.in);
         int zadanie=odczyt.nextInt();
         switch(zadanie)
         {
             case 3:
             {
                 int[] tablica=new int[10];
                 for(int i=0;i<10;i++)
                 {
                     System.out.println("Podaj wartosc:");
                     tablica[i]=odczyt.nextInt();
                 }
                //od 1 do n
                 for(int i=0;i<10;i++)
                 {
                     System.out.println("Wartosci" + tablica[i]);
                 }
                //od n do 1
                 for(int i=10;i!=0;i--)
                 {
                     System.out.println("Wartosci" + tablica[i]);
                 }
                 //od 1 do n  nieprzyste indeks
                  for(int i=0;i<10;i++)
                 {
                     if(i%2!=0)
                     System.out.println("Wartosci" + tablica[i]);
                 }
                  
                 //od 1 do n  przyste indeks
                 for(int i=0;i<10;i++)
                 {
                     if(i%2==0)
                     System.out.println("Wartosci" + tablica[i]);
                 }
                 
             }
             break;
             case 4:
             {
                 int[] tablica=new int[10];
                 for(int i=0;i<10;i++)
                 {
                     System.out.println("Podaj wartosc:");
                     tablica[i]=odczyt.nextInt();
                 }
                 
                 
                 int suma=0;
                 for(int i=0;i<10;i++)
                 {
                     suma+=tablica[i];
                 }
                 System.out.println("Suma wartosci:" + suma);
                 
                 int iloczyn=1;
                 for(int i=0;i<10;i++)
                 {
                     iloczyn*=tablica[i];
                 }
                 System.out.println("Iloczyn wartosci:" + iloczyn);
                 
                 int suma2=0;
                 for(int i=0;i<10;i++)
                 {
                     suma2+=tablica[i];
                 }
                 System.out.println("Srednia wartosci:" + suma2/2);
                 
                 int wynik = tablica[0];
                 for (int i=1; i<10; i++) {
                  if (wynik > tablica[i]) 
                  {
                       wynik = tablica[i];
                  }
                 }
                 System.out.println("Wartosc najwieksza wartosci:" + wynik);
                 
                 
                 int wynik2 = tablica[0];
                 for (int i=1; i<10; i++) {
                  if (wynik2 < tablica[i]) 
                  {
                       wynik2 = tablica[i];
                  }
                 }
                 System.out.println("Wartosc najwieksza wartosci:" + wynik2);
                 
                 
                 
             }
             break;
             case 6:
             {
                 while(true)
                 {
                    System.out.println("Podaj liczbę");
                    if(odczyt.nextInt()<0)
                    {
                        break;
                    }
                 }
             }
             break;
             case 7:
             {
                 System.out.println("Ile liczb chcesz wprowadzić:");
                 int n=odczyt.nextInt();
                 int[] tablica=new int[n];
                 for(int i=0;i<n;i++)
                 {
                     System.out.println("Podaj wartosc:");
                     tablica[i]=odczyt.nextInt();
                 }
                  b_sort(tablica);
             }
             break;
         }
         
        }
    }
    
    private static void b_sort(int tab[]){
    int temp;
    int zmiana = 1;
    while(zmiana > 0){
      zmiana = 0;
          for(int i=0; i<tab.length-1; i++){
          if(tab[i]>tab[i+1]){
             temp = tab[i+1];
             tab[i+1] = tab[i];
             tab[i] = temp;
             zmiana++;
            }
          }
    }
    for(int i=0; i<tab.length; i++){
    System.out.print(tab[i]+" ");
    }
    }
    
    
}
