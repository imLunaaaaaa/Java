package methdo;

public class Method2 {
    public static void main(String[] args) {
        printHeader();   // String str = printHeader();  ->  컴파일 오류 발생
        System.out.println("프로그램이 동작합니다");
        printFooter();
    }
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
        // return을 안 넣었지만 자바가 알아서 넣어줌 -> void이기 때문
    }
}
// printHeader(), printFooter() 둘 다 매개변수와 반환타입이 없다.

// 매개변수가 없는 경우
// 선언 : public static void printHeader()와 같이 매개변수를 비워두고 정의하면 된다.
// 호출 : printHeader();와 같이 인수를 비워두고 호출하면 된다.

// 반환타입이 없는 경우
// 선언 : public static void printHeader()와 같이 반환타입을 void로 정의하면 된다.
// 호출 :  printHeader();와 같이 반환타입이 없으므로 메서드만 호출하고 반환 값을 받지 않으면 된다.
// String str = printHeader();   ->  반환타입이 void이기 때문에 이렇게 반환 값을 받으면 컴파일 오류가 발생한다.


// void와 return 생략
// 모든 메서드는 항상 return을 호출해야 한다. 그런데 반환타입 void는 예외로 printFooter()처럼 생략해도 된다.
// 자바 컴파일러가 반환타입이 없는 경우 return을 마지막 줄에 넣어준다. 참고로 return을 만나면 해당 메서드는 종료된다.
