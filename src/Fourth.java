public class Fourth {
    public static boolean isSimple(int number){
        int buf;
        if(number != 1){
            for (int i = 2; i<=number/2;i++){
                buf = number % i;
                if(buf == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            if (isSimple(i)){
                System.out.println(i);
            }
        }
    }
}
