import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        File f = new File("./docs/English.txt");
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.length());
        byte[] content = new byte[(int)f.length()];
        try(
            FileInputStream fs = new FileInputStream(f);

        ) {
            fs.read(content);
            for (byte b : content) {
                int i = b&0xff;
                System.out.println(b);
                System.out.println(Integer.toHexString(i));
            }
            String str = new String(content, "GBK");
            System.out.println(str);
//            throw new IOException();

        } catch (Exception e){
            e.printStackTrace();
        }

        short s1 = 1;
        s1 = (short)(s1 + 1);
        s1++;
        System.out.println(s1);

        int t = 0;
        outloop:
        while (t < 5){
            System.out.println(t);
            while(t < 5){
                System.out.println(t+1);
//                break;
                break outloop;
            }
        }
        String a = new String("Hello");
        String b = new String("Hello");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());






    }
}