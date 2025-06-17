package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        // 배열에 있는 값을 순서대로 읽어서 number변수에 넣고, 출력한다.
        // 배열의 값을 읽으려면 int i와 같은 인덱스를 탐색할 수 있는 변수를 선언해야 한다.
        // 그리고 i < numbers.length와 같이 배열의 끝 조건을 지정해줘야 한다.
        // 마지막으로 배열의 값을 하나 읽을 때 마다 인덱스를 하나씩 증가해야 한다.

        // 번잡하기 때문에 향상된 for문이 등장했다.

        // 향상된 for문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }
        // 일반 for문과 동일하게 작동한다.
        // 향상된 for문은 배열의 인덱스를 사용하지 않고, 종료 조건을 안줘도 된다. 해당 배열을 처음부터 끝까지 탐색한다.
        // :의 오른쪽에 numbers와 같이 탐색할 배열을 선택하고
        // :의 왼쪽에 int number와 같이 반복할 때 마다 찾은 값을 저장할 변수를 선언한다.
        // 그러면 배열의 값을 하나씩 꺼내서 왼쪽에 있는 number에 담고 for문을 수행한다.
        // for문의 끝에 가면 다음 값을 꺼내서 number에 담고 for문을 반복 수행한다. numbers 배열의 끝에 도달해서 더 값이 없으면 종료된다.
        // 향상된 for문은 배열의 인덱스를 사용하지 않고도 배열의 요소를 순회할 수 있기 때문에 코드가 간결하고 가독성이 좋다.

        // for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는:" + numbers[i]);
        }
        // 향상된 for문에는 index값이 감추어져 있다. 따라서 int i와 같은 증가하는 값을 직접 사용해야 하는 경우에는 사용불가하다.  ㅡㅡㅡㅡㅡㅡ
    }
}
