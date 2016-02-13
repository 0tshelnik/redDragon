package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public  String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public  float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o)
    {
       /* if ((this.getName().equals(o.getName()) || !this.getName().equals(o.getName())) && this.getDistance() +  this.getQuality() ==  o.getQuality() + o.getDistance())
        {
            return 0;
        } else if ((!this.getName().equals(o.getName()) || this.getName().equals(o.getName())) && this.getDistance() +  this.getQuality() <  o.getQuality() + o.getDistance()) {
            return -1;
        } else //if (!this.getName().equals(o.getName()) && this.getDistance() > o.getDistance() && this.getQuality() > o.getQuality())
            return 1;*/
        int distIndex = (int) (distance - o.getDistance());
        int qualIndex = quality - o.getQuality();
        return 10000 * name.compareTo(o.getName()) + 100 * distIndex + qualIndex;
    }

    public static void main(String [] args) {
        Beach b = new Beach("awe", 150, 47);
        Beach b1 = new Beach("awe", 110, 38);
        Beach b2 = new Beach("awe1", 110, 38);

        System.out.println(b.compareTo(b1));
        System.out.println(b.compareTo(b2));
        System.out.println(b1.compareTo(b2));
        System.out.println(b1.compareTo(b));
    }
}
