package homework2;

public class PrintOdd {
    public static void main(String[] args) {
        int result=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                result+=i;
            }
        }
        System.out.println(result);
    }
}