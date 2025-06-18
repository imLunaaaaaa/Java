package methdo;

public class MethodValue2 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        changeNumber (num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1);
    }

    public static  int changeNumber(int num2) {
        num2 =  num2 * 2;
        return num2;
    }
}
// main에 정의한 변수와 메서드의 매개변수(파라미터)의 이름이 둘 다 number로 같다.
// 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 변수이다. 이름이 같아도 완전히 다른 변수이다.
// 따라서 main의 number와 changeNumber의 number는 서로 다른 변수이다.