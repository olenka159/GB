//это подкласс Dog
class Dog extends Animal {

    public double run;
    public int sweem;

    //конструктор

    public Dog(String name, int run, int sweem) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
    }
    public void dogInfo() {
        System.out.println("Имя:" + name  + " /Бег:" + run+ " meters/" + " /Плавание:" + sweem);
    }
}