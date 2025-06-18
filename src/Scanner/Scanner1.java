package Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); // 입력을 String으로 가져온다.
        System.out.println("입력한 문자열: " + str );

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue );

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue );
    }
}
// Scanner scanner = new Scanner(System.in);
// 이 코드는 객체와 클래스를 배워야 정확히 이해할 수 있다. 지금은 Scanner의 기능을 사용하기 위해 new를 사용해서 Scanner를 만든다 정도로 이해하면 된다.
// Scanner는 System.in을 사용해서 사용자 입력을 편리하게 받도록 도와준다.
// Scanner scanner코드는 scanner변수를 선언하는 것이다.
// 주의할 점은 타입이 다르면 오류가 발생한다. 예를 들어 '정수를 입력하세요'라는 문구에 문자를 입력하면 오류가 발생한다.

// scanner.nextLine()    ->    엔터를 입력할 때 까지 문자를 가져온다.
// scanner.nextInt()     ->    입력을 int형으로 가져온다. 정수 입력에 사용한다.
// scanner.nextDouble()  ->    입력을 double형으로 가져온다. 실수 입력에 사용한다.

// print는 출력하고 다음 라인으로 넘기지 않는다.
// System.out.print("hello");
// System.out.print("world");
// 결과 : helloworld

// println은 출력하고 다음 라인으로 넘긴다.
// System.out.println("hello");
// System.out.println("world");
// 결과 :
// hello
// world

// => 엔터키를 치면 (\n)이라는 문자를 남기는 것이다. print의 마지막에 \n을 추가한 것이 println이다.
// 따라서 이렇게도 표현할 수 있다.
// System.out.print("hello\n");
// System.out.print("world\n");
// 결과 :
// hello
// world



