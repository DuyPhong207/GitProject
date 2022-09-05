package Repository;

import Model.Contract;

import java.util.ArrayList;
import java.util.Scanner;

public class ContractRepositoryImpl implements ContractRepository {
    private ArrayList<Contract> contractList;
    Scanner sc = new Scanner(System.in);

    @Override
    public void createNewContract() {
        System.out.println("Enter contract number");
        String newContractNumber = sc.nextLine();
        System.out.println("Enter booking ID");
        String newBookingId = sc.nextLine();
        System.out.println("Enter money deposit");
        short newMoneyDeposit = sc.nextShort();
        System.out.println("Enter money pay");
        short newMoneyPay = sc.nextShort();
        System.out.println("Enter customer ID");
        String newCustomerId = sc.nextLine();
        Contract newContract = new Contract(newContractNumber, newBookingId, newMoneyDeposit, newMoneyPay, newCustomerId);
        this.contractList.add(newContract);
    }

    @Override
    public void displayListContract() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContract() {

    }
}
