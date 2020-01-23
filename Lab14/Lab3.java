package lab14;
import java.io.*;

public class Lab3 {

    public static void main(String[] args) {
        File src = new File("/home/vvmoskalenko/IdeaProjects/JAVA_KPI/src/Lab14/src.txt");
        File dst = new File("/home/vvmoskalenko/IdeaProjects/JAVA_KPI/src/Lab14/dst.txt");
        copy(src,dst);
    }

    public static File copy(File src, File dst) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(src));
            BufferedWriter bw = new BufferedWriter(new FileWriter(dst));
            String strRead = null;
            while ((strRead = br.readLine()) != null) {
                if (strRead.isEmpty()) continue;
                bw.write(strRead);
                bw.newLine();
            }
            bw.close();
            br.close();
            } catch (Exception e) {
           System.err.println("Error file");
        }
        return dst;
    }
}