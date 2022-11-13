public class ContextSimple {
    ClassifierStrategy strategy;

    public ContextSimple(ClassifierStrategy strategy) {
        this.strategy = strategy;
    }

    public ClassifierStrategy getStrategy() {
        return strategy;
    }

    public void setClassifierStrategy(ClassifierStrategy strategy) {
        this.strategy = strategy;
    }

    public void run(){
        strategy.classify();
    }
}
