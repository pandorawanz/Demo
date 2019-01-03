package user.model;

public class User {
    private String name;
    private String content;

    public User() {
        // default constructor for spring mapping
        // Spring中不可以省略空构造方法
    }

    public User(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

}
