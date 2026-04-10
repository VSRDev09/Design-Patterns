package Desafios.DesafioBuilder;

import java.util.HashMap;
import java.util.Map;

public class HttpRequestBuilder {
    private String url;
    private String method;
    private Map<String, String> headers = new HashMap<>();
    private Map<String, String> queryParams = new HashMap<>();
    private String body;
    private int timeout;
    private String auth;

    private boolean wasUsed = false;

    public String url() {
        return this.url;
    }

    public String method() {
        return this.method;
    }

    public Map<String, String> headers() {
        return this.headers;
    }

    public Map<String, String> queryParams() {
        return this.queryParams;
    }

    public String body() {
        return this.body;
    }

    public int timeout() {
        return this.timeout;
    }

    public String auth() {
        return this.auth;
    }

    public HttpRequestBuilder(String url, String method) {

        if (url == null || url.isBlank()) {
            throw new IllegalArgumentException("URL inválida");
        }

        if (method == null ||
                (!method.equals("GET") && !method.equals("POST") &&
                !method.equals("PUT") && !method.equals("DELETE"))) {
            throw new IllegalArgumentException("Método inválido");
        }

        this.url = url;
        this.method = method;
    }

    public HttpRequestBuilder addHeaders(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    public HttpRequestBuilder addQueryParams(String key, String value) {
        this.queryParams.put(key, value);
        return this;
    }

    public HttpRequestBuilder addBody(String body) {
        this.body = body;
        return this;
    }

    public HttpRequestBuilder addTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public HttpRequestBuilder addAuth(String auth) {
        this.auth = auth;
        return this;
    }

    public HttpRequest build() {
       
        if(wasUsed){
            throw new IllegalStateException("Requisicao ja feita");
        }
         wasUsed = true;
        return new HttpRequest(this);
        
    }

}
