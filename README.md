# Visitor_Pattern

This small, simple project is an abstraction of a potential attendence/interaction system between students, professors, and Lectures.

In compliance with visitor pattern, the Student and Professor objects are both visitors while the lecture is an element. 

The student constructs a summary of their day from the classes attended based on their schedule and this summary will show which classes a given student missed.

The Professor constructs a summary of students that showed up to their classes.

This architecture leaves room for more elements that students or professors could attend such as office hours, or meetings.

to see the demonstration, simply run the Main.java file