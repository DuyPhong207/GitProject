package repository.Impl;

import model.Contract;
import repository.IContractRepository;

import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository {
    private static List<Contract> contractList = new ArrayList<>();

    @Override
    public List<Contract> findAll() {
        return contractList;
    }

    @Override
    public void editContract(int index, Contract contract) {
        contractList.set(index, contract);
    }

    @Override
    public void createContract(Contract contract) {
        contractList.add(contract);
    }
}
