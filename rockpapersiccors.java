import java.util.Scanner;
import java.util.Random;
public class rockpapersiccors {public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    Random rand=new Random();
    while(true){
    int computer=rand.nextInt(3);
    System.out.println("press one for paper zero for scissors two for rock");
    int player=scan.nextInt();
    if(computer==player){System.out.println("its a tie");}
    if(player==2){
        if(computer==1){System.out.println("its a lost");}
        if(computer==0){System.out.println("its a win");}
    }
    if(player==0){
        if(computer==1){System.out.println("its a win");}
        if(computer==2){System.out.println("its a lost");}
    }
    if(player==1){
        if(computer==0){System.out.println("its a lost");}
        if(computer==2){System.out.println("its a win");}
    }}
}
    
}
