package java;

/*
Напиши класс для описания главного героя игры - Hero. У этого класса должны быть два поля:

поле name строкового типа. В этом поле будет храниться имя главного героя;
поле hp типа int. Здесь будет храниться количество оставшихся очков здоровья.
В классе Hero также допиши конструктор без параметров, который будет инициализировать поле name значением "Paratrooper",
а поле hp - значением 100.

Для полей name и hp напиши геттеры, сеттеры писать необязательно.

Примеры тестов
выполнение кода new Hero().getName() возвращает Paratrooper;
выполнение кода new Hero().getHp() возвращает 100
поля name и hp инициализируются в конструкторе
 */
/*
Допиши в классе Hero конструктор,
который принимает два параметра - имя главного героя, и число его жизней.
Задай полям name и hp значения этих параметров.
 */
/*
Сделай рефакторинг кода. Перепиши конструктор Hero() без параметров так,
чтобы он вызывал конструктор Hero(String, int) с параметрами, используя ключевое слово this.

   public ProgrammingLanguage() {
        this("Java");
    }
    public ProgrammingLanguage(String name) {
        this.name = name;
    }
}
 */
/*
Допиши конструктор Hero(String, int) так, чтобы он ограничивал значение поля hp диапазоном от 0 до 200 включительно.
 */
class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero();

        //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());
    }
}

class Hero {
    private String name;
    private int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Hero(String name, int hp) {
        if (hp < 0) {
            this.name = name;
            this.hp = 0;
        } else if (hp > 200) {
            this.name = name;
            this.hp = 200;
        } else {
            this.name = name;
            this.hp = hp;
        }
    }

    public Hero() {
        this("Paratrooper", 100);
    }

    public Hero(String paratrooper) {
    }
}

