package lang.object.tosring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2 println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3 Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
        
        //참조값 확인
         Integer i=System.identityHashCode(dog1);
        String refValue = Integer.toHexString(i);
        System.out.println("refValue = " + refValue);
        Integer i2=System.identityHashCode(dog2);
        String refValue2 = Integer.toHexString(i2);
        System.out.println("refValue = " + refValue2);
    }
}
