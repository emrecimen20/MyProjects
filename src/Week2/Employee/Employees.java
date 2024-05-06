package Week2.Employee;
public class Employees {

    //Her çalışanda ortak olacak nitelikler.

    String name;
    double salary;
    int workHours;
    int hireYears;

    //Structure Methodum.

   public Employees(String name,double salary,int workHours,int hireYears){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYears=hireYears;
    }
        /*tax() :Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.*/

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
        /* bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına
        30 TL olacak şekilde bonus ücretleri hesaplayacaktır.*/

    public double bonus(){
       double bonus=0.0,toplam=0.0;
       if(this.workHours>40){
           for(double i=1.0;i<=this.workHours-40;i++){
               toplam=i;
               bonus=(toplam)*30;
           }
       }else{
           return 0.0;
       }
       return bonus;
    }
    //raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.

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
    //Çalışanın bilgilerini yazdırmak için toString() metodu ekledim.
    @Override
    public String toString() {
        return "Employees{" +
                "\n Adı = " + name +
                "\n Maaşı = " + salary +
                "\n Çalışma saati = " + workHours +
                "\n Başlangıç Yılı = " + hireYears +
                "\n Vergi = " + tax() +
                "\n Bonus = " + bonus()+
                "\n Maaş Artışı = "+raiseSalary() +
                "\n Vergi ve Bonuslarla birlikte Maaş = "+((this.salary + bonus() - tax())) +
                "\n Toplam maaş = "+(this.salary + bonus() - tax() + raiseSalary())+
                '}';
    }
}
