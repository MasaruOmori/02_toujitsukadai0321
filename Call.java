import java.util.Scanner;


public class Call {
    public static void main(String[] args) {

        CoinCase Case01 = new CoinCase();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6 ; i++) {
            System.out.println("硬貨の種類を入力してください。");
            Scanner scan01  = new Scanner(System.in);
            int coin = scan01.nextInt();

            System.out.println("硬貨の枚数を入力してください。");
            Scanner scan02  = new Scanner(System.in);
            int count = scan02.nextInt();

        }

        System.out.print( "500円は" + Case01.GetCount( 500 ) + "枚" );
        System.out.print( "100円は" + Case01.GetCount( 100 ) + "枚　" );
        System.out.print( "50円は" + Case01.GetCount( 50 ) + "枚　" );
        System.out.print( "10円は" + Case01.GetCount( 10 ) + "枚　" );
        System.out.print( "5円は" + Case01.GetCount( 5 ) + "枚　" );
        System.out.print( "1円は" + Case01.GetCount( 1 ) + "枚　" );


        System.out.println( "総額は" + Case01.GetAmount() + "円です。" );
    }
}



