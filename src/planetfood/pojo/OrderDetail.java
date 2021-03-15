/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetfood.pojo;

/**
 *
 * @author HP
 */
public class OrderDetail {

    public String getOrdId() {
        return OrdId;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    public String getProdId() {
        return ProdId;
    }

    public void setProdId(String ProdId) {
        this.ProdId = ProdId;
    }


    private String OrdId;
    private String Quantity;
    private double Cost;
    private String ProdId;
    
}
