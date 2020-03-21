package code;

public class SurfaceRenderingAdapter extends Adapter {
    private SurfaceRendering renderEngine;
    @Override
    public void render() {
        this.renderEngine = new SurfaceRendering();
        this.renderEngine.render();
    }
}
