package methdo;

public class Overloading2 {
    public static void main(String[] args) {
        myMethod(1,1.2);
        myMethod(1.2,1);

    }
    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}
// 두 수, 세 수를 더하는 메서드 모두 더하는 메서드이기 때문에 같은 add를 사용한다.
// add(int a, int b)
// add(int a, int b, int c) -> 변수 이름은 b, c등 뭘 써도 상관없음
// add(double a, double b)
// -> 이렇게 이름이 같고 매개변수가 다른 메서드를 여러 개 정의하는 것을 오버로딩이라 한다.

// 오버로딩 규칙
// 메서드의 이름이 같아도 매개변수의 타입과 순서가 다르면 오버로딩을 할 수 있다. 반환 타입은 인정하지 않는다.
// int add(int a, int b)
// double add(int a, int b)
// -> 이 코드들은 메서드 이름(add)과 매개변수 타입(int)이 같으므로 오류가 발생한다. 반환타입은 int와 double로 서로 다르지만 위에서 말했듯이 반환타입은 인정하지 않는다.
// 메서드 시그니처 = 메서드 이름 + 매개변수 타입(순서)
// -> 메서드 시그니처는 자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명을 뜻한다. 쉽게 이야기해서 메서드를 구분할 수 있는 기준이다.
// 자바 입장에서는 각각의 메서드를 고유하게 구분할 수 있어야 어떤 메서드를 호출 할 지 결정할 수 있다.
// 따라서 메서드 이름이 같아도 시그니처가 다르면 다른 메서드로 간주한다. 반환타입은 포함하지 않는다.
// 위에 코드에서 add(int a, int b)로 메서드 시그니처가 같아서 구분이 불가능하므로 오류가 발생한다.

// ex)
// int add(int a, int b)
// int add(int c, int d)
// -> 오류 발생, 두 코드가 타입이 int로 동일함