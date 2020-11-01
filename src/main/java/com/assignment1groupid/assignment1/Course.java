package com.assignment1groupid.assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
    private String courseName;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate;
    private DateTime endDate;
    
    public Course(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        modules = new ArrayList<>();
        students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public void addStudent(Student s){
        students.add(s);
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
    
    //Returns a string of student names that take module
    public String studentList(){
        String listofStudents = "List of Students taking "+courseName+"\n";
        for(Student s : students){
            listofStudents += s.getName() + "\n";
        }
        return listofStudents;
    }
    
    public void addModule(Module m){
        modules.add(m);
    }
    
    //removes student from this student list
    public void removeModule(int moduleID){
        for(int i = 0; i < modules.size(); i++){
            if(modules.get(i).getModuleID() == moduleID){
                modules.remove(i);
                break;
            }
        }
    }
    
    //Returns a string of courses that offer this module
    public String moduleList(){
        String listofModules = "List of Modules offered by "+courseName+"\n";
        for(Module m : modules){
            listofModules += m.getModuleName() + "\n";
        }
        return listofModules;
    }
    
    public boolean studyingStudents(Student s){
        for(Student s1 : students){
            if(s1.getID() == s.getID()){
                return true;
            }
        }
        return false;
    }
    
    public boolean containsModule(Module m){
        for(Module m1 : modules){
            if(m1.getModuleID() == m.getModuleID()){
                return true;
            }
        }
        return false;
    }
}
