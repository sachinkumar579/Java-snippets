import org.apache.tika.Tika;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class DetectMimeTypeFromContent {

    public static void main(String args[]) throws IOException {
        Tika tika = new Tika();

        Path path = new File("src/main/resources/test.csv").toPath();

        String fileContent = tika.detect(path.toFile());
        System.out.println(fileContent);

    }
}
