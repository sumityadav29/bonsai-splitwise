package models;

import java.util.List;
import java.util.UUID;

public class Expense {
    private UUID uuid;
    private Group group;
    private User payer;
    private List<Payment> payments;
}
