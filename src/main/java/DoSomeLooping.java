import com.decorator.*;
import com.decorator.looping.GetFlattenedCollections;
import com.decorator.looping.Loop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jbrooks on 04/11/2015.
 */
public class DoSomeLooping {
    public static void main(String args[]){



        Beverage houseBlend = new HouseBlend();
        Beverage darkRoast = new DarkRoast();
        Beverage decaf = new Decaf();
        Beverage espresso = new Espresso();

        List<Beverage> drinks = new ArrayList<Beverage>();
        drinks.add(houseBlend);
        drinks.add(darkRoast);
        drinks.add(decaf);
        drinks.add(espresso);

        List<Beverage> copyOfDrinks = new ArrayList<Beverage>();
        Collections.copy(copyOfDrinks, drinks);

        List<List> things = new ArrayList<List>();
        things.add(drinks);
        things.add(copyOfDrinks);

        Loop flattenedCollection = new GetFlattenedCollections();

        List<Object> stuff = flattenedCollection.getFlattenedCollectionFromMultiDimCollection(things);

        System.out.println(stuff.toString());
    }
}
