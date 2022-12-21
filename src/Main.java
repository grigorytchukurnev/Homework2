public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        var doc=8.0;
        System.out.println(doc);
        var cad=3.6;
        System.out.println(cad);
        var paper=763789;
        System.out.println(paper);
        doc = doc + 4;
        System.out.println(doc);
        cad = cad + 4;
        System.out.println(cad);
        paper = paper + 4;
        System.out.println(paper);
        doc = doc - 3.5;
        System.out.println(doc);
        cad = cad - 1.6;
        System.out.println(cad);
        paper = paper - 7639;
        System.out.println(paper);

    }
    public static void task2 () {
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog= frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task3() {
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightBoxers = weightSecondBoxer + weightFirstBoxer;
        System.out.println("общий вес боксеров " + weightBoxers + " кг");
        var differenceBetweenBoxers = weightSecondBoxer - weightFirstBoxer;
        System.out.println("разница между весами бойцов " + differenceBetweenBoxers + " кг");
        var betweenBoxers = weightSecondBoxer - weightFirstBoxer;
        System.out.println("разница между весами бойцов " + betweenBoxers + " кг");
        var differenceBoxers = weightSecondBoxer % weightFirstBoxer;
        System.out.println("второй боксер на " + differenceBoxers + " кг тяжелее первого");
        var allTime = 640;
        var oneWorkerTime = 8;
        var workers = allTime / oneWorkerTime;
        System.out.println("всего работников в компании - " + workers + " человек");
        var newWorkers = workers + 94;
        var employeeTime = newWorkers * oneWorkerTime;
        System.out.println("усли в компании работает " + newWorkers + " человек, то всего " + employeeTime + " часов работы может быть поделено между сотрудниками.");



    }
}