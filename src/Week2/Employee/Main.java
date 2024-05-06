package Week2.Employee;

public class Main {
    public static void main(String[] args) {

        //Burada "worker" adında bir çalışan objesi oluşturuyoruz.
        Employees worker=new Employees("Emre Çimen",2000,45,1985);

        //Oluşturduğumuz "worker" objesnin özelliklerini yazdırmak için toString Metodunu çağırıyoruz.
        System.out.println(worker.toString());
    }
}
