package methdo;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);

    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return;
        }

        System.out.println(age + "살, 입장하세요.");
    }
}
// 18세 미만인 경우 "미성년자는 출입이 불가능합니다"를 출력하고 바로 return문이 수행된다. 따라서 다음 로직이 수행되지 않고 해당 메서드를 빠져 나온다.
// 18세 이상인 경우 "입장하세요"를 출력하고 메서드가 종료된다. 참고로 반환 타입이 없는 void형이기 때문에 마지막 줄의 return문은 생략할 수 있다.
// 반환 타입이 있는 메서드를 호출했는데 만약 반환 값이 필요없다면 사용하지 않아도 된다.
// ex) int sum = add(1,2)  ->  반환 값을 받아서 sum에 저장했다.
// add (1,2)  ->  반환된 값을 사용하지 않고 버린다.