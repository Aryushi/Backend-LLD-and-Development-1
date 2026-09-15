public class Student implements Cloneable{
    int rollNo;//primitive datatype
    String name;
    Address address;//non-primitive datatype

    @Override
    public Student clone() {
        try {
            Student student = (Student) super.clone();
            student.address = address.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return student;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
