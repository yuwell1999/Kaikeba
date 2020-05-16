package Demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class MessageAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        for (int i = 0; i < Constants.MESSAGE_COUNT; i++) {
            String randnum = getFixedLengthString();

            URL url = new URL(Constants.BASE_MSG_URL + "?"
                    + "appkey=" + Constants.APP_KEY + "&"
                    + "mobile=" + Constants.MOBILE + "&"
                    + "content=" + Constants.CONTENT1 + randnum + Constants.CONTENT2);

            System.out.println(randnum);

            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream(); // 输入字节流
            BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            String content = br.readLine();

            try {
                System.out.println(content);
                Thread.sleep(Constants.LOOP_MS);
            } catch (InterruptedException e) {
            }

        }
    }

    public static String getFixedLengthString() {
        int len = 6;

        Random rd = new Random();
        double pross = (1 + rd.nextDouble()) * Math.pow(10, len);

        return String.valueOf(pross).substring(1, len + 1);
    }

}