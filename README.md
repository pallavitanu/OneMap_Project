**Cucumber-BDD-Automation-Framework**
**BDD Maven based framework for automation using Selenium Cucumber and TestNg**
**Pre-requisites**
1.	Java
2.	Maven
3.	Eclipse

Eclipse Plugins
1.	Maven
2.	Cucumber
3.	TestNg
**This framework contains Automation Test Scenarios for OneMap Website, containing:**
The framework has following features
1.	POM Approach to Project Structure
2.	Maven based framework
3.	Report Generation (Extent Report)
4.	Helper class to handle web component such as (TryCatch, ExplicitWait)
5.	Hooks for different browser support and Take Screenshot on Test Failure
6.	Tests are runnable from the command line with parameter browserName
7.	Tests can be configured to run on a various browser and OS combinations and Tests are runnable from the command line with parameter browserName
8.	Tests run in headless mode

**The Project contains:**
•	1 feature (feature file)
1.	Feature: Validate the OneMap site
•	6 Scenarios
1.	Scenario: Validate Different options in Home Page
2.	Scenario: Validate Covid Test Providers Option
3.	Scenario: Validate Nearby Park Option
4.	Scenario: Validate Essential Amenities Option
5.	Scenario: Validate Different options in More Menu
6.	Scenario: Validate Happy Smiley Option

**
Directory structure:**

![image](https://user-images.githubusercontent.com/86979987/124584849-55ad7080-de72-11eb-9c52-a8b0357526f5.png)

**Steps to run at your system:**
1.	Clone the repository using "git clone "
2.	Open command prompt and Go to your project directory 
3.	To run test in Chrome Browser: Run mvn test -DbrowserName="chrome"
4.	To run test in Firefox Browser: Run mvn test -DbrowserName="firefox"
**Cucumber Reports: **
1.	Cucumber Advance (folder - "target\cucumber-reports\advanced-reports\extentReports"), file - "extentReport.html"
Folders for this report:
![image](https://user-images.githubusercontent.com/86979987/124584928-665de680-de72-11eb-9803-138cae4b4f79.png)

**Sample Extent Report:**

![image](https://user-images.githubusercontent.com/86979987/124584954-6fe74e80-de72-11eb-95a4-613d652a2d41.png)
![image](https://user-images.githubusercontent.com/86979987/124584975-75dd2f80-de72-11eb-88fa-03e90728da26.png)



