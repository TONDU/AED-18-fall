
//2
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Parse {
	public static void parse(File file) throws IOException {
		RandomAccessFile input = null;
		String line = null;
		try {
			input = new RandomAccessFile(file, "r");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}
}
