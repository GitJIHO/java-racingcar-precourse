import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Car {
    private static final int MOVENUM = 4;
    private final String name;
    private int position = 0;

    public Car(String name){
        if(name == null || name.isEmpty() || name.length() >5){
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 1자 이상 5자 이하만 가능합니다.");
        }
        this.name = name;
    }

    public void move(int randomNum){
        if(randomNum >= MOVENUM){
            position++;
        }
    }

    public static void CarDup(List<String> carNames){
        Set<String> carSet = new HashSet<>();
        for(String car : carNames){
            if(!carSet.add(car)){
                throw new IllegalArgumentException("[ERROR] 자동차 이름은 중복될 수 없습니다.");
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
