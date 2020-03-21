package code;

public class DTclassifierAdapter extends Target{
    private DTclassifier classifier;

    public DTclassifierAdapter() {
        this.classifier = new DTclassifier();
    }

    @Override
    public void classify() {
        this.classifier.classify();
    }
}
