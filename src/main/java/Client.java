import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        //  스프링 프레임워크의 applicationContext.xml 파일을 자바에서 테스트 하기 위해서 AbstractApplicationContext 클래스 사용.
        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

        factory.close();    //  메모리 누수를 막기 위한 close() 메서드. (객체를 모두 소멸 시킨다)

        //  이렇게 .xml 설정 파일을 사용 해서, 원하는 클래스를 new 키워드 없이 <bean> 태그를 사용 해서 객체화 할 수 있다.
        //  알아서 인자의 개수를 파악 해서 해당 하는 생성자를 호출 한다.

        /*

        또한, 콘솔창을 확인 하면 아래와 같은 순서로 로그가 찍힌 것을 확인 할 수 있다.

        log : 갤럭시워치 기본 생성자

        log : 갤럭시폰 인자 2개 짜리 생성자
        log : testMessage : GalaxyPhone Test Message !

        log : 아이폰 기본 생성자

        log : 애플워치 기본 생성자

        applicationContext.xml 설정 파일에는 차례대로,

        갤럭시폰
        갤럭시워치
        아이폰
        애플워치

        순으로 <bean> 태그를 작성 했다.

        그런데, 처음 갤럭시폰을 객체화 하기 위해서는, 갤럭시워치가 선행 되어 객체화가 이루어져 있어야 했기 때문에,
        똑똑하게 갤럭시워치가 먼저 객체화 된것을 확인 할 수 있다.
         */

    }   //  main()

}   //  Client
