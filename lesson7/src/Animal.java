class Animal {

    public int food;
    public Animal(int food) {
        this.food = food;
    }


    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }

    void info() {
        System.out.println("animal: " + food);
    }
}
