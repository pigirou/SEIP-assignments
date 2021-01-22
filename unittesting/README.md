## Unit Testing and CI Demonstration 

The purpose of this project is to incorporate Unit Testing and Continuous Integration into the written code. The tools used for those purposes are JUnit and Travis CI. The project demonstrates the use of the previous tools mentioned in a comprehensible manner using mathematical operations and file reading along with their test cases. With those test cases that are constructed we can check all potential results of each method that is included in the corresponding class. 

## How to build
1. Use mv clean install jacoco:report in order to generate the coverage report.
2. Check that you have jacoco in your target/site path after implementing the previous step.

#How to use Continuous Integration

This specific project uses Travis CI which gets activated every time you push something to your GitHub repository from git. With Travis CI you can test and build this project. Everything regarding this tool is included in the .travis.yml file of the parent module. 
Don't forget when cloning this repository to substitute your token inside the .travis.yml file. 
Your token from CodeCov will be placed in the following spot:

after_success: 
- bach < (curl -s https://codecov.io/bash) -t your_token

