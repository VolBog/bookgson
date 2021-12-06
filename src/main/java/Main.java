import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        String json = getJson();
        System.out.println(json);
        Books books = gson.fromJson(json, Books.class);
        System.out.println(books);

    }

    public static String getJson() {
        String json = "";
        try (InputStream is = Main.class.getClassLoader().getResourceAsStream("json.json");
             InputStreamReader streamReader =
                     new InputStreamReader(is, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String line;
            while ((line = reader.readLine()) != null) {
                json += line;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}
