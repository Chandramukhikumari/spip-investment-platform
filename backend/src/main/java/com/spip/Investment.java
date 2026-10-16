package com.spip;
import jakarta.persistence.*;
import java.math.BigDecimal;
@Entity
public class Investment {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    private String ownerName;
    private String assetName;
    private String assetType;
    private BigDecimal amount;
    public Investment() {}
    public Investment(String ownerName, String assetName, String assetType, BigDecimal amount) {
        this.ownerName=ownerName; this.assetName=assetName; this.assetType=assetType; this.amount=amount;
    }
    public Long getId(){return id;} public String getOwnerName(){return ownerName;}
    public void setOwnerName(String v){ownerName=v;} public String getAssetName(){return assetName;}
    public void setAssetName(String v){assetName=v;} public String getAssetType(){return assetType;}
    public void setAssetType(String v){assetType=v;} public BigDecimal getAmount(){return amount;}
    public void setAmount(BigDecimal v){amount=v;}
}
