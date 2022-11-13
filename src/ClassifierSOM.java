public class ClassifierSOM implements ClassifierStrategy{
    DistanceMetric distanceMetric;
    @Override
    public void classify() {
        distanceMetric.compute();

        System.out.println("ClassifierSOM executed");
    }
    @Override
    public void setDistanceMetric(DistanceMetric distanceMetric) {
        this.distanceMetric=distanceMetric;
    }
}
