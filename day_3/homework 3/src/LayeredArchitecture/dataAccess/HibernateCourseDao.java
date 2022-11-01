package LayeredArchitecture.dataAccess;

import LayeredArchitecture.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile kurs eklendi.."+course.getName());
    }
}