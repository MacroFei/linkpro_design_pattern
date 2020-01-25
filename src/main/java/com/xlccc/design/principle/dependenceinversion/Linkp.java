package com.xlccc.design.principle.dependenceinversion;

public class Linkp {
//    public void studyJavaCourse(){
//        System.out.println("linkp在学习java课程");
//    }
//    public void studyEECourse(){
//        System.out.println("linkp在学习EE课程");
//    }
    public void studyImoocCourse(ICourse iCourse){
        iCourse.studyCourse();
    }
}
