class Data_1 {
            int value;
//            Data_1() {} // 기본 생성자 추가 -> 없어도 됨. 생성자가 하나도 없어서 컴파일러가 자동으로 넣어줌
        }

        class Data_2 {
            int value;

            Data_2() {}  // 기본 생성자 -> 위에서는 생성자가 하나도 없었지만 여긴 바로 아랫줄에 생성자가 이미 하나 있음
                         // -> 모든 클래스는 반드시 하나 이상의 생성자가 있어야 한다는 규칙을 이미 가짐. 그래서 컴파일러가 자동으로 추가 안해줌
            Data_2(int x) {     // 매개변수가 있는 생성자
                value = x;
            }
        }

        class Ex6_11 {
            public static void main(String[] args) {
                Data_1 d1 = new Data_1();
                Data_2 d2 = new Data_2();  // Data_2()로 생성자 호출 했는데 없어서 컴파일 에러 발생  ->  위에서 기본 생성자 만들어줘서 에러 해결
            }
        }

