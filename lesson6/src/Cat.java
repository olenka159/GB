//это подкласс Cat
public class Cat extends Animal {

    protected boolean sweem;
    int run;

//конструктор Cat

    public Cat(String name, int run, boolean sweem) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
    }

    //выводим информацию в консоль
    public void catInfo() {
        System.out.println("Имя:" + name + " /Бег:" + " meters/" + " /Плавание:" + sweem);
    }
}