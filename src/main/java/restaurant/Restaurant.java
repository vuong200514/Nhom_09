package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<Branch> branches;

    public Restaurant(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public void printBranches() {
        System.out.println("Restaurant: " + name);
        for (Branch branch : branches) {
            System.out.println("Branch: " + branch.getName());
        }
    }
}
