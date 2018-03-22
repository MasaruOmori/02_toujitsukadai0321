public class CoinCase {

    public int Y500;
    public int Y100;
    public int Y50;
    public int Y10;
    public int Y5;
    public int Y1;


    public void AddCoins( int coin, int count ){
        if (coin == 500){
            Y500 = count;
        }else if (coin == 100){
            Y100 = count;
        }else if (coin == 50){
            Y50 = count;
        }else if (coin == 10){
            Y10 = count;
        }else if (coin == 5){
            Y5 = count;
        }else {
            Y1 = count;
        }
    }

    public int GetCount( int coin ){
        if (coin == 500){
            return Y500;
        }else if (coin == 100){
            return Y100;
        }else if (coin == 50){
            return Y50;
        }else if (coin == 10){
            return Y10;
        }else if (coin == 5){
            return Y5;
        }else {
            return Y1;
        }
    }

    public int GetAmount() {
        return ( Y500 * 500 ) + ( Y100 * 100 ) + ( Y50 * 50 ) + ( Y10 * 10 ) + ( Y5 * 5 ) + (Y1 * 1);
    }

}