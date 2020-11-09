public class PantsHanger extends Hanger {
    Clothes upper;
    Clothes lower;

    @Override
    public Clothes takeOff(int id) {
        if (upper.getId() == id){
            Clothes temp = upper;
            upper = null;
            System.out.printf("Clothing piece with id %d was taken off hanger %n", id);
            return temp;
        } else if (lower.getId() == id){
            Clothes temp = lower;
            lower = null;
            System.out.printf("Clothing piece with id %d was taken off hanger %n", id);
            return temp;
        }
        System.out.printf("Clothing piece with id %d is not on this hanger %n", id);
        return null;
    }

    @Override
    public void put(Clothes clothes) {
        if (hasSlotFor(clothes.getType())){
            if (clothes.getType().isUpperClothes()){
                upper = clothes;
            } else
                lower = clothes;
            System.out.printf("Clothing piece with id %d was placed on hanger %n", clothes.getId());
        } else {
            System.out.printf("Clothing piece with id %d was not place on the hanger %n", clothes.getId());
        }
    }

    @Override
    public boolean hasSlotFor(Clothes.ClothesType type) {
        if (upper == null && type.isUpperClothes() || lower == null && type.isLowerClothes()){
            return true;
        }
        return false;
    }
}
