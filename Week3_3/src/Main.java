public class Main {
    public static void main(String[] args) {
        Worker a = new Worker("UyenTaegoo", 1,0.5);
        a.PrintInformation();
        if(a.salary_increase(2) == true)
        {
            a.setCoefficients_salary(2);
        }
        System.out.println(a.getCoefficients_salary());
    }
}