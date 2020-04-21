# SEIP 2020 LAB ASSIGNMENTS
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

## MyMath
This specific class calculates the factorial using a method that receives the number for the calculation of the factorial as an input.
For that, there is also a class for testing and one for checking parameters. 

## ArithmeticOperations 
In this class there is a method to divide and one to multiply to numbers given as input. There is also a test class in order to test for the exceptions that may appear through the compilation of the project using JUnit. 

## How to build



