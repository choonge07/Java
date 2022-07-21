import com.sun.xml.internal.bind.v2.runtime.unmarshaller.AttributesExImpl;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("어떤 것을 선택하시겠습니까? (Bus/Taxi)");
        String name = sc.next();
        System.out.println(name + "가 선택되었습니다.");
        System.out.println("- - - - - - - - - -");
        System.out.println("몇 대를 생성하시겠습니까?");
        int count = sc.nextInt();
        System.out.println("- - - - - - - - - -");
        System.out.println(count + "대가 생성 되었습니다.");


        if (name.equals("bus") || name.equals("Bus")){
            Transport bus = new Bus();
            if (bus instanceof Start){
                ((Start) bus).start();
            }
            Transport bus2 = new Bus();
            if (bus2 instanceof Start){
                ((Start) bus2).start();
            }
            System.out.println("- - - - - - - - - -");
            System.out.println("몇 대를 운행 하시겠습니까?");
            count = sc.nextInt();
            System.out.println("- - - - - - - - - -");
            System.out.println(count + "대를 운행합니다.");
            System.out.println("- - - - - - - - - -");
            System.out.println("속도를 몇으로 조절하시겠습니까?");
            int changerSpeed = sc.nextInt();
            bus.changeSpeed(changerSpeed);

            System.out.println("승객을 몇 명 태우시겠습니까?");
            int passenger = sc.nextInt();
            if (bus instanceof BusInterface) {
                ((BusInterface) bus).passenger(passenger);
            }
            System.out.println("주유량이 감소합니다. 얼마나 감소합니까?");
            int gas = sc.nextInt();
            if (bus instanceof BusInterface) {
                ((BusInterface) bus).gas(gas);
            }
            System.out.println("주유를 시작합니다. 얼마나 넣으시겠습니까?");
            gas = sc.nextInt();
            if (bus instanceof BusInterface) {
                ((BusInterface) bus).gas(gas);
            }
            System.out.println("승객을 몇 명 태우시겠습니까?");
            passenger = sc.nextInt();
            if (bus instanceof BusInterface) {
                ((BusInterface) bus).passenger(passenger);
            }
            System.out.println("승객을 몇 명 태우시겠습니까?");
            passenger = sc.nextInt();
            if (bus instanceof BusInterface) {
                ((BusInterface) bus).passenger(passenger);
            }
            System.out.println("주유량이 감소합니다. 얼마나 감소합니까?");
            gas = sc.nextInt();
            if (bus instanceof BusInterface) {
                ((BusInterface) bus).gas(gas);
            }
        }else {
            Transport taxi = new Taxi();
            if (taxi instanceof Start) {
                ((Taxi) taxi).start();
            }
            Transport taxi2 = new Taxi();
            if (taxi2 instanceof Start) {
                ((Taxi) taxi2).start();
            }
            System.out.println("몇 대를 운행 하시겠습니까?");
            count = sc.nextInt();
            System.out.println("- - - - - - - - - -");
            System.out.println(count + "대를 운행합니다.");
            System.out.println("- - - - - - - - - -");
            System.out.println("속도를 몇으로 조절하시겠습니까?");
            int changerSpeed = sc.nextInt();
            taxi.changeSpeed(changerSpeed);
            System.out.println("승객을 몇 명 태우시겠습니까?");
            int passenger = sc.nextInt();
            System.out.println("목적지는 어디입니까?");
            String pointLocation = sc.next();
            System.out.println("목적지까지 거리가 얼마입니까?");
            int distanceLocation = sc.nextInt();
            if (taxi instanceof TaxiInterface){
                ((Taxi) taxi).passenger(passenger,pointLocation,distanceLocation);
            }
            System.out.println("주유량이 감소합니다. 얼마나 감소합니까?");
            int gas = sc.nextInt();
            if (taxi instanceof TaxiInterface) {
                ((Taxi) taxi).gas(gas);
            }
            System.out.println("승객을 몇 명 태우시겠습니까?");
            passenger = sc.nextInt();
            if (taxi instanceof TaxiInterface) {
                ((Taxi) taxi).passenger(passenger);
            }
            System.out.println("승객을 몇 명 태우시겠습니까?");
            passenger = sc.nextInt();
            System.out.println("목적지는 어디입니까?");
            pointLocation = sc.next();
            System.out.println("목적지까지 거리가 얼마입니까?");
            distanceLocation = sc.nextInt();
            if (taxi instanceof TaxiInterface) {
                ((Taxi) taxi).passenger(passenger, pointLocation, distanceLocation);
            }
            System.out.println("주유량이 감소합니다. 얼마나 감소합니까?");
            gas = sc.nextInt();
            if (taxi instanceof TaxiInterface) {
                ((Taxi) taxi).gas(gas);
            }
        }
    }
}
