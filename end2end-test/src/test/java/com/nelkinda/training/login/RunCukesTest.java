package com.nelkinda.training.login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features="../features/Login.feature"
)
@RunWith(Cucumber.class)
public class RunCukesTest {
}
