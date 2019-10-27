package factoryMethod.idcard;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDcardFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDcard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        IDcard iDcard = (IDcard) product;
        owners.add(iDcard.getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
