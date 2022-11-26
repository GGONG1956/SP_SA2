import java.util.Random;

public class BsuService {
    public static void main(String[] args) {

        Bus bus = new Bus();
        int car_num = bus.create();
        bus.setCar_num(car_num);

        Bus bus2 = new Bus();
        int car_num2 = bus.create();
        bus2.setCar_num(car_num2);

        bus.Print("첫");
        bus2.Print("두");

        bus.Add_person(2);

        bus.Run(50);

        bus.Run_ch("차고지행");

        bus.Run_ch("운행");

        bus.Add_person(45);

        bus.Add_person(5);

        bus.Run(55);
    }
}
