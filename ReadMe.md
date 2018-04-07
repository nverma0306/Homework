# Homework
NOTE: Information on how to execute the project is given at the bottom of this file.

This file has following sections:
1. Prerequisite: Technology stack used
2. Tools
3. Programming Language
4. Browser
5. Tests Covered
6. Project Architecture
7. Project File Structure & description
8. How to run/execute the project
9. target folder
### Prerequisite

Technology stack used is
* Selenium Webdriver Version 3.6.0
* junit version 4.11
* Hamcrest version 1.3
* Maven compiler version 3.7.0
* Java version 1.8

### Tools:
* Eclipse Luna as an editor
* Maven is used for dependency management and as build tool

### Programming Langauge: 
Java is used. Java should be installed on machine(I am using version "1.8.0_161”)

# Browser:
Mozilla browser should be installed(I am using Version 59.0.2)

# Tests Covered
* UserStory1: Perform Loan Selection on the basis of criterion and verify that next page is completely loaded
* UserStory2: Verify that user login is unsuccessful because of incorrect data.

### Project Architecture
> In the project we have used Page Object Model. The main package has 3 classes, corresponding to 3 pages of the appplication which are used. The test package has 2 classes, corresponding to 2 userstories which had to be tested. Each package has one base class which is inherited by the implementing classes.

>So, when the project is executed as "maven test", the tests inside the test package are executed one by one. Different methods are executed, which calls the methods in the BaseTest class, classes in the main package, corresponding to the page on which the method executes. 

>Different values used in the tests are paramterized and kept inside the SmavaConstats class. This makes the framework maintainable as we just need to change the parameter values in this class and the updated parameters would be picked up in the project.

> Hamcrest assertions are used inside the project for better verification.

>The tests executes and the reports are created in target folder and logs printed in console corresonding to steps executed in the tests.

### Project File Structure & description

1. **source code**
    a. **src/main/java** has 3 packages, which have 5 classes.
    - **package “webAppAutomation.base”**, inside this package, 
        - **BasePage.java:** class is created. This is the base class, which is inherited by classes in src/main/java package
    - **package “webAppAutomation.pages"**, inside this package I have 3 classes with respect to three pages of application. The classes are:- 
        - **LandingPage.java:** This file corresponds to the landing page or home page of the website. All the operations(methods) performed on this page are a part of this class. 
        - **LaunchPage.java:** This file corresponds to the launch page or opening of the browser. 
        - **ResultPage.java:** This file corresponds to the Result page. The result page is opened after the loan search criterion is provided and next page is clicked w.r.t cheapest loan offer.
	 - **package "webAppAutomation.util"**, inside this package I have a class 
	    - **SmavaConstants.java** This has all the constants or parameters used in the project. The parameters consists of locators, texts, urls, values etc.
        
    b. a. **src/test/java** has 2 packages, which have 3 classes.
    - **package “webAppAutomation.testcases”**, inside this package, I have 2 classes. 
        - **FailedLoginTest.java:** This test cases is used to verify that login is unsuccessful using invalid user data.
        - **LoanSelectionTest.java:** This test cases is used to Select the loan on the basis of provided criterion and verify that the next page is completely loaded.
    - **package “webAppAutomation.testcases.base"**, inside this package I have 1 class which is the base class to teh other class. The class is:- 
        - **BaseTest.java:** This class is used as base class for test classes inside src/test/java package. In this class we are instantiating the browser on the basis of passed browser type.
2. **geckoDriver**
    geckodriver.exe
    geckodriver exe is kept inside this folder
3. **chromeDriver**
    chromedriver.exe
    chromedriver exe is kept inside this folder
4. **pom.xml**
	inside this we have all the dependencies along with projects name for selenium,     junit, hamcrest, maven compiler. 

5. **ReadMe.md** file
	Documentation about the project.

### How to run/execute the project : 
If the tests are run from eclipse, then right click on  pom.xml and execute command Run as "Maven test" - This will download all the project related dependency jars and will execute all the tests.
The tests can also be executed from command line. Navigate to the path where project is kept and execute command, "mvn clean install"

### target folder
On execution of the tests, a target folder would be created, the surefire reports would be created inside the folder for both the tests.
