package com.xlccc.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(11,"linkpro-openclose",222d);

        System.out.println("课程ID："+javaCourse.getId()+"课程名称:"+javaCourse.getName()+"课程价格："+javaCourse.getPrice());
//        ICourse javaCourse = new JavaDiscountCourse(33,"linkpro-openclose",444d);

        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) javaCourse;
        System.out.println("课程ID："+javaDiscountCourse.getId()+"课程名称:"+javaDiscountCourse.getName()+"课程价格："+javaDiscountCourse.getOriginPrice()+"折扣价格："+javaDiscountCourse.getPrice());
    }
}
