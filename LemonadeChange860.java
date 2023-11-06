public class LemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] != 5) return false;
        int five = 1, ten = 0;
        for(int i = 1; i < bills.length; i++){
            if(bills[i] == 5){
                five++;
            }else if(bills[i] == 10){
                if(five > 0){
                    five--;
                    ten++;
                }else{return false;}
            }else{
                if(five >=1 && ten >= 1){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five -= 3;
                }else{return false;}
            }
        }
        return true;
    }
}
