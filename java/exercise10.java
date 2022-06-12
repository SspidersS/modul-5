package java;

/*
Напиши класс Distance, у которого есть конструктор Distance(int startX, int startY, int endX, int endY).
Этот конструктор принимает 4 параметра - координаты начальной точки (startX и startY),
и координаты конечной точки (endX и endY).

У класса также должен быть метод public int getDistance().
Он возвращает расстояние между точками, координаты которых переданы в конструктор.
Расстояние округляется по правилам математического округления, возвращается целый результат.

Примеры тестов
вызов new Distance(10, 10, 20, 20).getDistance() возвращает 14 (округлено от 14.142135623730951)
вызов new Distance(10, 10, 27, 25).getDistance() возвращает 23 (округлено от 22.67156809750927)
 */




class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}

class Distance{
    public int getDistance(){
        double x1 = startX;
        double y1 = startY;
        double x2 = endX;
        double y2 = endY;

        double distance1 = Math.abs(y2-y1);
        double distance2 = Math.abs(x2 -x1);

        return (int) Math.round(Math.sqrt((endX - startX) * (endX - startX) + (endY - startY) * (endY - startY)));

    }

//    public static void main(String[] args) {
//        new Person("Elon");
//        new Person("Elon", "Musk");

    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }



}
