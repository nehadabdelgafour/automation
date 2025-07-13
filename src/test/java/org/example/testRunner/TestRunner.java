package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",   // ← ده المسار الصحيح للملفات .feature
        glue = "org.example.stepDefs",              // ← ده الباكدج اللي فيه الخطوات (Step Definitions)
        plugin = {
                "pretty",
                "html:target/cucumber-report.html", // ← اسم أوضح للتقرير
                "json:target/cucumber.json"         // ← لو حابة تقرير بصيغة JSON كمان
        },
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
