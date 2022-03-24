package com.syntax.project2;

public class Task02 {
    public static void main(String[] args) {
        A a = new A(78,84,91);
        B b = new B (81,79,83,95);

        System.out.println(" Percentage of Student A is "+a.getPercentage());
        System.out.println(" Percentage of Student B is "+b.getPercentage());

        }
    }
abstract class Marks{
    double subject1;
    double subject2;
    double subject3;
    static int totalScoreEachSubject=100;

    public Marks(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    abstract double getPercentage();
}
class A extends Marks{
    public A(double subject1, double subject2, double subject3) {
        super(subject1,subject2,subject3);
    }
    @Override
    double getPercentage() {
        return( (subject1+subject2+subject3)/(totalScoreEachSubject*3)*100);

    }
}

class B extends Marks{
    double subject4;
    public B(double subject1, double subject2, double subject3,double subject4) {
        super(subject1,subject2,subject3);
        this.subject4=subject4;
    }
    @Override
    double getPercentage() {
        return(( subject1+subject2+subject3+subject4)/(totalScoreEachSubject*4)*100);

    }
}
