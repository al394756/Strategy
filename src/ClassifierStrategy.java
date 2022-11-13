public interface ClassifierStrategy {
    void classify();
    
    void setDistanceMetric(DistanceMetric distanceMetric);

}
