public class Main {

    public static void main(String[] args){
        Wardrobe wardrobe = new Wardrobe();
        Hanger shirtHanger1 = new ShirtHanger();
        Hanger shirtHanger2 = new ShirtHanger();
        Hanger shirtHanger3 = new ShirtHanger();
        Hanger pantsHanger1 = new PantsHanger();
        Hanger pantsHanger2 = new PantsHanger();
        Hanger pantsHanger3 = new PantsHanger();

        Clothes clothingPiece1 = new Clothes("Nike", Clothes.ClothesType.SHIRT);
        Clothes clothingPiece2 = new Clothes("Adidas", Clothes.ClothesType.BLOUSE);
        Clothes clothingPiece3 = new Clothes("Puma", Clothes.ClothesType.TROUSERS);
        Clothes clothingPiece4 = new Clothes("Reebok", Clothes.ClothesType.SKIRT);
        Clothes clothingPiece5 = new Clothes("Jordan", Clothes.ClothesType.SHIRT);
        Clothes clothingPiece6 = new Clothes("Champion", Clothes.ClothesType.TROUSERS);

        shirtHanger1.put(clothingPiece1);
        shirtHanger2.put(clothingPiece2);
        shirtHanger3.put(clothingPiece5);
        pantsHanger1.put(clothingPiece3);
        pantsHanger2.put(clothingPiece4);
        pantsHanger3.put(clothingPiece6);

        wardrobe.put(shirtHanger1);
        wardrobe.put(shirtHanger2);
        wardrobe.put(shirtHanger3);
        wardrobe.put(pantsHanger1);
        wardrobe.put(pantsHanger2);
        wardrobe.put(pantsHanger3);

        for (Hanger hanger : wardrobe.hangers){
            System.out.println(hanger.toString());
        }
    }
}
