import java.util.Objects;

public class Coffee extends Food {

    private String Aroma = "";


    private static int saturatedCoffeeAmount = 0;
    private static int bitterCoffeeAmount = 0;
    private static int orientalCoffeeAmount = 0;
    static final String Saturated = "saturated";
    static final String Bitter = "bitter";
    static final String Oriental = "oriental";

    public Coffee(String  aroma) throws InvalidColorException {
        this.Aroma =  aroma;
        this.name = "Coffee";

        switch ( aroma) {
            case (Saturated):
                this.calories = 100;
                saturatedCoffeeAmount++;
                break;
            case (Bitter):
                this.calories = 200;
                bitterCoffeeAmount++;
                break;
            case (Oriental):
                this.calories = 300;
                orientalCoffeeAmount++;
                break;
            default:
                throw new InvalidColorException("Invalid Coffee aroma");
        }
    }

    public int Amount() {
        return switch ( Aroma) {
            case (Saturated) -> saturatedCoffeeAmount;
            case (Bitter) -> bitterCoffeeAmount;
            case (Oriental) -> orientalCoffeeAmount;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return "Coffee{" +
                " aroma='" + Aroma + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public void consume() {
        System.out.println(Aroma + " " + name + " has been eaten.");
    }

   // @Override
   // public boolean equals(Object o) {
     //   if (this == o) return true;
     //   if (o == null || getClass() != o.getClass()) return false;
      //  Coffee coffee = (Coffee) o;
       // return Objects.equals(Aroma, Coffee.Aroma);
   // }

    @Override
    public int hashCode() {
        return Objects.hash(Aroma);
    }

    @Override
    public int calculateCalories() {
        return calories;
    }
}
