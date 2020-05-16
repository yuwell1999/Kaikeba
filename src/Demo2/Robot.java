package Demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Robot {
    public static void main(String[] args) throws IOException {

        URL url = new URL(Constants.BASE_TURING_URL + "?"
                + "appkey=" + Constants.APP_KEY + "&"
                + "question=" + URLEncoder.encode(Constants.QUESTION, StandardCharsets.UTF_8));

        URLConnection conn = url.openConnection();

        InputStream is = conn.getInputStream(); // 输入字节流
        BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));

        String content = br.readLine();

        System.out.println(content);
    }
}