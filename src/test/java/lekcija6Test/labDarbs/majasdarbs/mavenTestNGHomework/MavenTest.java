package lekcija6Test.labDarbs.majasdarbs.mavenTestNGHomework;


import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class MavenTest {
    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("Natālija Mauļina");
        System.out.println(asciiArt);
    }
}