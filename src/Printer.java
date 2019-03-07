
public class Printer implements Runnable
{
   private Segment routeStart;

   public Printer(Segment routeStart)
   {
      this.routeStart = routeStart;
   }

   @Override
   public void run()
   {
      while (true)
      {
         System.out.println(getRouteRepresentation());
         try
         {
            Thread.sleep(1000);
         }
         catch (InterruptedException e)
         {
            e.printStackTrace();
         }
      }

   }

   private String getRouteRepresentation()
   {
      Segment route = routeStart;
      String routeRepresentation = "";
      while (route != null)
      {
         routeRepresentation += route.toString();
         route = route.getNextSegment();
      }

      return routeRepresentation;
   }

}
