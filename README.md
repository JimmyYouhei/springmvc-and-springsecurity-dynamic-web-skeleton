# springmvc-and-springsecurity-dynamic-web-skeleton
 
 ## Introduction
 
 This is my assignment 2 of Funix about buiding an dynamic website skeleton but I redo using Spring MVC and Spring Security 
 
  ## Version
 
-	Java 12
-	Spring Tool Suite 4 (Version: 4.3.2.RELEASE) 
-	Maven (version 3.6.1)
-	Tomcat (version 9.0.22) but not included in this assignment. As a result please download yourself 
-	Bootstrap (version 4.3.1)
- Other components are used according to “pom.xml” in each project

## How to install
please import as a maven project

## Project detail
-	This project did not use Spring Boot for me to feel the pain to manually config the project myself 
-	The config files are inside the “config” package
-	The project is configured using only Java (no XML) as this is the modern way . Yeah , I knew old projects still used XML config
-	This project follows MVC architecture.  I hope my naming of packages and classes are self-explanatory  
-	Most of the JSP files come from above projects but many need modification to use Spring form 
-	Hibernate validator is also used for quick validation . Also custom message for TypeMisMatched
-	The project not only retrict access from users that are not logged in but also retrict access of admin page to admin user only  

## Possible issue
-	Minimal testing and only follow Funix requirement. And not yet trying to break the system by myself so there maybe bug outside of Funix Requirement

## Known Issue
-	Bad front-end design: I hate graphic design so please 
