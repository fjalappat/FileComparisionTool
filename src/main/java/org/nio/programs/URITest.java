package org.nio.programs;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;

public class URITest {

    private static final String URI_FILE_SCHEMA = "file://";

    public void testURI() {
        try {
            URI uri1 = new URI(URI_FILE_SCHEMA + IOConstants.relativePath);
            Path p1 = Path.of(uri1);
            System.out.println("fileName p1 ="+p1.getFileName());


            URI uri2 = new URI(URI_FILE_SCHEMA + IOConstants.absolutePathForwardSlash);
            Path p2 = Path.of(uri2);
            System.out.println("fileName p2 ="+p2.getFileName());

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new URITest().testURI();
    }
}
