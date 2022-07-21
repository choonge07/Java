import java.util.UUID;

public class Bus extends Transport implements BusInterface,Start{
    int countPassenger;
    public Bus() {
        super(100,0,30,1000,"운행중");
    }

    @Override
    public void passenger(int passenger) {
        countPassenger += passenger;
        if (countPassenger <= 30 && state == "운행중"){ //최대 승객 수 이하까지만
            System.out.println(passenger + "명이 탑승했습니다.");
            System.out.println("- - - - - - - - - -");
            System.out.println("탑승 승객 수 = " + countPassenger);
            System.out.println("잔여 승객 수 = " + (maxPassenger - passenger));
            System.out.println("요금 확인 = " + (passenger*cost));
            System.out.println("- - - - - - - - - -");
        } else{;
            System.out.println("- - - - - - - - - -");
            System.out.println("최대 승객 수 초과!!");
            System.out.println("- - - - - - - - - -");
            countPassenger = 0;
        }

    }

    @Override
    public void gas(int gas) {
        this.gas += gas;
        if (gas < 0 && this.gas >= 10){
            System.out.println("주유량 = " + this.gas);
            state = "차고지행";
            System.out.println("- - - - - - - - - -");
            System.out.println("상태를 변경합니다. (차고지행)");
            System.out.println("- - - - - - - - - -");
        } else if(gas > 0){
            System.out.println("상태 = " + state);
            System.out.println("주유량 = " + this.gas);
            state = "운행중";
            System.out.println("- - - - - - - - - -");
            System.out.println("상태를 변경합니다. " + "(" + state + ")");
            System.out.println("- - - - - - - - - -");
        } else if(this.gas < 10) {
            System.out.println("주유량 = " + this.gas);
            state = "차고지행";
            System.out.println("상태 = " + state);
            System.out.println("주유 필요!! 주유량을 확인해주세요.");
        }


    }

    @Override
    public void start() {
        UUID one = UUID.randomUUID();
        number = one.toString();
        System.out.println("Number = " + number);
    }
}
