import java.util.List;

public interface Restaran {


    abstract  void  create(List<Menu> menu);
    abstract  void remove(List<Menu>menu);
    abstract void getAll(List<Menu>menu);
    abstract void sortByPrice(List<Menu>menu);
    abstract void getByName(List<Menu>menu);
}
