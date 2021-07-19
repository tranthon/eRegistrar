# eRegistrar
A Spring Web application, named "eRegistrar", which is an online Student Registration system for a University.
 
Implemented the following 5 basic use-cases:
 
Display a homepage for the web app (e.g. url - http://localhost/eregistrar/home etc) which presents menu of items/links on a navigation bar.
Display List of Students - presents to the user, a list of all the students who have been registered in the university. Display the data in an html table.
Register a New Student - enables the user (e.g. the university registrar) to add a new Student into the system, using an html form.
Edit a Student's registration data - enables the user (e.g. the university registrar) to retrieve a Student's registration data, update it and save the change(s) to into the system.
Delete a student's registration data.
Provide a means for the user to be able to search for Students. 
The specification for Student data, is as follows:
{
   studentId : (should be the primary key field)
   studentNumber: e.g. 000-61-0001 (required)
   FirstName: e.g. Anna (required)
   MiddleName: (optional)
   LastName: e.g. Smith (required)
   cgpa: e.g. 3.78 (optional)
   enrollmentDate: e.g. 2019-5-12 (required)
   isInternational: (values: "Yes", "No") (required) - Hint: Implement/present this data in a drop-down list or Radio button
