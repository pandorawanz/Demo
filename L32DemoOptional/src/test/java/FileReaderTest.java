import org.junit.Test;

import java.util.Optional;

public class FileReaderTest {
    String path1 = "res/1.txt";
    String path2 = "res/2.txt";
    String path3 = "res/3.txt";
    String path4 = "res/4.txt";
    String path5 = "res/5.txt";
    String path6 = "res/6.txt";

    /*
     * path1: No Content
     * path2: No Content
     * path3: "This is the 3rd file!"
     * path4:"This is the\n4th file!"
     * path5: No Such File
     * path6: No Such File
     */

    // 两个不含内容文件，输出No Content
    @Test
    public void shouldReadNothing() {
        System.out.println("Test1：");
        FileReader fileReader = new FileReader(path1, path2);
        File file = fileReader.readFile().orElse(new File());
        System.out.println("Content: " + file.getContent());
    }

    // 第一个文件不含内容，第二个文件不存在
    @Test
    public void shouldReadNothing2() {
        System.out.println("Test2：");
        FileReader fileReader = new FileReader(path1, path5);
        File file = fileReader.readFile().orElse(new File());
        System.out.println("Content: " + file.getContent());
    }

    // 第一个文件不存在，第二个文件不含内容
    @Test
    public void shouldReadNothing3() {
        System.out.println("Test3：");
        FileReader fileReader = new FileReader(path5, path1);
        File file = fileReader.readFile().orElse(new File());
        System.out.println("Content: " + file.getContent());
    }

    // 两个文件不存在
    @Test
    public void shouldReadNothing4() {
        System.out.println("Test4：");
        FileReader fileReader = new FileReader(path5, path6);
        File file = fileReader.readFile().orElse(new File());
        System.out.println("Content: " + file.getContent());
    }

    // 第一个文件含内容，第二个文件不含内容，输出第一个文件内容
    @Test
    public void shouldReadFirstFile() {
        System.out.println("Test5：");
        FileReader fileReader = new FileReader(path3, path2);
        File file = fileReader.readFile().orElse(new File());
        System.out.println("Content: " + file.getContent());
    }

    // 第一个文件含内容，第二个文件含内容，输出第一个文件内容
    @Test
    public void shouldReadFirstFile2() {
        System.out.println("Test6：");
        FileReader fileReader = new FileReader(path3, path4);
        File file = fileReader.readFile().orElse(new File());
        System.out.println("Content: " + file.getContent());
    }

    // 第一个文件含内容，第二个文件不存在，输出第一个文件内容
    @Test
    public void shouldReadFirstFile3() {
        System.out.println("Test7：");
        FileReader fileReader = new FileReader(path3, path5);
        File file = fileReader.readFile().orElse(new File());
        System.out.println("Content: " + file.getContent());
    }

    // 第一个文件不含内容，第二个文件含内容，输出第二个文件内容
    @Test
    public void shouldReadSecondFile() {
        System.out.println("Test8：");
        FileReader fileReader = new FileReader(path1, path4);
        File file = fileReader.readFile().orElse(new File());
        System.out.println("Content: " + file.getContent());
    }

    // 第一个文件不存在，第二个文件含内容，输出第二个文件内容
    @Test
    public void shouldReadSecondFile2() {
        System.out.println("Test9：");
        FileReader fileReader = new FileReader(path5, path4);
        File file = fileReader.readFile().orElse(new File());
        System.out.println("Content: " + file.getContent());
    }



}
