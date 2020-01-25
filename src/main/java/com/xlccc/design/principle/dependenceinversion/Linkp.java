package com.xlccc.design.principle.dependenceinversion;

public class Linkp {

    private ICourse iCourse;

    public Linkp(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }


}
