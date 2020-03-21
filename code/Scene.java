package code;

public class Scene {
    private Adapter adapter;

    public Adapter getAdapter() {
        return adapter;
    }

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    public void render(){
        this.adapter.render();
    }
}
