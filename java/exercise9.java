package java;

/*
Напиши класс AI, который бы:

при создании первого объекта выводил бы в консоль текст AI loaded!;
при создании каждого объекта выводил бы в консоль текст New AI created!.
В классе AI не должно быть ни одного конструктора.
 */

class AITest {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            new AI();
        }
    }
}
class AI{
    static {
        System.out.println("AI loaded!");
    }
    {
        System.out.println("New AI created!");
    }

}
