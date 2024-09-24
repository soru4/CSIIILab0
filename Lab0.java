// name: Sohum Tambe
// date: 8/15/23
// per:  2

public class Lab0
{

    public Lab0()
    {
        // do not update the constructor
    }

    public  void display (int min, int max)
    {
        for(int i = min; i < max; i++){
        
            System.out.println(checkValue(i));
        }
    }

    public String checkValue(int value)
    {
        
         if(value % 3 == 0) return "Poke";
         if(value % 5 ==0) return "mon";
         if(value % 3 ==0 && value % 5 == 0) return "Pokemon";
       return "" + value;
    }
}
