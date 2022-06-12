package java;

/*
В коде уже есть описанный класс Bullet.
Допиши в этот класс блок инициализации,
чтобы при каждом создании объекта типа Bullet в консоль выводился бы текст Bullet created!.
Не создавай ни одного конструктора в классе Bullet.
 */




class Bullet extends BulletTest{

    {
        System.out.println("Bullet created!");
    }
}

class BulletTest {
    public static void main(String[] args) {
        new Bullet();
        new Bullet();
    }
}
