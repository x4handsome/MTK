public class VNStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType t){
        if(t==PizzaType.CaChua)
        {
            return  new PizzaVN();
        }
        if(t==PizzaType.Rau)
        {
            return new PizzaVN();
        }
        return null;
    }
}
