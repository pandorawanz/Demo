public class Sync {
    public static void main(String args[]) {
        Callme target = new Callme();   // 被三个线程共享的资源
        Caller ob1 = new Caller(target,"Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target,"World");
    }
}
/*
    public static void main(String args[]) throws InterruptedException{
        Callme target=new Callme();   // 被三个线程共享的资源
        Caller ob1=new Caller(target,"Hello");
        ob1.t.join();
        Caller ob2=new Caller(target,"Synchronized");
        ob2.t.join();
        Caller ob3=new Caller(target,"World");
        ob3.t.join();
        }
        */