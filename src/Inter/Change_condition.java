package Inter;

import java.util.HashSet;
import java.util.Set;

public interface Change_condition{
    Set<Condition> states = new HashSet<>();
    public void addCondition(Condition newCondition);

    // метод для удаления одного состояния
public void removeCondition(Condition stateToRemove);

    // метод для удаления всех состояний
public void clearStates();

    // метод для получения всех состояний
public Set<Condition> getStates();
}
