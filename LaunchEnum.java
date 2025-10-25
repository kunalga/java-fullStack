enum Course
{
    JAVA, JEE, SPRINGBOOT; // Enum constants

    int courseId;

    // Constructor (called once for each constant)
    Course()
    {
        System.out.println("Constructor called for " + this.name());
    }

    // Setter method
    void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }

    // Getter method
    int getCourseId()
    {
        return courseId;
    }
}

public class LaunchEnum
{
    public static void main(String[] args)
    {
        // Enum constructor is called automatically for each constant
        Course.JAVA.setCourseId(10);
        Course.JEE.setCourseId(20);
        

        System.out.println(Course.JAVA + " : " + Course.JAVA.getCourseId());
        System.out.println(Course.JEE + " : " + Course.JEE.getCourseId());
        System.out.println(Course.SPRINGBOOT + " : " + Course.SPRINGBOOT.getCourseId());
    }
}
