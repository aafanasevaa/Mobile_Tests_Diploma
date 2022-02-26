# Mobile tests for Wikipedia mobile app

## :hammer_and_wrench: Technology stack:  
<img src="https://github.com/aafanasyevaa/aafanasyevaa/blob/main/media/Java.png" width="60" height="60" /> ***Java*** — `object-oriented programming language`   
<img src="https://github.com/aafanasyevaa/aafanasyevaa/blob/main/media/Appium.png" width="50" height="40" /> ***Appium*** - ` open source test automation framework for use with native, hybrid and mobile web apps`   
<img src="https://github.com/aafanasyevaa/aafanasyevaa/blob/main/media/Browserstack.jpg" width="67" height="60" /> - ***Browserstack*** - `cloud web and mobile testing platform`   
<img src="https://github.com/aafanasyevaa/aafanasyevaa/blob/main/media/Gradle.png" width="60" height="55" /> ***Gradle*** — `a build automation tool for multi-language software development`     
<img src="https://github.com/aafanasyevaa/aafanasyevaa/blob/main/media/Junit.png" width="55" height="50" />  ***Junit*** — `unit testing framework for the Java programming language`     
<img src="https://github.com/aafanasyevaa/aafanasyevaa/blob/main/media/Jenkins.jpg" width="60" height="50" /> ***Jenkins*** — `open source automation server`   
<img src="https://github.com/aafanasyevaa/aafanasyevaa/blob/main/media/Rest-Assured.png" width="60" height="35" /> ***Rest-Assured*** — `Java-based library that is used to test RESTful Web Services`  
<img src="https://github.com/aafanasyevaa/aafanasyevaa/blob/main/media/Allure.jpg" width="50" height="40" /> ***Allure*** — `Software Quality Management Platform`   

***

## :keyboard: Commands to run tests 
### with browserstack
``` gradle clean test -DdeviceHost=browsertack ```
### without selenoid
``` gradle clean test -DdeviceHost=selenoid ```

***

## :construction_worker_man: Running tests using Jenkins
*You need to set up parameters to run a new job*

![image](https://user-images.githubusercontent.com/93313607/155853403-2ca1611d-92d0-46e3-ba50-4d74dc97b515.png)

## :chart_with_upwards_trend: Allure results
*Once the process is finished you will be able to check Allure results*
![image](https://user-images.githubusercontent.com/93313607/155854055-ca8426e2-cb0e-4be8-af5d-a89a0f637bab.png)

## :bar_chart: Integration with Alure TestOps
*Allure TestOps allows you to check detailed information about test results*
![image](https://user-images.githubusercontent.com/93313607/155854000-a093fe6b-224d-4450-b350-5ef8cb8acc14.png)
![image](https://user-images.githubusercontent.com/93313607/155853996-de8694f2-cc8a-42be-992b-086c36adaf7f.png)

***
## :toolbox: Integration with Jira
*Jira integration is enabled as well*
![image](https://user-images.githubusercontent.com/93313607/155854032-c91a3d1c-ab74-4e13-a4fc-1a4ca08f3fda.png)

***
## :clapper: Example video of running the test

https://user-images.githubusercontent.com/93313607/155854088-ed238849-5eee-4901-8a07-69f4196246af.mp4

