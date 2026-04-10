package Desafios.DesafioBuilder;

import java.util.Collections;
import java.util.Map;

public class HttpRequest {

    private final String url;
    private final String method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String body;
    private final int timeout;
    private final String auth;

    public HttpRequest(HttpRequestBuilder builder) {
        this.url = builder.url();
        this.method = builder.method();
        this.headers = Collections.unmodifiableMap(builder.headers());
        this.queryParams = Collections.unmodifiableMap(builder.queryParams());
        this.body = builder.body();
        this.timeout = builder.timeout();
        this.auth = builder.auth();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(method).append(" ").append(url);

        if (!queryParams.isEmpty()) {
            sb.append("?");
            queryParams.forEach((k, v) -> sb.append(k).append("=").append(v).append("&"));
            sb.deleteCharAt(sb.length() - 1);
        }

        sb.append("\nHeaders:\n");
        headers.forEach((k, v) -> sb.append("  ").append(k).append(": ").append(v).append("\n"));

        if (body != null) {
            sb.append("Body:\n").append(body).append("\n");
        }

        sb.append("Timeout: ").append(timeout).append("ms\n");

        return sb.toString();
    }
}
