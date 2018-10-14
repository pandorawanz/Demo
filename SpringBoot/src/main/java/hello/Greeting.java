package hello;

// Spring会自动调用这两个参数的getter方法，去获得成员变量的值，然后构造一个json的返回结果
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    // 必须有get，Spring 默认调用有get方法的参数，转换成json
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
