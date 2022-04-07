public class Ex06_07_01 {
    public static void main(String[] args) {
        //5! 계산하기 for 문으로

        int f = 1;

        for ( int i = 5; i > 1; i--){
            f *= i;
            System.out.println("중간 계산 값 : " + f);


        }
        System.out.printf("5!의 값 : " + f );
    }
}
