To run the tests please following mvn command:  
mvn test -Dendpoint=ENDPOINT_TO_CALL -Dsurefire.suiteXmlFiles=TESTNG_SUITE  

Example: runtestng test suites against SIT environment following command should be executed:  
mvn test -Dendpoint=https://jenkins-infra.main.edp.projects.epam.com/login -Dsurefire.suiteXmlFiles=testng-smoke-suite.xml  
