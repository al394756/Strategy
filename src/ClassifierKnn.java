public class ClassifierKnn implements  ClassifierStrategy{
    DistanceMetric distanceMetric;
    @Override
    public void classify() {
        distanceMetric.compute();
        System.out.println("ClassifierKnn executed");
    }

    @Override
    public void setDistanceMetric(DistanceMetric distanceMetric) {
        this.distanceMetric=distanceMetric;
    }
}
