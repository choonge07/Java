import java.util.UUID;

public class Taxi extends Transport implements Start, TaxiInterface {
    String pointLocation; // 목적지
    int distanceLocation;// 목적지까지 거리
    int distanceBase = 1; //기본거리
    int distanceCost = 1000;// 거리당 요금
    int sumCost = 0; // 누적요금
    int sumPassenger = 0;

    public Taxi() {
        super(100,0,4,3000,"일반");
    }

    @Override
    public void start() {
        UUID one = UUID.randomUUID();
        number = one.toString();
        System.out.println("Number = " + number);
        System.out.println("주유량 = " + gas);
        System.out.println("상태 = "+ state);
        System.out.println("- - - - - - - - - -");
    }

    @Override
    public void passenger(int passenger, String pointLocation, int distanceLocation) {
        int payCost = cost + (distanceLocation - distanceBase) * distanceCost;
        sumPassenger += passenger;
        sumCost += payCost;
        if (sumPassenger < 5 && state == "일반") {
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = "+ (maxPassenger - passenger));
            System.out.println("기본 요금 확인 = " + cost);
            System.out.println("목적지 = " + pointLocation);
            System.out.println("목적지까지거리 = "+ distanceLocation + "km");
            System.out.println("지불할 요금 = "+ payCost);
            state = "운행중";
            System.out.println("상태 = " + state);
            System.out.println("- - - - - - - - - -");
        }else {
            System.out.println("최대 승객 수 초과!!");
        }

    }

    @Override
    public void passenger(int passenger) {
        if (passenger >= 5) { //최대 승객 수 초과하면
            System.out.println("최대 승객 수 초과!!");
        }
    }

    @Override
    public void gas(int gas) {
        this.gas += gas;
        if (this.gas >= 10){ // 주유량 10 이상 운행 가능
            System.out.println("- - - - - - - - - -");
            System.out.println("요금 결제 완료!");
            System.out.println("- - - - - - - - - -");
            System.out.println("주유량 = " + this.gas);
            System.out.println("누적 요금 = " + sumCost);
            state = "일반";
            sumPassenger = 0;
        } else{
            state = "운행불가";
            System.out.println("- - - - - - - - - -");
            System.out.println("요금 결제 완료!");
            System.out.println("- - - - - - - - - -");
            System.out.println("주유량 = " + this.gas);
            System.out.println("상태 = " + state);
            System.out.println("누적 요금 = " + sumCost);
            System.out.println("- - - - - - - - - -");
            System.out.println("주유 필요!!");
        }

    }
}
