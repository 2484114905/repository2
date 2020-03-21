package code;

public class VolumeRenderingAdapter extends Adapter {
    private VolumeRendering renderEngine;
    @Override
    public void render() {
        this.renderEngine = new VolumeRendering();
        this.renderEngine.render();
    }
}
