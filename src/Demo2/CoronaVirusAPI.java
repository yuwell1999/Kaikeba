package Demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class CoronaVirusAPI {
    public static void main(String[] args) throws IOException {

        URL url = new URL(Constants.BASE_VIRUS_URL + "?today");
        URLConnection conn = url.openConnection();

        InputStream is = conn.getInputStream(); // 输入字节流
        BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));

        String content = br.readLine();

        System.out.println(content);
    }
}
