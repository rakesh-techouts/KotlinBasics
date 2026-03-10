package techouts;


interface A{
    default void show() {
        System.out.println("This is  A");
    }

}
interface B{
    default void show() {
        System.out.println("This is  B");
    }

}
public class C implements  A,B {
    @Override
    public void show() {

    }
    public void AShow() {
        A.super.show();
    }
    public void BShow() {
        B.super.show();
    }

    static void main() {
       /* C obj=new C();
        obj.show();*/

        C obj1 = new C();
        obj1.AShow();
        obj1.BShow();

    }
}
