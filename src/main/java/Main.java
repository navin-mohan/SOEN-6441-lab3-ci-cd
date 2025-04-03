
class Course {
    String name;
    int credits;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        IntList intList = new IntList();
        System.out.println(intList);
        intList.append(10);
        intList.append(11);
        intList.append(12);
        System.out.println(intList);
        intList.delete();
        intList.append(20);
        System.out.println(intList);


        GenericList<Integer> genericIntList = new GenericList<>();
        System.out.println(genericIntList);
        genericIntList.append(10);
        genericIntList.append(11);
        genericIntList.append(12);
        System.out.println(genericIntList);
        genericIntList.delete();
        genericIntList.append(20);
        System.out.println(genericIntList);

        GenericList<String> genericStringList = new GenericList<>();
        System.out.println(genericStringList);
        genericStringList.append("Apple");
        genericStringList.append("Banana");
        genericStringList.append("Pear");
        System.out.println(genericStringList);
        genericStringList.delete();
        genericStringList.append("Orange");
        System.out.println(genericStringList);

        GenericList<Course> courseList = new GenericList<>();
        System.out.println(courseList);
        courseList.append(new Course("SOEN6441", 4));
        courseList.append(new Course("COMP6321", 4));
        courseList.append(new Course("COEN6560", 4));
        System.out.println(courseList);
        courseList.delete();
        courseList.append(new Course("INSE6760", 4));
        System.out.println(courseList);
    }
}
