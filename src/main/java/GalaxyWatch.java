public class GalaxyWatch implements Watch {

    public GalaxyWatch() {
        System.out.println("log : 갤럭시워치 기본 생성자 \n");
    }

    @Override
    public void volumeUp() {
        System.out.println("갤럭시워치로 폰 음량 ++");
    }

    @Override
    public void volumeDown() {
        System.out.println("갤럭시워치로 폰 음량 --");
    }

}   //  GalaxyWatch
