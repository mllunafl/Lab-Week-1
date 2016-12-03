/**
 * Created by LunaFlores on 12/2/16.
 */
public interface StringList {

    void add(String value);

    void replace(String value, int position);

    void remove(int position);

    String getValue (int position);

    int size();


}
