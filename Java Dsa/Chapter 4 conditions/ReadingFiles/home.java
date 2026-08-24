package ReadingFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class home {
    public static void main(String[] args) throws IOException {
        Scanner fileScan,urlScan;
        String url;

        fileScan = new Scanner(new File("ReadingFiles/Websites.txt"));

        while (fileScan.hasNext()) {
            url = fileScan.nextLine();
            System.out.println("URL: " + url);

            urlScan = new Scanner(url);
            urlScan.useDelimiter("/");

            while (urlScan.hasNext()) {
                System.out.println(" "+ urlScan.next());
                System.out.println();
            }
        }

    }
}
