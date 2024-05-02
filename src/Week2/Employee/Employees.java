package Week2.Employee;

public class Employees {
    String name;
    double salary;
    int workHours;
    int hireYears;

   public Employees(String name,double salary,int workHours,int hireYears){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYears=hireYears;
    }

    public double tax(){
       double tax=0;
       if(this.salary<1000.0){
           tax=this.salary;
           return tax;
       }else{
           tax=this.salary*0.03;
           return tax;
       }
    }

    public double bonus(){
       double bonus=0.0,toplam=0.0;
       if(this.workHours>40){
           for(double i=1;i<=this.workHours-40;i++){
               toplam=i;
               bonus=(toplam)*30;
           }
       }else{
           return 0;
       }
       return bonus;
    }

    public double raiseSalary(){
       double salaryIncrease=0.0;
       if(2021-this.hireYears<10){
           salaryIncrease=(this.salary*5.0)/100.0;
          return salaryIncrease;
       }
       else if(2021-this.hireYears>9 && 2021-this.hireYears<20){
           salaryIncrease= (this.salary*10/100);
           return salaryIncrease;
       }else{
           salaryIncrease= (this.salary*15/100);
           return salaryIncrease;
       }

    }
        public void employeeInformation(){
            System.out.println("Adı :" +  this.name);
            System.out.println("Maaşı :" + this.salary);
            System.out.println("Çalışma saati :" + this.workHours);
            System.out.println("Başlangıç Yılı :" + this.hireYears);
            System.out.print("Vergi :");
            System.out.println(tax());
            System.out.print("Bonus :");
            System.out.println(bonus());
            System.out.print("Maaş Artışı :");
            System.out.println(raiseSalary());
            System.out.print("Vergi ve Bonuslar ile birlikte maaş :");
            System.out.println(this.salary + bonus() - tax());
            System.out.print("Toplam maaş :");
            System.out.println(this.salary + bonus() - tax() + raiseSalary());
        }


}
