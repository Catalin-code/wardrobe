public class Clothes {
    private int count = 0;
    private int id;
    private String brandname;
    private ClothesType type;

    public Clothes(String brandname, ClothesType type) {
        this.id = ++count;
        this.brandname = brandname;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getBrandname() {
        return brandname;
    }

    public ClothesType getType() {
        return type;
    }


    public enum ClothesType{
        SHIRT,
        BLOUSE,
        TROUSERS,
        SKIRT;
        public boolean isUpperClothes(){
            if (this == ClothesType.SHIRT || this == ClothesType.BLOUSE) return true;
            else return false;
        }

        public boolean isLowerClothes(){
            if (this == ClothesType.TROUSERS || this == ClothesType.SKIRT) return true;
            else return false;
        }
    }
}
