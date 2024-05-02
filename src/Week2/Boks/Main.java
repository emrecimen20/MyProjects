package Week2.Boks;

public class Main {
    public static void main(String[] args) {
        Fighter f1= new Fighter("Mike Tyson",10,120,100,20,50);
        Fighter f2=new Fighter("Muhammed Ali",15,100,85,30,50);

        Match match=new Match(f1,f2,85,100);

        match.run();
    }
}
