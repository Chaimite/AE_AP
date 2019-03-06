public class Station extends Segment
{
   final private int length = 100;
   private String name;
   final private int stop = 5;

   // Stations can have multiple trains at a time i.e. 3 trains at once
   public Station(String name, int capacity)
   {
      this.name = name;
      this.capacity = capacity;
   }

   public int stopTime(int speed)
   {
      int stopTime = length / speed + stop;
      return stopTime;
   }

   public String toString()
   {
      return "|----" + name + "----|";
   }

}
