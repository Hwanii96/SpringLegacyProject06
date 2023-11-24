public class IPhone implements Phone {

    public IPhone() {
        System.out.println("log : 아이폰 기본 생성자 \n");
    }

    @Override
    public void powerOn() {
        System.out.println("아이폰 전원 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("아이폰 전원 OFF");
    }

    @Override
    public void volumeUp() {
        System.out.println("아이폰 볼륨 UP");
    }

    @Override
    public void volumeDown() {
        System.out.println("아이폰 볼륨 DOWN");
    }

    /*
    public void turnOn() {
        System.out.println("아이폰 전원 ON");
    }

    public void turnOff() {
        System.out.println("아이폰 전원 OFF");
    }

    public void soundUp() {
        System.out.println("아이폰 볼륨 UP");
    }

    public void soundDown() {
        System.out.println("아이폰 볼륨 DOWN");
    }
    */

}   //  IPhone