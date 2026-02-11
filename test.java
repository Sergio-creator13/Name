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
        int checker=0;
        boolean isRunning=true;
        int x=0;
        int y=0;
        while(isRunning){
            boolean tracker=false;
            while(tracker==false){
            System.out.println("pls input x");
        x=scan.nextInt();
        System.out.println("pls input y");
        y=scan.nextInt();
        if(four[y][x].equals("_")){ 
        four[y][x]="x";
        tracker=true;
        checker+=1;
    }
}
        printAray(four);
        ThreeInARow(four, x, y);
        if(checker==9){
            System.out.println("its a tie");
            System.exit(0);
        }
        tracker=false;
        while(tracker==false){
        System.out.println("pls input x");
        x=scan.nextInt();
        System.out.println("pls input y");
        y=scan.nextInt();
        if(four[y][x].equals("_")){
        four[y][x]="o";
        tracker=true;
        checker+=1;
    }
}
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
        if(aray[0][x].equals(aray[1][x])&& aray[1][x].equals(aray[2][x])){
        System.out.println(aray[y][x]+" wins");
        System.exit(0);
        }
        if(aray[y][0].equals(aray[y][1])&& aray[y][1].equals(aray[y][2])){
            System.out.println(aray[y][x]+" wins");
            System.exit(0);
        }
        if(aray[0][0].equals(aray[1][1])&& aray[1][1].equals(aray[2][2])&& aray[1][1].equals(aray[y][x])){
            System.out.println(aray[y][x]+" wins");
            System.exit(0);
        }
        if(aray[2][0].equals(aray[1][1])&& aray[1][1].equals(aray[0][2])&& aray[1][1].equals(aray[y][x])){
            System.out.println(aray[y][x]+" wins");
            System.exit(0);
        }
    }
}