public class Worker {
    private String NameWorker;
    private double Basic_Salary;
    private double Coefficients_salary;
    public double Salary_MAX = 2;


    public String getNameWorker() {
        return NameWorker;
    }

    public double getBasic_Salary() {
        return Basic_Salary;
    }

    public double getCoefficients_salary() {
        return Coefficients_salary;
    }

    public void setCoefficients_salary(double coefficients_salary) {
        Coefficients_salary = coefficients_salary;
    }

    public void setNameWorker(String nameWorker) {
        NameWorker = nameWorker;
    }

    public void setBasic_Salary(double basic_Salary) {
        Basic_Salary = basic_Salary;
    }

    public Worker(String nameWorker, double salary, double coefficients_salary) {
        NameWorker = nameWorker;
        Basic_Salary = salary;
        Coefficients_salary = coefficients_salary;
    }
    public double payroll()
    {
        return this.Coefficients_salary*this.Basic_Salary;
    }

    public boolean salary_increase(double b)
    {
        double Coefficients_salary = this.Coefficients_salary;
        double Basic_Salary = this.Basic_Salary;
        if((b+Coefficients_salary)*Basic_Salary> this.Salary_MAX)
        {
            System.out.println("Don't salary increase!");
            return false;
        }
        else {
            return true;
        }
    }
    public void PrintInformation()
    {
        String name;
        name = this.NameWorker;
        double salary = payroll();
        System.out.println("Name: " + name + ", salary: " + salary);
    }
}
