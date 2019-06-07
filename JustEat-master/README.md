# JustEat

Using Maven as the Build tool
Eclipse as the IDE
Se Webdriver as the automation framework
TestNG as the testing framework

Steps taken to create this project:

1. The project dependencies are written in the pom.xml of the maven project
2. Created a Maven project using eclipse IDE with the Artifact ID JustEat
3. Under the src/main/java folder I have added all the page object relating to the given scenario. 
The ojects are identified using the POM or Page Object Pattern through Page factory
4. Under the src/test/java folder are the test cases. 
The test cases are written with using the @Test annotations
5. The test scenarios are written in the . feature file that can be found in the resources folder

Steps to run the project:
Execution Type 1:
Right click on the FindRestaurantGivenPostalCode class in the src/test/java folder of the maven folder and select RunAs -> TestNG test

Execution Type 2:
1) Install maven and place this project in the same folder as of the installed maven file
2) open command promt and navigate to the project folder
3) type mvn test
