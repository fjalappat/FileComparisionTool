package org.nio.programs;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.nio.programs.IOConstants.absolutePathBackSlash;
import static org.nio.programs.IOConstants.relativePath;

public class PathTest {

    private void testPath() {

        Path p1 = Path.of(relativePath);
        System.out.println("fileName p1 ="+p1.getFileName());

        Path p2 = Paths.get(absolutePathBackSlash);
        System.out.println("fileName p2 ="+p2.getFileName());

    }

    public static void main(String[] args) {
        new PathTest().testPath();
    }
}
