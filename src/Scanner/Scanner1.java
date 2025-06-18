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

// scanner.nextLine()    ->    엔터를 입력할 때 까지 문자를 가져온다.
// scanner.nextInt()     ->