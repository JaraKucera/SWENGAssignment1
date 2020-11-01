package com.assignment1groupid.assignment1;

import java.util.ArrayList;

public class Module {
    
    private String moduleName;
    private int moduleID;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    
    public Module(String moduleName, int moduleID){
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }
    
    public boolean studyingStudents(Student s){
        for(Student s1 : students){
            if(s1.getID() == s.getID()){
                return true;
            }
        }
        return false;
    }
    
    public boolean includedInCourse(Course c){
        for(Course c1 : courses){
            if(c1.getCourseName().equals(c.getCourseName())){
                return true;
            }
        }
        return false;
    }
    
    public void addStudent(Student s){
        students.add(s);
    }
    
    public void addCourse(Course c){
        courses.add(c);
    }
    
    //Returns a string of student names that take module
    public String studentList(){
        String listofStudents = "List of Students taking "+moduleName+"\n";
        for(Student s : students){
            listofStudents += s.getName() + "\n";
        }
        return listofStudents;
    }
    
    //Returns a string of courses that offer this module
    public String courseList(){
        String listofCourses = "List of Courses offering "+moduleName+"\n";
        for(Course c : courses){
            listofCourses += c.getCourseName() + "\n";
        }
        return listofCourses;
    }
    
    //removes student from this student list
    public void removeStudent(int studentID){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getID() == studentID){
                students.remove(i);
                break;
            }
        }
    }
    
    //removes course from courrse list
    public void removeCourse(String courseName){
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).getCourseName().equals(courseName)){
                courses.remove(i);
                break;
            }
        }
        
    }
    public String getModuleName() {
        return moduleName;
    }

    public int getModuleID() {
        return moduleID;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setModuleID(int moduleID) {
        this.moduleID = moduleID;
    }
    
}
