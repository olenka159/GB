public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {new Cat("Вася", 50), new Cat("Барсик", 50), new Cat("Мурзик", 25), new Cat("Кузя", 5), new Cat("Kote", 1)};
// здесь вводим наполнение миски и программа автоматический определит какой из котов сможет наесться а какой нет.
        Animal animal = new Animal( 80);

        for (Cat cat : cats) {
            cat.eat(animal);
            cat.info();
        }
    }
}
