import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    List<Hanger> hangers = new ArrayList<>();
    public static int limit = 120;

    public void put(Hanger hanger){
        if (hangers.size() < limit){
            hangers.add(hanger);
            System.out.println("Hanger was added to the wardrobe.");
        } else System.out.println("There was no place to add the hanger in the wardrobe.");
    }

    public int count(){
        return hangers.size();
    }

    public Hanger getHanger(Clothes.ClothesType type){
        for (Hanger hanger : hangers){
            if (hanger.hasSlotFor(type)){
                return hanger;
            } else System.out.println("There are no empty hangers for your clothes.");
        }
        return null;
    }

    public Clothes getClothes(int id){
        for (Hanger hanger : hangers){
            if (hanger.takeOff(id) != null){
                return hanger.takeOff(id);
            }
        }
        System.out.println("Clothes not found.");
        return null;
    }
}
