package code;

public class ExistedRenderEngineAdapter extends Adapter {
    private ExistedRenderEngine renderEngine;
    @Override
    public void render() {
        this.renderEngine = new ExistedRenderEngine();
        this.renderEngine.render();
    }
}
