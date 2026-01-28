import java.util.Scanner;
public class test {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String[][]four=new String[3][3];
        int five=10;int[] three=new int[five];
        three[1]=1;
        
        for (int I=0;I < 3;I++){
            for (int S=0;S < 3;S++){
            four[I][S]="_";}
        }
        for (int I=0;I < 3;I++){
            for (int S=0;S < 3;S++){
            System.out.print(four[I][S]);
            }
            System.out.println();
        }
        boolean isRunning=true;
        while(isRunning){
            System.out.println("pls input x");
        int x=scan.nextInt();
        System.out.println("pls input y");
        int y=scan.nextInt();
        four[y][x]="x";
        printAray(four);
        ThreeInARow(four, x, y);
        System.out.println("pls input x");
        x=scan.nextInt();
        System.out.println("pls input y");
        y=scan.nextInt();
        four[y][x]="o";
        printAray(four);
        ThreeInARow(four, x, y);
        

        }
    }

    
    public static void printAray(String[][] aray){
        for (int I=0;I < 3;I++){
            for (int S=0;S < 3;S++){
                System.out.print(aray[I][S]);
            }
            System.out.println();
        }
    }
    public static void ThreeInARow(String[][] aray, int x, int y){
        if(aray[0][x].eguals(aray[1][x])&& aray[1][x].eguals(aray[2][x])&&){
        System.out.println(aray [y][x]+" wins");
        }
    }
}