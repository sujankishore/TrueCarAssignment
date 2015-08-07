{\rtf1\ansi\ansicpg1252\cocoartf1344\cocoasubrtf720
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red38\green38\blue38;\red250\green249\blue246;\red0\green0\blue0;
}
\margl1440\margr1440\vieww28300\viewh14900\viewkind0
\deftab720
\pard\pardeftab720\sl276

\f0\fs20 \cf2 \cb3 \expnd0\expndtw0\kerning0
\ul \ulc2 \outl0\strokewidth0 \strokec2 Installation and running instructions\
\ulnone 1. Install\cf4 \cb1 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4  Eclipse IDE and import TrueCar project from git repo.\
2. This project requires jUnit and Selenium RC server:\
    a.Right click on "JRE System Library..." > Build Path > Configure Build Path.\
    b.Click on Add External jars and include all 3 jar files from TrueCar folder.\
3. Right click on Project > Run as > JUnit test\
\
\ul Brief explanation of my approach\
\ulnone I\'92ve implemented this project using Page Object Model framework (POM) abstracting the test objects from test scripts.\
There are 2 packages in this project namely pageObjects and trueCarTestAutomation:\
pageObjects package:\
Contains a class for each web page and I\'92ve created a static method for each web element in the class. Each method will have an argument (driver) and a\'a0return value (element).\
\pard\pardeftab720
\cf4 Driver is being passed as an argument so that Selenium is able to locate the element on the browser and element is returned, so that an Action can be performed on it.\
Method is declared as Public Static, so that it can be called in any other method without instantiating the class.\
\
\pard\pardeftab720\sl276
\cf0 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 trueCarTestAutomation:\
TrueCar class contains all test cases for all web pages in this project\
I\'92ve asserted that the actual price in the Dealer Selection page is equal to the offer price in the certificate page.\
\
POM technique creates layer(s) of abstraction resulting in more readable, maintainable and reusable code. \
\
\ul Future enhancements\
\ulnone 1. Implement a method to capture screenshot on failure.\
\pard\pardeftab720\sl276
\cf0 \expnd0\expndtw0\kerning0
2. Create another layer of abstraction for different browser actions.\expnd0\expndtw0\kerning0
\
3. Add TestNG framework to this project to run several instances of the test simultaneously on different browsers.\
\pard\pardeftab720\sl276
\cf4 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 \
\ul Compromises made\
\pard\pardeftab720\sl276
\cf0 \expnd0\expndtw0\kerning0
\ulnone \outl0\strokewidth0 The test currently runs only on firefox browser.}