public class DemoStrategySimple {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("--- KNN with Euclidean Distance---");
        ClassifierStrategy classifier = new ClassifierKnn();
        classifier.setDistanceMetric(new EuclideanDistance());
        ContextSimple context = new ContextSimple(classifier);
        context.run();
        System.out.println("--- KNN with Manhattan Distance---");
        classifier = new ClassifierKnn();
        classifier.setDistanceMetric(new ManhattanDistance());
        context = new ContextSimple(classifier);
        context.run();
        System.out.println("--- K-means with Manhattan Distance---");
        classifier = new ClassifierKmeans();
        classifier.setDistanceMetric(new ManhattanDistance());
        context = new ContextSimple(classifier);
        context.setClassifierStrategy(classifier);
        context.run();
        System.out.println("--- SOM with Euclidean Distance---");
        classifier = new ClassifierSOM();
        classifier.setDistanceMetric(new EuclideanDistance());
        context = new ContextSimple(classifier);
        context.setClassifierStrategy(classifier);
        context.run();
    }
}