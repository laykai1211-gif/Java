package 泛型2;

public class studentData implements data<student>{
    public studentData() {
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
    public void add(student student) {

    }

    @Override
    public void delete(student student) {

    }

    @Override
    public void update(student student) {

    }

    @Override
    public student query(int id) {
        return null;
    }
}
