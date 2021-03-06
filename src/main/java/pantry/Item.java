package main.java.pantry;

import java.time.LocalDate;
import java.util.UUID;
import java.time.temporal.ChronoUnit;

public class Item {
    private String code;
    private String name;
    private double cost;
    private boolean plu = false;
    private LocalDate dateReceived;
    private double qty = 0;
    private UUID id;
    private LocalDate expDate;
    private boolean rental = false;

    public void setRental(Boolean f)
    {
        rental = f;
    }

    public void setName(String s){
        name = s; 
    }

    public void setUUID(UUID i)
    {
        id = i;
    }

    public void setPLU(Boolean a)
    {
        plu = a;
    }

    public void setCost(double p){
        cost = p;
    }

    public Boolean isPLU()
    {
        return plu;
    }

    public void setDateReceived(LocalDate d)
    {
        dateReceived = d;
    }

    public void setCode(String c){
        code = c;
    }

    public void setExpiryDate(LocalDate d){
        expDate = d;
    }

    public void setQty(double q){
        qty = q;
    }

    public String getCode()
    {
        return code;
    }

    public double getQty()
    {
        return qty;
    }

    public UUID getUUID()
    {
        return id;
    }

    public Boolean getRental()
    {
        return rental;
    }

    public String getName()
    {
        return name;
    }

    public double getCost()
    {
        return cost;
    }

    public LocalDate getExpDate()
    {
        return expDate;
    }

    public LocalDate getRecDate()
    {
        return dateReceived;
    }

    public int daysUntilExp()
    {
        long period = ChronoUnit.DAYS.between(dateReceived, expDate);
        return (int)period;
    }

    public void displayItem()
    {
        System.out.printf("%-15.15s  %-25.25s  %-15.15s  %-10.10s  %-10.10s  %-10.10s   %-10.10s%n", 
                code, name, cost, qty, dateReceived, expDate, rental);
    }
}
