import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

         int operator ,x,y;
         System.out.println("emeliyyat novunu secin: \n 1-Toplama \n 2-Cixma \n 3-Vurma \n 4-Bolme");
         operator= scanner.nextInt();
         int result=0;
         System.out.println("X I DAXIL EDIN");
         x=scanner.nextInt();
         System.out.println("y i daxil edin");
         y=scanner.nextInt();
         switch (operator){
             case 1:result=x+y;
             System.out.println(result);
             break;
             case 2:result=x-y;
                 System.out.println(result);
                 break;
             case 3:result=x*y;
                 System.out.println(result);
                 break;
             case 4:result=x/y;
                 System.out.println(result);
                 break;
             default:System.out.println("Eror because not chosen correct numbers!!!");
             break;
         }
    }

}