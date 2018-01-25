package io.myjhipster.application.cucumber.stepdefs;

import io.myjhipster.application.ApataApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ApataApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
