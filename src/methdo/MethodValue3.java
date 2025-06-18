package methdo;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1);
        num1 = changeNumber(num1);  //num1(5) 따라서  num1 = changeNumber(5);
        System.out.println("changeNumber 호출 후, num1: " + num1);
    }

    //changeNumber() 호출 시작
    //num1의 값 5가 num2에 대입된다. num1의 값을 num2에 복사한다.  -> num1(5), num2(5)
    public static  int changeNumber(int num2) {
        num2 =  num2 * 2;  // 계산 결과 num1(5), num2(10)
        return num2;    // num2의 값은 10
    }
}
// => 총 정리 : 자바는 항상 변수의 값을 복사해서 대입한다는 것을 꼭!!!! 기억하자