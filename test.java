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
        int x=scan.nextInt();
        int y=scan.nextInt();
        four[y][x]="x";
        printAray(four);
        x=scan.nextInt();
        y=scan.nextInt();
        four[x][y]="o";
        printAray(four);
        System.out.println("pls input row");
        int row=scan.nextInt();
        System.out.println(row);
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
}