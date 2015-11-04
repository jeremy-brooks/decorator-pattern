import com.decorator.Beverage;
import com.decorator.DarkRoast;
import com.decorator.Espresso;
import com.decorator.HouseBlend;
import com.decorator.extras.Milk;
import com.decorator.extras.Mocha;
import com.decorator.extras.Whip;

/**
 * Created by jbrooks on 04/11/2015.
 */
public class MakeSomeCoffees {
    public static void main(String args[]){

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.getCost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Milk(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.getCost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.getCost());

    }
}
