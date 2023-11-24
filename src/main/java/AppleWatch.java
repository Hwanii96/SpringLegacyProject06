public class AppleWatch implements Watch {

    public AppleWatch() {
        System.out.println("log : 애플워치 기본 생성자 \n");
    }

    @Override
    public void volumeUp() {
        System.out.println("애플워치로 폰 음량 ++");
    }

    @Override
    public void volumeDown() {
        System.out.println("애플워치로 폰 음량 --");
    }

}   //  AppleWatch
