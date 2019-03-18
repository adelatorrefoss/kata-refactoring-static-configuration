package refactoring;

class SomeService {
    private static String SOME_IMPORTANT_PARAMETER = Configuration.getPropertyFromDatabase("SOME_IMPORTANT_PARAMETER");

    public void run() {
        System.out.print(SOME_IMPORTANT_PARAMETER);
    }
}
