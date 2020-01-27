package com.xlccc.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        //cache build
        Course course = new Course.CourseBuilder().builderCourseName("Java设计模式").buildCoursePPT("Java设计模式PPT").buildCourseQA("Java设计模式问答").build();
        System.out.println(course);
    }
}
