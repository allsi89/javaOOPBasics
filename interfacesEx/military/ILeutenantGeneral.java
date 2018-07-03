import java.util.List;
import java.util.Map;

public interface ILeutenantGeneral extends ISoldier{
    void addPrivates(List<String> items, Map<Integer, ISoldier> soldiers);
}
