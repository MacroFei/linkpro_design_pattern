package com.xlccc.design.principle.demeter;

import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourses(List<Course> courseList){
        System.out.println("课程数量："+courseList.size());
    }
}
