package com.xlccc.design.pattern.creational.builder;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName , String coursePPT,
                             String courseVideo , String courseArticle,
                             String courseQA){
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseQA(courseQA);
        this.courseBuilder.buildCourseVideo(courseVideo);
        return  this.courseBuilder.makeCourse();
    }
}
