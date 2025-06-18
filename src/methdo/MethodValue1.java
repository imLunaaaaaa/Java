package methdo;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        changeNumber (num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1);
    }

    public static  void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);

    }
}
// 실행과정
// changeNumber(num1);  ->  changeNumber를 호출한다. num1(5)
// changeNumber(5);     -> num1의 값을 읽는다.
// void changeNumber(int num2)  ->  num1의 값 5가 num2에 복사된다. 따라서 num1(5), num2(5)
// num2 = num2 * 2   ->   num2에 2를 곱한다.
// num2 = 5 * 2   ->  num2의 값에 2를 곱한다. 따라서 num1(5), num2(10)
// => num2 출력 : 10 , num1 출력 : 5
// => 총 정리 : 매개변수 num2만 10으로 변경되고 num1은 변경되지 않고 기존 값인 5로 유지된다. 자바는 항상 값을 복사해서 전달하기 때문에 num2의 값을 바꾸지 않더라도 num1에는 영향을 주지 않는다.
