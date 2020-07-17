public abstract class Pizza {
    String name = "Unknown Pizza";

    public void prepare() {
        System.out.println(name + " is prepared");
    }

    public void bake() {
        System.out.println(name + " is baked");
    }

    public void cut() {
        System.out.println(name + " is cut");
    }

    public void box() {
        System.out.println(name + "is boxed");
    }
}
