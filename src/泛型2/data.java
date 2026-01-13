package 泛型2;

public interface data<T> {
    void add(T t);
    void delete(T t);
    void update(T t);
    T query(int id);
}
