public class ClassifierKmeans implements ClassifierStrategy{
    DistanceMetric distanceMetric;
    @Override
    public void classify() {
        distanceMetric.compute();

        System.out.println("ClassifierKmeans executed");
    }
    @Override
    public void setDistanceMetric(DistanceMetric distanceMetric) {
        this.distanceMetric=distanceMetric;
    }
}
