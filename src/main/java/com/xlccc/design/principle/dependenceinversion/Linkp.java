package com.xlccc.design.principle.dependenceinversion;

public class Linkp {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

//    public Linkp(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }


    public Linkp() {
    }

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }


}
