# SEIP 2020 LAB ASSIGNMENTS
[![Build Status](https://travis-ci.com/pigirou/SEIP-assignments.svg?token=D4abBGiU23y1aU1FXZYy&branch=development)](https://travis-ci.com/pigirou/SEIP-assignments)

This repository consists of all the assignments for the lesson Software Engineering in Practice.All assignments will be written in Java using the IDE of Eclipse.

## Histogram Generator

The purpose of the assignment "Histogram Generator" is to take advantage of Build Automation Tools such as Maven. It creates the module for this specific assignment and creates an executable .jar. Using this jar, the program reads a files with grades and creates a histogram with the grades and their frequency of occurence in the file.

## How to build 
1. Set up Java and the appropriate paths.
2. Set up Maven and the appropriate paths. 
3. Clone the repository on your computer.
4. Make the jar file using the command mvn package.
5. The produced jar is located in the target directory and can be executed as following:
java -jar histogramgenerator/target/histogramgenerator-0.0.1-SNAPSHOT-jar-with-dependencies.jar


## Unit Testing and CI Demonstration

The purpose of this part, which is included in the junittesting folder, is to incorporate Unit Testing and Continuous Integration with Travis in a simple manner through the course of Software Engineering in practice. The tools that are used are Travis, Jacoco and Junit. 
   
## How to build
1. Use mv clean install jacoco:report in order to generate the coverage report.
2. Check that you have jacoco in your target/site path.

## How to utilize Continuous Integration
This specific project uses Travis CI which gets activated every time you push something to your GitHub repository. With Travis you can test and build this project. Everything regarding Travis is included in the .travis.yml file. 
Don't forget to substitute your token at the .travis.yml file.
Your token from CodeCov will be placed in the following spot:
after_success:
- bash <(curl -s https://codecov.io/bash) -t your_token



 
 


