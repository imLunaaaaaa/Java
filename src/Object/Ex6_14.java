class Car2 {
    String color;
    String gearType;
    int door;

    Car2 () {
        this("white", "auto", 4); // 첫 줄       // this = Car2 -> 같은 클래스 안에 있는 생성자들끼리 호출할 때 this사용
                                                                    // 다른 생성자 호출 시 첫 줄에서만 사용가능
    }
                                                            // 1, 2번 생성자가 3번 생성자인 Car2(String color, String gearType, int door)를 호출
    Car2(String color) {
        this(color, "auto", 4);           // 첫 줄
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color: " + c1.color + ", gearType: " + c1.gearType + ", door: " + c1.door);
        System.out.println("c2의 color: " + c2.color + ", gearType: " + c2.gearType + ", door: " + c2.door);
    }
}