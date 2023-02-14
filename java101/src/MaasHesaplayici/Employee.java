package MaasHesaplayici;

public class Employee {
    String name;
    Double salary;
    int workHours;
    int hireYear;

    public Employee(String name, Double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax = 0;
        if (salary > 1000){
            tax = salary * 0.03;
        }
        return tax;
    }

    public double bonus(){
        double bonus = 0;
        if (workHours > 40){
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary(){
        double raise = 0;
        int workingYear = (2021 - hireYear);
        if (workingYear < 10){
            raise = salary * 0.05;
        }else if (workingYear > 9 && workingYear < 20){
            raise = salary * 0.1;
        }else if (workingYear > 19){
            raise = salary * 0.15;
        }
        return raise;
    }

    public void toStrings(){
        System.out.println("-----------BİLGİLER-----------");
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println(" Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary() + bonus() - tax()));
    }

}
