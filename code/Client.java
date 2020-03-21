package code;

public class Client {
    public static void main(String[] args){
        Scene scene = new Scene();
        Adapter adapter;
        adapter = (Adapter)XMLutil.getBean();
        scene.setAdapter(adapter);
        scene.render();
    }
}
