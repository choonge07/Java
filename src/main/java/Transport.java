public class Transport {
    String number;// 번호
    int gas;// 주유량
    int speed;// 속도
    int changeSpeed;// 속도변경
    int maxPassenger;// 최대 승객 수
    int cost;// 기본 요금
    String state;//상태

    public Transport(int gas, int speed, int maxPassenger, int cost, String state) {
        this.gas = gas;
        this.speed = speed;
        this.maxPassenger = maxPassenger;
        this.cost = cost;
        this.state = state;
    }

    public void changeSpeed(int changeSpeed) {
        speed += changeSpeed;
        System.out.println("속도를 변경합니다");
        System.out.println("현재속도 = " + speed + "km/h");
        System.out.println("- - - - - - - - - -");
    }
}
