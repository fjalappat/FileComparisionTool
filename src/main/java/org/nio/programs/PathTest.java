package org.nio.programs;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

    private void testPath() {
        String relativePath = "src/main/java/org/compare/App.java";
        String absolutePath = "src/main/java/org/compare/App.java";
        Path p1 = Path.of(relativePath);
        System.out.println("fileName p1 ="+p1.getFileName());

        Path p2 = Paths.get(relativePath);
        System.out.println("fileName p2 ="+p2.getFileName());

    }

    public static void main(String[] args) {
        new PathTest().testPath();
    }
}
