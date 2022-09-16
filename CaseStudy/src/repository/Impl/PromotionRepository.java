package repository.Impl;

import model.Customer;
import repository.IPromotionRepository;

import java.util.ArrayList;
import java.util.List;

public class PromotionRepository implements IPromotionRepository {
    private static List<Customer> customerUseServiceList = new ArrayList<>();
    private static List<Customer> customerGetVoucherList = new ArrayList<>();

    @Override
    public List<Customer> findAllUseService() {
        return customerUseServiceList;
    }

    @Override
    public List<Customer> findAllGetVoucher() {
        return customerGetVoucherList;
    }
}
