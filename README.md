# Incube8_Task

The project Incube8_Task is to verify the search functionality of commonly used IMDb website.

###### The tech stack used in this project are:

- JAVA as the programming language for writing test code.

- Behavior Driven Development(BDD)-Cucumber,as the framework for which feature files are in Gherkin.

- Maven has been used to bring in all dependencies.

- IntelliJ as the preferred IDE for writing java code.


###### **Getting Started:**

- Install JDK 1.9

- Install IntelliJ (Community edition should suffice)

- Pull the code from Git

###### **Running tests:**

- Run tests from IntelliJ:

- Open IntelliJ and click on Edit Configurations

- Add TestRunner.java

- Now click on Run button

###### **Report:**

- Report will be found here: /IdeaProjects/Incube8_Task/target/cucumber-reports/index.html under the Target folder.

- Right click on index.html >> Open with >> Chrome

###### **Tests:**

TestRunner has been configured to run all the tests mentionned in task at once. 
However, one can still execute feature file independently by providing the feature file to be executed in TestRunner.java

**[Question 1]**
Task - 1.1 : **Manual testcases for search Functionality** 

- _Please find the attached excel document._ 
                
Task - 1.2a: **As a new user navigates to IMDb home page, URL: http://www.imdb.com, Click
           ‘Menu’ button, displayed next to IMDb logo on left corner, select ‘Top Rated Shows’
           link, appeared under ‘TV Shows’ category. (10 points)**
           
- Q1b.feature : The script navigates to Menu page and clicks on the link as spec*ified.Verifies if it landed on the desired page by checking the title header of the page*

Task - 1.2b: **Search for ‘Game of thrones’ and select ‘Game of Thrones: The Last Watch’ link from the suggestion window. (10 points)**
                
- _Q1c.feature : Search is successful and navigation to Last watch link is successful as well_
                
Task - 1.3: **Then write 3 assertions to cover the following values.**
                
- _Q1d.feature : Assertion of Title with user input title,Rating as per the user input and Review against not NULL(as this changes dynamically)  are implemented._ 
                
                
**[Question 2]**
Task-2a: **Create an account by filling the registration form (10 points)**
               
- _Q2a.feature : Since it was mentioned to feed the test data dynamically, have made use of random generation of name and password._
- _Also, creating an account requires two factor authentication._ 
- **_As captcha code cannot be automated by selenium, script creates dummy account but cannot be used_**.

Task-2b: **Verify whether the newly registered user was able to login to the application. (15 points)**
               
- _Q2b.feature : As the previously created user cannot sign in, because of the incompleted authentication,have used my newly created user account to check if the sign in successful. Once signed in check for the sign user name displayed in top right corner._
                                
Sample of executed test report :

![Reports Screenshot](screenshots/reports.png?raw=true "Reports")

**Few pointers that could have been done better :**
 I strongly feel there is lot more scope for improvement. Have managed to complete the project to best of my knowledge and the time constraint.
 I am sure with a little more time, i could have done it more efficient. 
 Things i think i could have implemented if i had time are :
      
1) In current implementation, I am using the default report module.By using extentReports, reporting can be made much more informative
      
2) Can add logger functions which can help to root cause the issue 
      
3) Usage of data table to check for multiple data tests
      
4) Implementation of TakeScreenshot function to take evidence if there is any failure
       
5) Exploring ways to check if the user sign up could be completed by using action/robot classes
      
6) Testrunner can be made better by making use of Junit framework by including all the annotations
                     