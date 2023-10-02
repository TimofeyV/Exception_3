package Main;

import java.io.File;
import static Main.CheckUtils.parseUserData;
import static Main.CheckUtils.userInput;

    public class Main {
        public static void main(String[] args) {
            String[] data = parseUserData(userInput());
            String fileName = data[0] + ".txt";
            WriteToFile.writeUserData(data,fileName);
        }
    }

