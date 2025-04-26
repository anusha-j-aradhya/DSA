class sister{
    void d(){
        System.out.println("hi");
    }
}
class brother extends sister{
    void display(){
        System.out.println("hiiii");
    }
}
public class hit{
    public static void main(String[] args) {
        brother c=new brother();
        c.d();
        c.display();
    }
}