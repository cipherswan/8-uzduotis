// Custom Design Pattern CREATIONAL
class Custom {

    private static Custom instance = null;

    private Custom() {
    }

    static Custom getInstance(){
        if (instance == null) {
            synchronized (Custom.class) {
                instance = new Custom();
            }
        }

        System.out.println("Instance created: " + instance);
        return instance;
    }

    public void showMessage(){
        System.out.println("Instance has been instantiated");
    }


}


//- instance is created when getInstance is called (only when needed)
//- constructor is made private instead of protected(can't be instantiated in the same package)
//- thread-safe (synchronized)
//- future proof if more than one instance is needed


