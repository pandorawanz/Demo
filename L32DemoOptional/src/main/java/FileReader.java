import java.io.IOException;
import java.util.Optional;

public class FileReader {
    private String path1;
    private String path2;

    public FileReader(String path1, String path2) {
        this.path1 = path1;
        this.path2 = path2;
    }

    public Optional<File> readFile() {
        try {
            File file = new File(path1);
            file.readToString();
            if (!file.getContent().equals("")) {
                return Optional.of(file);
            }
        } catch (IOException e) {
            System.out.println("IOException occurs when reading from path1.");
        }
        try {
            File file = new File(path2);
            file.readToString();
            if (!file.getContent().equals("")) {
                return Optional.of(file);
            }
        }catch (IOException e) {
            System.out.println("IOException occurs when reading from path2.");
        }
        return Optional.empty();
    }
}
