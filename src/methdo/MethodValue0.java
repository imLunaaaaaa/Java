package methdo;

public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;  // num1의 값은 5이다. num1(5)  ---   num2 변수에 대입하기 전에 num1의 값 5를 먼저 읽는다. int num2 = 5 ->  num1(5), num2(5)
        num2 = 10;        // num2에 10을 대입한다.  결과 -> num1(5), num2(10)

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

// ***** 자바에서 가장 중요한 대원칙 1 *****
// ***** 자바는 항상 변수으이 값을 복사해서 대압힌다. *****
// 여기서 값을 복사해서 대입한다는 부분이 여기다. int num2 = num1;
// 이 부분은 num1에 있는 5를 복사해서 num2에 넣는 것이다.
// 복사한다고 표현한 이유는 num1의 값을 읽어도 num1의 기존 값은 유지되고, 새로운 값이 num2에 들어가기 때문에 마치 num1의 값이 num2에 복사된 것 같다.
// 간단하게 대입한다고 표현하지만, num1이라는 변수 자체가 num2에 들어가는 것은 아니다. num1의 값을 복사해서 num2에 넣는 것이다.
