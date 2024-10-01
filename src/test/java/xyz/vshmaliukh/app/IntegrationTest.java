package xyz.vshmaliukh.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.vshmaliukh.app.config.AsyncSyncConfiguration;
import xyz.vshmaliukh.app.config.EmbeddedElasticsearch;
import xyz.vshmaliukh.app.config.EmbeddedRedis;
import xyz.vshmaliukh.app.config.EmbeddedSQL;
import xyz.vshmaliukh.app.config.JacksonConfiguration;
import xyz.vshmaliukh.app.config.TestSecurityConfiguration;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { CupHubTmpApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedSQL
public @interface IntegrationTest {
}
