
public class Dish implements Item{
    private Double cost;
    private String title;
    private String description;

    public Dish(String title, String description) {
        this.title = title;
        this.description = description;
        this.cost = 0.0;
    }

    public Dish(Double cost, String title, String description) {
        try{
            if(cost < 0){
                throw new IllegalArgumentException("Цена не может быть отрицательной");
            }
            else {
                this.title = title;
                this.description = description;
                this.cost = cost;
            }
        }catch (IllegalAccessError err){
            System.out.println("Цена не может быть отрицательной");
        }
    }

    public Dish() { }

    @Override
    public Double getCost() {
        return this.cost;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setCost(double cost){
        try {
            if(cost < 0){
                throw new IllegalArgumentException("Цена не может быть отрицательной");
            }
            else {
                this.cost = cost;
            }
        }catch (IllegalAccessError err){
            System.out.println("Цена не может быть отрицательной");
        }
    }

    @Override
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

}