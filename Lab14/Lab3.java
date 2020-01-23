package lab14;
import java.io.*;

public class Lab3 {

    public static void main(String[] args) {
        File src = new File("/src.txt");
        File dst = new File("/dst.txt");
        copy(src,dst);
    }

    public static File copy(File src, File dst) {
    //    try {
            BufferedReader br = new BufferedReader(new FileReader(src));
            System.out.println("1");
            BufferedWriter bw = new BufferedWriter(new FileWriter(dst));
            System.out.println("2");
            String strRead = null;
            while ((strRead = br.readLine()) != null) {
                bw.write(strRead);
                bw.newLine();
                System.out.println("3");
            }
            bw.close();
            System.out.println("4");
            br.close();
            System.out.println("5");
//            } catch (Exception e) {
//           System.err.println("Error file");
//        }
        return dst;
    }
}