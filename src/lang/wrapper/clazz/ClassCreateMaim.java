package lang.wrapper.clazz;

public class ClassCreateMaim {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
//        Class helloClass  = Class.forName("lang.clazz.hello");

        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
