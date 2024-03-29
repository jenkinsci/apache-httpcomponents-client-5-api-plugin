package io.jenkins.plugins.httpclient5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;
import org.apache.hc.core5.http.HttpStatus;
import org.junit.jupiter.api.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.junit.jupiter.WithJenkins;

@WithJenkins
class SmokeTest {

    @Test
    void smokeTest(JenkinsRule r) throws Exception {
        URI uri = r.getURL().toURI();
        Response response = Request.get(uri).execute();
        assertEquals(HttpStatus.SC_OK, response.returnResponse().getCode());
    }
}
