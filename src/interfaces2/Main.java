package interfaces2;

public class Main {

    public static void main(String[] args) {
        MyAbstractClass myAbstractClass = new MyImpl("Some Job");
        myAbstractClass.doSomething();
        myAbstractClass.doSomethingElse();

        MyImpl myImpl = (MyImpl)myAbstractClass;
        myImpl.doMore();

        ((MyImpl)myAbstractClass).doMore();
    }

}
