package org.compare;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws NoSuchAlgorithmException {
//        MessageDigest md = MessageDigest.getInstance("MD5");
        try (InputStream is1 = Files.newInputStream(Paths.get("C:\\Users\\franc\\Downloads\\web-frameworks.htm"));
             InputStream is2 = Files.newInputStream(Paths.get("C:\\Users\\franc\\Downloads\\copy\\web-frameworks - copy.htm"))
//             DigestInputStream dis1 = new DigestInputStream(is1, md);
//             DigestInputStream dis2 = new DigestInputStream(is2, md)
             ) {
            /* Read decorated stream (dis) to EOF as normal... */
            String md5_1 = org.apache.commons.codec.digest.DigestUtils.md5Hex(is1);
            String md5_2 = org.apache.commons.codec.digest.DigestUtils.md5Hex(is2);

            if(md5_2.equals(md5_1))
                System.out.println("Files are equal");
            else
                System.out.println("Files are NOT equal");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        byte[] digest = md.digest();
    }
}
