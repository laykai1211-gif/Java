package 練習4;

public class PartTimeEmployee extends Employee {
    private int hourlyMoney;
    private int hoursWorked;

    public int getHourlyMoney() {
        return hourlyMoney;
    }

    public void setHourlyMoney(int hourlyMoney) {
        this.hourlyMoney = hourlyMoney;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public PartTimeEmployee(String name, String id, int hourlyMoney, int hoursWorked) {
        super(name, id);
        this.hourlyMoney = hourlyMoney;
        this.hoursWorked = hoursWorked;
    }

    public PartTimeEmployee(int hourlyMoney, int hoursWorked) {
        this.hourlyMoney = hourlyMoney;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int calMoney() {
        return hourlyMoney*hoursWorked;
    }

    @Override
    public void adjustSalary(int amount) {
        this.hourlyMoney+=amount;
        System.out.println(getName()+amount);
    }
}
