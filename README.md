# AmazonProjecct
----------------------------------------------------------------------------------------------------------------------------------
This Project is about creating a basic test automation framework using TestNg and Technique used is Page Object Modelling where all the webelement
available on different pages are classified and put in in seperate pages for better management of code.

There main different components of this framework
1.src/main/java-->
  1.1 com.amazon.framework package-->It initialise the bowser
  1.2 com.amazon.uipackages --->POM is used
  It contains different java class for each page and locators and action methods related to each page
  1.3 com.testdata package ---->It has excel sheet consisting of test data
  1.4 dataprovider package --->It has ConfigfileReader and ExelConfig java class basically used for reading data from config and excel file
2.src/test/java
  2.1com.amazon.testcasespackage -->It has 2 java class
                                    1.helper class which contains code to be run before the execution of suite and after
                                    the execution
                                    2.TestBaseClass which has test cases to be run a total of 4 test case
   2.2testlistner package  --->It implements ITestNGlistner for taking screenshot                                 
3.config file--->It has configuration file consisting of Url,browser and other details 
------------------------------------------------------------------------------------------------------------------------------------

Order of exceution
-The execution starts from Helperclass.java where driver is initialised and then broswer is  selected and initilaised from Browserfactory class
-The driver path and browser name etc are fetched from config.properties file and the logic of reading config file is implemented in
ConfigFileReader.java class under package dataprovider. 
-Then TestBase class is run with the priority specified in the test case and respective function and location are being derived from the java
classes present under com.amazon.uipackages.
-The test data is derived from excel sheet using logic is implemented in excelConfig.java file
-After every Test cases,the result is checked and in case its failed screenshot is taken using IListsners TestResult mentioned in 2.2
-Report canbe found under testoutput and Index.html

  
  
