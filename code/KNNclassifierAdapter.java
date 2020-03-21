package code;

public class KNNclassifierAdapter extends Target {
    private KNNclassifier classifier;

    public KNNclassifierAdapter() {
        this.classifier = new KNNclassifier();
    }

    @Override
    public void classify() {
        this.classifier.classify();
    }
}
