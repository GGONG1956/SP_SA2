import java.util.Scanner;

public abstract class Transport {
    Scanner sc = new Scanner(System.in);
    protected int car_num;
    protected int oil = 100;
    protected int speed;
    protected int speed_cg;
    protected int current_person;
    protected int person_max;

    protected int fare;
    protected String run = "운행";


    public void setCar_num(int car_num) {
        this.car_num = car_num;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPerson_max() {
        return person_max;
    }


    public int getCurrent_person() {
        return current_person;
    }

    public void setCurrent_person(int current_person) {
        this.current_person = current_person;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }


    public void Print(String str) {
        System.out.println(str + "번째 버스번호 : " + car_num);
    }

    public int getFare() {
        return fare;
    }


    public void Run(int oil) {
        setOil(getOil() - oil);
        System.out.println("주유량 = " + getOil());
        if (getOil() < 10) {
            System.out.println("주유량 = " + getOil());
            setRun("차고지행");
            System.out.println("상태 = " + getRun());
            System.out.println("주유 필요");
        }
    }

    public void Add_person(int person) {
        if (getRun().equals("운행")) {
            if ((getCurrent_person() + person) > getPerson_max()) {
                System.out.println("최대 승객 수 초과");
            } else {
                setCurrent_person(getCurrent_person() + person);
                System.out.println("탑승 승객 수 : " + person);
                System.out.println("잔여 승객 수 : " + (getPerson_max() - getCurrent_person()));
                System.out.println("요금 확인 : " + (getCurrent_person() * getFare()));
            }
        }


    }

    public void Run_ch(String run) {
        if (run.equals("차고지행")) {
            setRun("차고지행");
            setOil(getOil() + 10);
            System.out.println("상태 : " + getRun());
            System.out.println("주유량 = " + getOil());
            setCurrent_person(0);
        } else if (run.equals("운행")) {
            setRun("운행");
        }
    }

    public void Speed_ch() {
        System.out.println("현재 속도 : " + speed);
        System.out.print("변경할 속도 : ");
        int speed_ch = sc.nextInt();
        setSpeed(speed_ch);

    }

    public int create(){
        int num = (int)(Math.random() * (9999 - 1000 + 1)) + 1000;
        return num;
    }

}
