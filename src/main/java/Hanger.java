public abstract class Hanger {
    public abstract Clothes takeOff(int id);
    public abstract void put(Clothes clothes);
    public abstract boolean hasSlotFor(Clothes.ClothesType type);
}
