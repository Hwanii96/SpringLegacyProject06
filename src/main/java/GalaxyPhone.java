public class GalaxyPhone implements Phone {

    //  멤버변수 (프로퍼티)
    private GalaxyWatch galaxyWatch;
    private String testMessage; //  .xml 설정 파일을 통해 GalaxyPhone 이 제대로 객체화가 되는지 확인을 위한 멤버변수 선언.

    //  생성자
    public GalaxyPhone() {
        System.out.println("log : 갤럭시폰 기본 생성자 \n");
    }

    public GalaxyPhone(GalaxyWatch galaxyWatch) {
        this.galaxyWatch = galaxyWatch;
        System.out.println("log : 갤럭시폰 인자 1개 짜리 생성자 \n");
    }

    public GalaxyPhone(GalaxyWatch galaxyWatch, String testMessage) {
        this.galaxyWatch = galaxyWatch;
        this.testMessage = testMessage;
        System.out.println("log : 갤럭시폰 인자 2개 짜리 생성자");
        System.out.println("log : testMessage : " + this.testMessage + "\n");
    }


    //  메서드
    @Override
    public void powerOn() {
        System.out.println("갤럭시폰 전원 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("갤럭시폰 전원 OFF");
    }

    @Override
    public void volumeUp() {    //  갤럭시워치로 폰 음량 ++
        galaxyWatch.volumeUp();
    }

    @Override
    public void volumeDown() {  //  갤럭시워치로 폰 음량 --
        galaxyWatch.volumeDown();
    }


}   //  GalaxyPhone