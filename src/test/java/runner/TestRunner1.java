package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//
@RunWith(Cucumber.class)//it will run with cucumber option
@CucumberOptions(
		  features="C:\\Users\\chpra\\eclipse\\BDD_project\\src\\test\\java\\my_Feature\\LoginValidationCheck.feature",
		  glue="project_Stepdefinition", //as both feature file and step def are in the same folder no need give the path
		  
		dryRun=true,
		monochrome=true,
		//tags="Login",
		plugin= {"pretty","html:target/cucumber-reports/index.html",
							"json:target/JSON-reports/index.json",
							"junit:target/XML-reports/index.xml"})

public class TestRunner1 {
  
}
//dry run is true means doesnot execute it checks only methodds availbale in step def
//dry run is false means it will  execute the methods in stepdef

//to clear junk values use monochrome true
//tags to execute which ever is defined it will execute those only for ex:@smoke in feature file and give the same in tags in runner file 
//it  iwll execute those