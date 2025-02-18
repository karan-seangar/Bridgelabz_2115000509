// MealPlan interface
interface MealPlan {
    void displayMeal();
}

// Meal categories
class VegetarianMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal Selected");
    }
}

class KetoMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("Keto Meal Selected");
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void serveMeal() {
        mealType.displayMeal();
    }
}

// Generic Method
class MealGenerator {
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        meal.displayMeal();
    }
}

// Main class
public class MealPlanApp {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        vegMeal.serveMeal();
        MealGenerator.generateMealPlan(new KetoMeal());
    }
}
