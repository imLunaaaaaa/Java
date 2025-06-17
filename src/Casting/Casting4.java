package Casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // int / int 이므로 1.5가 아니라 int 타입의 결과인 1이 나온다.
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2; // int / int
        System.out.println("div2 = " + div2);
        // double div2 = 1;  -> int/int라서 int타입으로 결과가 나온다.
        // double div2 = (double)1;  -> int에서 double로 대입해야 한다. 자동 형변환 발생
        // double div2 =  1.0;  -> 1(int)에서 1.0(double)로 형변환 되었다.

        double div3 = 3.0 / 2; // double / int
        System.out.println("div3 = " + div3);
        // double div3 = 3.0 / (double)2     -> double/double로 자동 형변환 발생
        // double div3 = 3.0 / 2.0 ;
        // double div3 = 1.5;    -> double/double = double

        double div4 = (double) 3 / 2;   // 명시적 형변환 사용함. (double)int / int
        System.out.println("div4 = " + div4);
        // double div4 = (double)3 / (double)2;  ->  double/int이기 때문에 double/double로 형변환 발생
        // double div4 = 3.0 / 2.0;   ->  double/double = double
        // double div4 = 1.5;
        // 3/2와 같이 int형끼리 나눗셈을 해서 소수까지 구하고 싶다면 div4처럼 명시적 형변환을 사용하면 된다.

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);
        // (double)int / int      ->     double)3 / 2
        // (double)3 / (double)2    ->     double + int이므로 더 큰 범위로 변환
        // 3.0 / 2.0      ->  double/double = double
        // double result = 1.5;
    }
}
// 자바에서 계산은 2가지를 기억하면 된다.
// 1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다. int + int = int    double + double = double
// 2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다. int + long = long + long    int + double = double + double
