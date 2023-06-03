public  class PizzaVN extends Pizza{

    @Override
    public void prepare() {
        description.append("Rua rau, lay ca chua");
    }

    @Override
    public void bake() {
        description.append("Tron bot");
    }

    @Override
    public void cut() {
        description.append("Cat banh");
    }

    @Override
    public void box() {
        description.append("Dong hop");
    }
}
