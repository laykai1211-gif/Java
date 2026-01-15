package 練習3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ReadURLJson {
    public static void main(String[] args) {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            // 4. 發送請求並取得回應 (Response)
            // HttpResponse.BodyHandlers.ofString() 告訴 Java 把結果轉成字串
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // 5. 印出結果
            System.out.println("HTTP 狀態碼: " + response.statusCode());
            System.out.println("JSON 內容如下:");
            System.out.println(response.body());

        } catch (IOException | InterruptedException e) {
            // 處理網路錯誤或連線中斷
            e.printStackTrace();
        }
    }
    }


