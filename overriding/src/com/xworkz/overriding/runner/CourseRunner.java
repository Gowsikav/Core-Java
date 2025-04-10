package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Course;
import com.xworkz.overriding.internal.OnlineCourse;

public class CourseRunner
{
    public static void main(String[] args) {
        Course course = new Course();
        course.describe();

        OnlineCourse online = new OnlineCourse();
        online.describe();
        online.startLearning();

        Course course1 = new OnlineCourse();
        course1.describe();
    }
}
