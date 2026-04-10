package Desafios.DesafioBuilder;

public class Main {
        public static void main(String[] args) {

        HttpRequest req = new HttpRequestBuilder("https://api.com/users?page=1", "GET").
        addBody("{ \"name\": \"Vinicius\" }").
        addHeaders("Authorization", "Bearer token").
        addQueryParams("page", "1").
        addTimeout(4000).
        addAuth("123c-3456d-7434k").
        build();

        System.out.println(req.toString());

    }
}
