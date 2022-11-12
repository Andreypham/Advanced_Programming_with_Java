package SS12_Collection_Framework.Exercise;

import java.util.Comparator;

public class CostComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getCostProduct() < o2.getCostProduct()){
            return 1;
        }else if(o1.getCostProduct() > o2.getCostProduct()){
            return -1;
        }else return 0;
    }
}
