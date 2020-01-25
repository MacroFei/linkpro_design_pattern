package com.xlccc.design.principle.dependenceinversion;

public class Test {
    //v1
//    public static void main(String[] args) {
//        Linkp linkp = new Linkp();
//        linkp.studyEECourse();
//        linkp.studyJavaCourse();
//    }
    //v2
//    public static void main(String[] args) {
//        Linkp linkp = new Linkp ();
//        linkp.studyImoocCourse(new JavaCourse());
//        linkp.studyImoocCourse(new EECourse());
//        linkp.studyImoocCourse(new PythonCourse());
//    }
    //v3
    public static void main(String[] args) {
        Linkp linkp = new Linkp(new JavaCourse());
        linkp.studyImoocCourse();
    }
}
