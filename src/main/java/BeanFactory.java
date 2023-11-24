public class BeanFactory {

    public Object getBean(String beanName) {    //  반환 타입 => Object

        if (beanName.equals("갤럭시폰")) {
            return new GalaxyPhone();
        } else if (beanName.equals("아이폰")) {
            return new IPhone();
        }
        return null;
    }

}   //  BeanFactory (객체의 이름 (키워드) 을 받아서 객체 자체를 반환 해주는 클래스)
