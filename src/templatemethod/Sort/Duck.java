package templatemethod.Sort;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 20:57
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Duck implements Comparable<Duck> {
    String name;
    int weight;

    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return name + " weights " + weight;
    }

    /**
     * 实现compareTo方法
     * @param object 传入的Duck对象
     * @return  int值 代表比较结果
     */
    public int compareTo(Duck object){
        Duck otherDuck = object;
        if(this.weight < otherDuck.weight){
            return -1;
        }else if(this.weight == otherDuck.weight){
            return 0;
        }else {
            return 1;
        }
    }
}
