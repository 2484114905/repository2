package code;

public class Client {
    public static void main(String[] args){
        Target target;
        target = (Target) XMLutil.getBean();
        target.classify();
    }
}
