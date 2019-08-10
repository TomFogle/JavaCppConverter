import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;

public class Parser {
    public static void main(String[] args) throws FileNotFoundException {
        String input = "JavaCode0";
        File outputFile = new File(input + "cpp.txt");
        File inputFile = new File("/Users/Tom/IdeaProjects/JavaCppConverter/src/JavaCode0");
        Scanner scan = new Scanner(inputFile);
        String token;
        HashSet<String> importSet = new HashSet<>();
        while (scan.hasNext()) {
            token = scan.next();
            if (token.equals("import")) {
                token = scan.next();
                String[] splitToken = token.split(".");
                if (splitToken.length == 3) {
                    if (splitToken[0] == "java") {
                        if (splitToken[1] == "util") {
                            if (splitToken[2] == "Scanner") {
                                importSet.add(splitToken[2]);
                            }
                        }
                    }
                }
            }
        }

    }
}
