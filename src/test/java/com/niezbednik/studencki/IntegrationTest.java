package com.niezbednik.studencki;

import com.niezbednik.studencki.StudenckiNiezbednikApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = StudenckiNiezbednikApp.class)
public @interface IntegrationTest {
}
