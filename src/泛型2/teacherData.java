package 泛型2;

public class teacherData implements data<teacher>{
    public teacherData() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public void add(teacher teacher) {

    }

    @Override
    public void delete(teacher teacher) {

    }

    @Override
    public void update(teacher teacher) {

    }

    @Override
    public teacher query(int id) {
        return null;
    }
}
