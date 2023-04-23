package mock.test;


import com.github.tomakehurst.wiremock.junit.WireMockRule;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Rule;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.assertEquals;

public class MockApi {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().port(9090));

    // WireMock with JUnit
    @Test
    public void wiremock_with_junit_test() throws Exception {
        // stub configuration
        configStub();

        // call request in WireMock through OkHttpClient
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        // Request
        Request request1 = new Request.Builder()
                .url("http://localhost:9090/gfg/endpoint1")
                .method("GET", null)
                .build();
        Response response = client.newCall(request1).execute();

        Request request2 = new Request.Builder()
                .url("http://localhost:9090/gfg/endpoint2")
                .method("GET", null)
                .build();

        // assert the response
        assert response.body() != null;
        assertEquals("Hello Endpoint 1", ( response.body().string()));
        assertEquals("Hello Endpoint 2", ( client.newCall(request2).execute().body().string()));

    }
    private void configStub() {

        configureFor("localhost", 9090);

        // /gfg/endpoint1 with priority - 1 (Higher Priority)
        stubFor(get(urlEqualTo("/gfg/endpoint1"))
                .atPriority(1)
                .willReturn(ok()
                        .withBody("Hello Endpoint 1")));


        // /gfg/endpoint2 with priority - 1 (Higher Priority)
        stubFor(get(urlEqualTo("/gfg/endpoint2"))
                .atPriority(1)
                .willReturn(ok()
                        .withBody("Hello Endpoint 2")));

        // Generic mapping with priority - 5 (Lower Priority)
        stubFor(get(urlEqualTo("/gfg/.*"))
                .atPriority(5)
                .willReturn(notFound()
                        .withBody("Not Found")));

    }



}
