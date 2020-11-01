package com.assignment1groupid.assignment1;

import java.util.ArrayList;

public class Student {
    
    private String name;
    private int age;
    private String DOB;
    private int ID;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;
    
    public Student(String name, int age, String DOB, int ID){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        createUsername();
        courses = new ArrayList<Course>();
        modules = new ArrayList<Module>();
    }
    
    public void addCourse(Course c){
        courses.add(c);
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
    
    public void removeCourse(Course c){
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).getCourseName().equals(c.getCourseName())){
                courses.remove(i);
                break;
            }
        }
    }
    //Returns a string of courses that offer this module
    public String courseList(){
        String listofCourses = "Student "+this.name+" takes the following courses:\n";
        for(Course c : courses){
            listofCourses += c.getCourseName() + "\n";
        }
        return listofCourses;
    }
    
    //Returns a string of courses that offer this module
    public String moduleList(){
        String listofModules = "Student "+this.name+" takes the following courses:\n";
        for(Module m : modules){
            listofModules += m.getModuleName() + "\n";
        }
        return listofModules;
    }
    
    public boolean studiesCourse(Course c){
        for(Course c1 : courses){
            if(c1.getCourseName().equals(c.getCourseName())){
                return true;
            }
        }
        return false;
    }
    
    public boolean studiesModule(Module m){
        for(Module m1 : modules){
            if(m1.getModuleID() == m.getModuleID()){
                return true;
            }
        }
        return false;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDOB() {
        return DOB;
    }

    public int getID() {
        return ID;
    }

    private void createUsername(){
        this.username = this.name + Integer.toString(age);
    }
    
    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}
