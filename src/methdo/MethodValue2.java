package methdo;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        changeNumber (number);  // changeNumber를 호출한다. main의 number(5)
        System.out.println("4. changeNumber 호출 후, number: " + number);
    }


    // main의 number 5가 changeNumber의 number에 복사된다. -> 결과는 main의 number(5), changeNumber의 number(5)
    public static  void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number);
        number = number * 2;   // changeNumber의 number에 값 10을 대입한다.  ->  결과는 main의 number(5), changeNumber의 number(10)
        System.out.println("3. changeNumber 변경 후, number: " + number);
    }

}
// main에 정의한 변수와 메서드의 매개변수(파라미터)의 이름이 둘 다 number로 같다.
// 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 변수이다. 이름이 같아도 완전히 다른 변수이다.
// 따라서 main의 number와 changeNumber의 number는 서로 다른 변수이다.