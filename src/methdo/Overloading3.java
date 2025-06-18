package methdo;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2,1.5));

    }
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
// 만약 첫 번째 메서드(1번호출 코드블록)를 삭제하면 3.0으로 호출이 된다. int타입으로 1, 2지만 double로 자동형변환 가능하기 때문이다.
// 총 정리 => 먼저 본인 타입에 최대한 맞는 메서드를 찾아서 실행하고, 그래도 없으면 형 변환 가능한 타입의 메서드를 찾아서 실행한다.
