package JDBC;

public interface Task {
    void execute(StoreService service) throws Exception;
    String label();
}