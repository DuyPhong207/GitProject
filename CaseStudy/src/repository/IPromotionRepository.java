package repository;

import model.Customer;

import java.util.List;

public interface IPromotionRepository {
    List<Customer> findAllUseService();
    List<Customer> findAllGetVoucher();
}
