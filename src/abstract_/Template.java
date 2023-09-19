package abstract_;

abstract public class Template { //抽象类-模板设计模式

    public abstract void job();//抽象方法

    public void calculateTime() {//实现方法，调用job方法
        //得到开始的时间
        long start = System.currentTimeMillis();
        job(); //动态绑定机制

        //得的结束的时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间 " + (end - start));


        /*模板方法是基于继承实现的，在抽象父类中声明一个模板方法，并在模板方法中定义算法的执行步骤（即算法骨架）。
        在模板方法模式中，可以将子类共性的部分放在父类中实现，而特性的部分延迟到子类中实现，
        只需将特性部分在父类中声明成抽象方法即可，
        使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤，不同的子类可以以不同的方式来实现这些逻辑。

        模板方法模式的优点在于符合“开闭原则”，也能够实现代码复用，将不变的行为转移到父类，
        去除子类中的重复代码。但是缺点是不同的实现都需要定义一个子类，导致类的个数的增加使得系统更加庞大，设计更加抽象。*/
    }
}
