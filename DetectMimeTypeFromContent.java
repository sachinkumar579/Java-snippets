import org.apache.tika.Tika;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DetectMimeTypeFromContent {

    public static void main(String args[]) throws IOException {
        Tika tika = new Tika();

        Path path = new File("src/main/resources/test").toPath();
        Path pathTxt = new File("src/main/resources/test.txt").toPath();

        // Apache-Tika Returns mime type even when there is no file extension
        String fileContent = tika.detect(path.toFile());
        System.out.println(fileContent);

        String mimeType = Files.probeContentType(pathTxt);
        System.out.println(mimeType);

    }
}
