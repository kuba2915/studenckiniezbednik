package com.niezbednik.studencki.cucumber;

import com.niezbednik.studencki.StudenckiNiezbednikApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = StudenckiNiezbednikApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
