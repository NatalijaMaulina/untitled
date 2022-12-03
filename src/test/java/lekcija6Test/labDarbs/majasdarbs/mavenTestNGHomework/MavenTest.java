package lekcija6Test.labDarbs.majasdarbs.mavenTestNGHomework;


import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class MavenTest {
    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("N a t ā l i j a   M a u ļ i n a");
        System.out.println(asciiArt);
    }
}