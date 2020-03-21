package code;

public class NBclassifierAdapter extends Target{
    private NBclassifier classifier;

    public NBclassifierAdapter() {
        this.classifier = new NBclassifier();
    }

    @Override
    public void classify() {
        this.classifier.classify();
    }
}
