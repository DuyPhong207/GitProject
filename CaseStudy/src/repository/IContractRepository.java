package repository;

import model.Contract;

import java.util.List;

public interface IContractRepository {
    List<Contract> findAll();
    void editContract(int index, Contract contract);
    void createContract(Contract contract);
}
