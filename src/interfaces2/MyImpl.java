package interfaces2;

public class MyImpl extends MyAbstractClass {

    public MyImpl(String myJob) {
        super(myJob);
    }

    @Override
    void doSomething() {
        System.out.println("I am doing something impl");
    }

    void doMore() {
        System.out.println("I am doing more");
    }

}
