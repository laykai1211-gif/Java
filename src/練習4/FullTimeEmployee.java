package 練習4;

public class FullTimeEmployee extends Employee {
    private int monthlyMoney;
    private int bonus;

    @Override
    public void adjustSalary(int amount) {
        this.monthlyMoney+=amount;
        System.out.println(getName()+amount);
    }

    public FullTimeEmployee(String name, String id, int monthlyMoney, int bonus) {
        super(name, id);
        this.monthlyMoney = monthlyMoney;
        this.bonus = bonus;
    }

    public FullTimeEmployee(int monthlyMoney, int bonus) {
        this.monthlyMoney = monthlyMoney;
        this.bonus = bonus;
    }

    @Override
    public int calMoney() {
        return monthlyMoney+bonus;
    }

    public int getMonthlyMoney() {
        return monthlyMoney;
    }

    public void setMonthlyMoney(int monthlyMoney) {
        this.monthlyMoney = monthlyMoney;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
