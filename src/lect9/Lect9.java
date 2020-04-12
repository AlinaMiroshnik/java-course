package lect9;

public class Lect9 {
    public static void main(String [] args){
        try {
            Plant plant = new Plant(1,"Blue,","SomeType");
        }
        catch (ColorExceprion colorExceprion){
            colorExceprion.printStackTrace();

        }catch (TypeException e){
            e.printStackTrace();
        }

        try {
            Plant plant = new Plant(1,"Some color", "Climbers");
        }
        catch (ColorExceprion colorExceprion){
            colorExceprion.printStackTrace();
        }catch (TypeException e){
            e.printStackTrace();
        }

        Plant[] plants = new Plant[5];
        try {
            plants[0] = new Plant(5,"Blue", "Bulbs");
            plants[1] = new Plant(7,"White", "Bulbs");
            plants[2] = new Plant(1,"Yellow", "Roses");
            plants[3] = new Plant(8,"Green", "Cactus");
            plants[4] = new Plant(9,"Blue", "Climbers");
            for (Plant plant:plants){
                System.out.println(plant);
            }
        }catch (ColorExceprion colorExceprion){
            colorExceprion.printStackTrace();
        }catch (TypeException e){
            e.printStackTrace();
        }
    }
}
