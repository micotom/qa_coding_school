package interfaces2;

public abstract class MyAbstractClass {

    public final String myJob;

    public MyAbstractClass(String myJob) {
        this.myJob = myJob;
    }

    abstract void doSomething();

    void doSomethingElse() {
        System.out.println("I am doing something else");
    }

}
