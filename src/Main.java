public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(4,18,19));
    }

    public static boolean canPack(int bigCount, int small, int goal){
        int big = bigCount*5;
        int smallCount = small;
        int sum = big+small;
        if(big<0 || small<0 || goal<0){
            return false;
        }else if(sum<goal){
            return false;
        }else if(sum == goal){
            return true;
        }else{
            if((big>=goal && big%goal == 0)||(big>=goal && goal%5<=small)){
                return true;
            }else if(small>=goal){
                return true;
            }else if(big+small>goal && goal%big<=small){
                return true;
            }else{
                return false;
            }
        }
    }
}

