# SEIP 2020 LAB ASSIGNMENTS
[![Build Status](https://travis-ci.com/pigirou/SEIP-assignments.svg?token=D4abBGiU23y1aU1FXZYy&branch=development)](https://travis-ci.com/pigirou/SEIP-assignments)

This repository consists of all the assignments for the lesson Software Engineering in Practice.All assignments will be written in Java using the IDE of Eclipse.

This directory consists of the following modules:
- [Histogram Generator] (#gradeshistogram)
- [Unit Testing Demonstration] (#unittesting)

<a id= "gradeshistogram"></a>
## Histogram Generator (gradeshistogram)

The purpose of this assignment is to take advantage of the Build Automation Tool "Maven" .
In this specific module, an executable .jar is created. Using this jar, the program reads a file which consists of grades and afterwards generates a histogram with the grades and their frequency of occurence in the file.

## How to build 
1. Set up Java and the appropriate paths.
2. Set up Maven and the appropriate paths. 
3. Clone the repository on your computer.
4. Make the jar file using the command mvn package.
5. The produced jar is located in the target directory and can be executed as following:
java -jar histogramgenerator/target/histogramgenerator-0.0.1-SNAPSHOT-jar-with-dependencies.jar

<a id="unittesting"></a>
## Unit Testing and CI Demonstration (unittesting)

The purpose of this project,is to incorporate Unit Testing and Continuous Integration. The tools used for those purposes are JUnit and Travis CI. The project demonstrates the use of the previous Tools mentioned in a comprehensible manner using mathemarical operations and file reading included the tests cases for each potential result of the methods included in those classes.
 
   
## How to build
1. Use mv clean install jacoco:report in order to generate the coverage report.
2. Check that you have jacoco in your target/site path.

## How to utilize Continuous Integration
This specific project uses Travis CI which gets activated every time you push something to your GitHub repository. With Travis you can test and build this project. Everything regarding Travis is included in the .travis.yml file. 
Don't forget to substitute your token at the .travis.yml file.
Your token from CodeCov will be placed in the following spot:
after_success:
- bash <(curl -s https://codecov.io/bash) -t your_token



 
 


