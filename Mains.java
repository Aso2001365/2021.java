import java.util.Scanner;
import java.util.Random;
public class Mains{
    public static int[][] ship=new int[5][5];
    public static void main(String[]args){
    System.out.println("*********************");
    System.out.println("   戦艦ゲーム   ");
    System.out.println("*********************");
    int ta=1;
   
    int ship1=1;
    int ship2=1;
    int ship3=1;

    Scanner scanner=new Scanner(System.in);
    Random random=new random(System.in);
    while(ship1==0&&ship2==0&&ship3==0){
    System.out.println("[ターン"+ta+"]");
    if(ship1==1){
        System.out.println("船1：生きてる");
    }else{
        System.out.println("船1：沈没");
    }
    if(ship2==1){
        System.out.println("船2：生きてる");
    }else{
        System.out.println("船2：沈没");
    }
    if(ship3==1){
        System.out.println("船3：生きてる");
    }else{
        System.out.println("船3：沈没");
    }
    System.out.println("爆弾のx座標を入力してください(1-5)");
    int x=scanner.nextInt();
    System.out.println("爆弾のy座標を入力してください(1-5)");
    int y=scanner.nextInt();
    if(ship1.count==0){
        ship1=0;
    }
    if(ship2.count==0){
        ship2=0;
    }
    if(ship3.count==0){
        ship1=0;
    }
}
}
}

//まだまだ完成していませんが今時点の限界です...
