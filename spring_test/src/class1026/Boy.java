package class1026;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 吕译辰
 * @date 2020/10/26 - 14:07
 */
public class Boy {
    private String name;
    private int age;
    private Dog dog;
    private String address;
    private Product product;
    private List list;
    private Map map;
    private List<Dog> dogList;
    private Set set;
    private Map<Integer,String> integerStringMap;
    public Boy() {

    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Map<Integer, String> getIntegerStringMap() {
        return integerStringMap;
    }

    public void setIntegerStringMap(Map<Integer, String> integerStringMap) {
        this.integerStringMap = integerStringMap;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
