package lesson6;

import java.awt.*;

public class OkHttpExamples {
    public static void main(String[] args) {
        OkHttpClient okHttpClient = new OkHttpClient();

        HttpUrl httpUrl = new HttpUrl.builder()
                .scheme("https")
                .host("yandex.ru")
                .addPathSegment("pogoda")
                .addPathSegment("Kazan")
                .addPathSegment("details?via=ms")
                .build();
        String detailsBody="{67883311-3b7a-495a-8b49-659b8ac1af9e }";

        RequestBody requestDetailsBody = RequestBody.create(detailsBody, PageAttributes.MediaType.parse("JSON"));
        Request request
}
